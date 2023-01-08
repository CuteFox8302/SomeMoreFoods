package net.cutefox.somemorefoods.item;

import net.cutefox.somemorefoods.SomeMoreFoods;
import net.cutefox.somemorefoods.item.custom.MapleSyrupItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Mod Ingredients
    public static final Item MAPLE_SYRUP = registerItem("maple_syrup",
            new MapleSyrupItem(new FabricItemSettings().food(ModFoodComponents.MAPLE_SYRUP).group(ModItemGroup.SOME_MORE_FOODS)));

    public static final Item SAP = registerItem("sap",
            new Item(new FabricItemSettings().food(ModFoodComponents.SAP).group(ModItemGroup.SOME_MORE_FOODS)));

    public static final Item BLUEBERRY = registerItem("blueberry",
            new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY).group(ModItemGroup.SOME_MORE_FOODS)));

    public static final Item CHOCOLATE_CHIP = registerItem("chocolate_chip",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_CHIP).group(ModItemGroup.SOME_MORE_FOODS)));
    //Waffle Waffle
    public static final Item WAFFLE_WAFFLE = registerItem("waffle_waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE_WAFFLE)));
    //Plain Waffle
    public static final Item WAFFLE = registerItem("waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE).group(ModItemGroup.SOME_MORE_FOODS)));
    public static final Item FROZEN_WAFFLE = registerItem("frozen_waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.FROZEN_WAFFLE).group(ModItemGroup.SOME_MORE_FOODS)));
    public static final Item WAFFLE_WITH_SYRUP = registerItem("waffle_with_syrup",
            new Item(new FabricItemSettings().food(ModFoodComponents.WAFFLE_WITH_SYRUP).group(ModItemGroup.SOME_MORE_FOODS)));
    public static final Item FROZEN_WAFFLE_WITH_SYRUP = registerItem("frozen_waffle_with_syrup",
            new Item(new FabricItemSettings().food(ModFoodComponents.FROZEN_WAFFLE_WITH_SYRUP).group(ModItemGroup.SOME_MORE_FOODS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SomeMoreFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SomeMoreFoods.LOGGER.debug("Registering Mod Items for " + SomeMoreFoods.MOD_ID);
    }
}
