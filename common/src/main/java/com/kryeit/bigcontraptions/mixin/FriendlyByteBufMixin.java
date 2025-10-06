package com.kryeit.bigcontraptions.mixin;

import net.minecraft.network.FriendlyByteBuf;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FriendlyByteBuf.class)
public class FriendlyByteBufMixin {

    @ModifyConstant(method = "readNbt(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/nbt/CompoundTag;", constant = @Constant(longValue = 2097152L))
    private static long bigPackets(long constant) {
        return 10 * 1024 * 1024;
    }
}