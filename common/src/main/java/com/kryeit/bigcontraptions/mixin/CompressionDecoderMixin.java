package com.kryeit.bigcontraptions.mixin;

import net.minecraft.network.CompressionDecoder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(CompressionDecoder.class)
public class CompressionDecoderMixin {

    @ModifyArgs(method = "<init>", at = @At("HEAD"))
    private static void modifyMaxCompressedLength(Args args) {
        // Find the constant value in the args and modify it
        for (int i = 0; i < args.size(); i++) {
            if (args.get(i) instanceof Integer && (int) args.get(i) == 2097152) {
                args.set(i, 10 * 1024 * 1024); // 10 MB
            }
        }
    }
}