package net.cutefox.somemorefoods;

import net.cutefox.somemorefoods.block.ModBlocks;
import net.cutefox.somemorefoods.block.entity.ModBlockEntities;
import net.cutefox.somemorefoods.item.ModItems;
import net.cutefox.somemorefoods.recipe.ModRecipes;
import net.cutefox.somemorefoods.screen.ModScreenHandlers;
import net.cutefox.somemorefoods.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeMoreFoods implements ModInitializer {
	public static final String MOD_ID = "somemorefoods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerAllScreenHandlers();
		ModRecipes.registerRecipes();
		ModLootTableModifiers.modifyLootTables();
	}
}
