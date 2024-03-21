package io.github.footerlib.reg.forge;

import io.github.footerlib.common.reg.forge.ForgeRegistry;
import io.github.footerlib.reg.FMReg;
import net.minecraft.core.Registry;

public class FMRegistriesImpl {
    public static <T> FMReg<T> create(Registry<T> reg, String id) {
        return new ForgeRegistry<>(reg, id);
    }
}
