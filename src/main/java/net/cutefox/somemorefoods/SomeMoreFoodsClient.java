package net.cutefox.somemorefoods;

import net.cutefox.somemorefoods.screen.BoilerScreen;
import net.cutefox.somemorefoods.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class SomeMoreFoodsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.BOILER_SCREEN_HANDLER, BoilerScreen::new);
    }
}
