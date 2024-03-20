package io.github.footerlib.forge;

import io.github.footerlib.FooterLib;
import net.minecraftforge.fml.common.Mod;

@Mod(FooterLib.MOD_ID)
public class FooterLibForge {
    public FooterLibForge() {
        FooterLib.init();
    }
}
