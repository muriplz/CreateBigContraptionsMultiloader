package com.kryeit.bigcontraptions.fabric;

import com.kryeit.bigcontraptions.Main;
import net.fabricmc.api.ModInitializer;

public class MainFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Main.init();
    }
}
