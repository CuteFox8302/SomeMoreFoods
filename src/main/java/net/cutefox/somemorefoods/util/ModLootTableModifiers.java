package net.cutefox.somemorefoods.util;

import net.cutefox.somemorefoods.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier OAK_LOG_ID
            = new Identifier("minecraft", "blocks/oak_log");
    private static final Identifier DARK_OAK_LOG_ID
            = new Identifier("minecraft", "blocks/dark_oak_log");
    private static final Identifier BIRCH_LOG_ID
            = new Identifier("minecraft", "blocks/birch_log");
    private static final Identifier SPRUCE_LOG_ID
            = new Identifier("minecraft", "blocks/spruce_log");
    private static final Identifier JUNGLE_LOG_ID
            = new Identifier("minecraft", "blocks/jungle_log");
    private static final Identifier ACACIA_LOG_ID
            = new Identifier("minecraft", "blocks/acacia_log");
    private static final Identifier MANGROVE_LOG_ID
            = new Identifier("minecraft", "blocks/mangrove_log");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(OAK_LOG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.76f))
                        .with(ItemEntry.builder(ModItems.SAP))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 7.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(DARK_OAK_LOG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.76f))
                        .with(ItemEntry.builder(ModItems.SAP))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 7.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BIRCH_LOG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.76f))
                        .with(ItemEntry.builder(ModItems.SAP))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 7.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SPRUCE_LOG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.76f))
                        .with(ItemEntry.builder(ModItems.SAP))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 7.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(JUNGLE_LOG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.76f))
                        .with(ItemEntry.builder(ModItems.SAP))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 7.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ACACIA_LOG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.76f))
                        .with(ItemEntry.builder(ModItems.SAP))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 7.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(MANGROVE_LOG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.76f))
                        .with(ItemEntry.builder(ModItems.SAP))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 7.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
