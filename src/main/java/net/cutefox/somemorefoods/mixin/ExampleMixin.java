package net.cutefox.somemorefoods.mixin;

import net.cutefox.somemorefoods.SomeMoreFoods;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {SomeMoreFoods.LOGGER.info("This line is printed by the somemorefoods mod mixin!");
	}
}
