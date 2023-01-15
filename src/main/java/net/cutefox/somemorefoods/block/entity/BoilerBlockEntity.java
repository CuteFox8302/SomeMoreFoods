package net.cutefox.somemorefoods.block.entity;

import net.cutefox.somemorefoods.block.custom.BoilerBlock;
import net.cutefox.somemorefoods.recipe.BoilerRecipe;
import net.cutefox.somemorefoods.screen.BoilerScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class BoilerBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;

    public BoilerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BOILER, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0: return BoilerBlockEntity.this.progress;
                    case 1: return BoilerBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: BoilerBlockEntity.this.progress = value; break;
                    case 1: BoilerBlockEntity.this.maxProgress = value; break;
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Boiler");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new BoilerScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("boiler.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("boiler.progress");
    }

    private void resetProgress() {
        this.progress = 0;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
        Direction localDir = this.getWorld().getBlockState(this.pos).get(BoilerBlock.FACING);

        if(side == Direction.UP) {
            return slot == 0;
        }

        if(side == Direction.DOWN) {
            return false;
        }

        return switch (localDir) {
            default ->
                    side.getOpposite() == Direction.NORTH && slot == 0 ||
                            side.getOpposite() == Direction.EAST && slot == 0 ||
                            side.getOpposite() == Direction.SOUTH && slot == 0 ||
                            side.getOpposite() == Direction.WEST && slot == 0;
            case EAST ->
                    side.rotateYClockwise() == Direction.NORTH && slot == 0 ||
                            side.rotateYClockwise() == Direction.EAST && slot == 0 ||
                            side.rotateYClockwise() == Direction.SOUTH && slot == 0 ||
                            side.rotateYClockwise() == Direction.WEST && slot == 0;
            case SOUTH ->
                    side == Direction.NORTH && slot == 0 ||
                            side == Direction.EAST && slot == 0 ||
                            side == Direction.SOUTH && slot == 0 ||
                            side == Direction.WEST && slot == 0;
            case WEST ->
                    side.rotateYCounterclockwise() == Direction.NORTH && slot == 0 ||
                            side.rotateYCounterclockwise() == Direction.EAST && slot == 0 ||
                            side.rotateYCounterclockwise() == Direction.SOUTH && slot == 0 ||
                            side.rotateYCounterclockwise() == Direction.WEST && slot == 0;
        };
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {
        Direction localDir = this.getWorld().getBlockState(this.pos).get(BoilerBlock.FACING);

        if(side == Direction.UP) {
            return false;
        }

        if(side == Direction.DOWN) {
            return slot == 1;
        }

        return switch (localDir) {
            default -> side.getOpposite() == Direction.SOUTH && slot == 1 ||
                    side.getOpposite() == Direction.EAST && slot == 1;
            case EAST -> side.rotateYClockwise() == Direction.SOUTH && slot == 1 ||
                    side.rotateYClockwise() == Direction.EAST && slot == 1;
            case SOUTH -> side == Direction.SOUTH && slot == 1 ||
                    side == Direction.EAST && slot == 1;
            case WEST -> side.rotateYCounterclockwise() == Direction.SOUTH && slot == 1 ||
                    side.rotateYCounterclockwise() == Direction.EAST && slot == 1;
        };
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, BoilerBlockEntity entity) {
        if(world.isClient()) {
            return;
        }

        if(hasRecipe(entity)) {
            entity.progress++;
            markDirty(world, blockPos, state);
            if(entity.progress >= entity.maxProgress) {
                craftItem(entity);
            }
        } else {
            entity.resetProgress();
            markDirty(world, blockPos, state);
        }
    }

    private static void craftItem(BoilerBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<BoilerRecipe> recipe = entity.getWorld().getRecipeManager()
                .getFirstMatch(BoilerRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if(hasRecipe(entity)) {
            entity.removeStack(0, 1);

            entity.setStack(1, new ItemStack(recipe.get().getOutput().getItem(),
                    entity.getStack(1).getCount() + 1));

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(BoilerBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<BoilerRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(BoilerRecipe.Type.INSTANCE, inventory, entity.getWorld());

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput().getItem());
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(1).getItem() == output || inventory.getStack(1).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(1).getMaxCount() > inventory.getStack(1).getCount();
    }
}