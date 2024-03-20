package io.github.footerlib.reg;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.Registry;
import org.apache.commons.lang3.NotImplementedException;

public class FMRegistries {

    public static <T> FMReg<T> create(FMReg<T> reg) {
        return new Child<>(reg);
    }

    @ExpectPlatform
    public static <T> FMReg<T> create(Registry<T> reg, String id) {
        throw new NotImplementedException();
    }
}
