package net.cutefox.somemorefoods.block;

import net.cutefox.somemorefoods.SomeMoreFoods;
import net.cutefox.somemorefoods.block.custom.BoilerBlock;
import net.cutefox.somemorefoods.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BOILER = registerBlock("boiler",
            new BoilerBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().nonOpaque()), ModItemGroup.SOME_MORE_FOODS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(SomeMoreFoods.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(SomeMoreFoods.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        SomeMoreFoods.LOGGER.debug("Registering Mod Blocks for " + SomeMoreFoods.MOD_ID);
    }
}
