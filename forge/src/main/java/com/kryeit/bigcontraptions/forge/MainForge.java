package com.kryeit.bigcontraptions.forge;

import com.kryeit.bigcontraptions.Main;
import net.minecraftforge.fml.common.Mod;

@Mod(Main.MOD_ID)
public class MainForge {
    public MainForge() {
        Main.init();
    }
}
