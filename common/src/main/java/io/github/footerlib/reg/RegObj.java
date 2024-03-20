package io.github.footerlib.reg;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public interface RegObj<T> extends Supplier<T> {
    @Override
    T get();

    ResourceLocation getID();
}
