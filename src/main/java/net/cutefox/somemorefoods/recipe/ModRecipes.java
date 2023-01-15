package net.cutefox.somemorefoods.recipe;

import net.cutefox.somemorefoods.SomeMoreFoods;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(SomeMoreFoods.MOD_ID, BoilerRecipe.Serializer.ID),
                BoilerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(SomeMoreFoods.MOD_ID, BoilerRecipe.Type.ID),
                BoilerRecipe.Type.INSTANCE);
    }
}