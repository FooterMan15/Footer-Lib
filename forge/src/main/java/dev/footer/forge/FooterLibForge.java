package dev.footer.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.footer.FooterLib;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FooterLib.MOD_ID)
public class FooterLibForge {
    public FooterLibForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(FooterLib.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
    }
}
