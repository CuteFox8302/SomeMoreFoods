package net.cutefox.somemorefoods.item;

import net.cutefox.somemorefoods.SomeMoreFoods;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SAP = registerItem("sap",
            new Item(new FabricItemSettings().food(ModFoodComponents.SAP).group(ModItemGroup.SOME_MORE_FOODS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SomeMoreFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SomeMoreFoods.LOGGER.debug("Registering Mod Items for " + SomeMoreFoods.MOD_ID);
    }
}
