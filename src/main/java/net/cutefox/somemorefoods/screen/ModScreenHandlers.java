package net.cutefox.somemorefoods.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<BoilerScreenHandler> BOILER_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        BOILER_SCREEN_HANDLER = new ScreenHandlerType<>(BoilerScreenHandler::new);
    }
}