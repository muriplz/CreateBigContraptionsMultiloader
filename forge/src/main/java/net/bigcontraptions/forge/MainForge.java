package net.bigcontraptions.forge;

import net.bigcontraptions.Main;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
public class MainForge {
    public MainForge() {
        Main.init();
    }
}
