package net.coderbot.iris.mixin.texture;

import net.coderbot.iris.texture.format.TextureFormatLoader;
import net.coderbot.iris.texture.pbr.PBRTextureManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.profiling.ProfilerFiller;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@Mixin(TextureManager.class)
public class MixinTextureManager {
	@Inject(method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/util/profiling/ProfilerFiller;Lnet/minecraft/util/profiling/ProfilerFiller;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", at = @At("TAIL"))
	private void iris$onTailReloadLambda(PreparableReloadListener.PreparationBarrier p_118476_, ResourceManager resourceManager, ProfilerFiller p_118478_, ProfilerFiller p_118479_, Executor p_118480_, Executor p_118481_, CallbackInfoReturnable<CompletableFuture<Void>> cir) {
		TextureFormatLoader.reload(resourceManager);
		PBRTextureManager.INSTANCE.clear();
	}

	@Inject(method = "close()V", at = @At("TAIL"))
	private void iris$onTailClose(CallbackInfo ci) {
		PBRTextureManager.INSTANCE.close();
	}
}
