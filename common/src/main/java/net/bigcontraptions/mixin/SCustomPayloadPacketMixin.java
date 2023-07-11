package net.bigcontraptions.mixin;

import net.minecraft.network.protocol.game.ServerboundCustomPayloadPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerboundCustomPayloadPacket.class)
public class SCustomPayloadPacketMixin {

    @ModifyConstant(method = {"<clinit>","getData"},constant = @Constant(intValue = 1048576))
    private static int bigPackets(int constant) {
        return 10000000;
    }
}
