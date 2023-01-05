package net.coderbot.iris.mixin;

import net.coderbot.iris.uniforms.CapturedRenderingState;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.material.FogType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FogRenderer.class)
public class MixinFogRenderer {
	@Shadow private static float fogRed, fogGreen, fogBlue;

	@Inject(method = "setupFog(Lnet/minecraft/client/Camera;Lnet/minecraft/client/renderer/FogRenderer$FogMode;FZF)V", at = @At("HEAD"), remap = false)
	private static void iris$setupLegacyWaterFog(Camera camera, FogRenderer.FogMode p_109026_, float p_109027_, boolean p_109028_, float partialTicks, CallbackInfo ci) {
		if (camera.getFluidInCamera() == FogType.WATER) {
			Entity entity = camera.getEntity();

			float density = 0.05F;

			if (entity instanceof LocalPlayer) {
				LocalPlayer localPlayer = (LocalPlayer)entity;
				density -= localPlayer.getWaterVision() * localPlayer.getWaterVision() * 0.03F;
				Holder<Biome> biome = localPlayer.level.getBiome(localPlayer.blockPosition());

				if (Biome.getBiomeCategory(biome) == Biome.BiomeCategory.SWAMP) {
					density += 0.005F;
				}
			}

			CapturedRenderingState.INSTANCE.setFogDensity(density);
		} else {
			CapturedRenderingState.INSTANCE.setFogDensity(-1.0F);
		}
	}

	@Inject(method = "setupColor", at = @At("TAIL"))
	private static void render(Camera camera, float tickDelta, ClientLevel level, int i, float f, CallbackInfo ci) {
		CapturedRenderingState.INSTANCE.setFogColor(fogRed, fogGreen, fogBlue);
	}
}
