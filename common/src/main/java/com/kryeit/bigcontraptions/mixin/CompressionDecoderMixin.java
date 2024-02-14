package com.kryeit.bigcontraptions.mixin;

import net.minecraft.network.CompressionDecoder;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CompressionDecoder.class)
public class CompressionDecoderMixin {

    @Mutable
    @Shadow @Final public static int MAXIMUM_COMPRESSED_LENGTH;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void onConstructorReturn(CallbackInfo ci) {
        MAXIMUM_COMPRESSED_LENGTH = 10 * 1024 * 1024;
    }
}