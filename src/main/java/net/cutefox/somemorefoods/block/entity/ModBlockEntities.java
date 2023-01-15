package net.cutefox.somemorefoods.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.cutefox.somemorefoods.SomeMoreFoods;
import net.cutefox.somemorefoods.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<BoilerBlockEntity> BOILER;

    public static void registerBlockEntities() {
        BOILER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(SomeMoreFoods.MOD_ID, "boiler"),
                FabricBlockEntityTypeBuilder.create(BoilerBlockEntity::new,
                        ModBlocks.BOILER).build(null));
    }
}