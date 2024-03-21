package io.github.footerlib.reg.fabric;

import io.github.footerlib.common.reg.fabric.FabricRegistry;
import io.github.footerlib.reg.FMReg;
import net.minecraft.core.Registry;

public class FMRegistriesImpl {
    public static <T> FMReg<T> create(Registry<T> reg, String id) {
        return new FabricRegistry<>(reg, id);
    }
}
