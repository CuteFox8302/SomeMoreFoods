package net.cutefox.somemorefoods;

import net.cutefox.somemorefoods.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeMoreFoods implements ModInitializer {
	public static final String MOD_ID = "somemorefoods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
