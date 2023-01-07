package net.cutefox.somemorefoods.item;

import net.cutefox.somemorefoods.SomeMoreFoods;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SOME_MORE_FOODS = FabricItemGroupBuilder.build(
            new Identifier(SomeMoreFoods.MOD_ID, "some_more_foods"), () -> new ItemStack(ModItems.SAP));
}
