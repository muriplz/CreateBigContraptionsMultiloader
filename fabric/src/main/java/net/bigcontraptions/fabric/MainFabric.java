package net.bigcontraptions.fabric;

import net.bigcontraptions.Main;
import net.fabricmc.api.ModInitializer;

public class MainFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Main.init();
    }
}
