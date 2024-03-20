package io.github.footerlib.fabric;

import io.github.footerlib.FooterLib;
import net.fabricmc.api.ModInitializer;

public class FooterLibFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FooterLib.init();
    }
}
