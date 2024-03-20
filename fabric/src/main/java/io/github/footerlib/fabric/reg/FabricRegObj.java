package io.github.footerlib.fabric.reg;

import io.github.footerlib.reg.RegObj;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class FabricRegObj<T> implements RegObj<T> {
    private final ResourceLocation id;
    private final T val;

    private FabricRegObj(ResourceLocation id, T val) {
        this.id = id;
        this.val = val;
    }

    public static <T,I extends T> FabricRegObj<I> of(Registry<T> reg, ResourceLocation id, Supplier<I> sup) {
        return new FabricRegObj<>(id, Registry.register(reg, id, sup.get()));
    }

    @Override
    public T get() {
        return this.val;
    }

    @Override
    public ResourceLocation getID() {
        return this.id;
    }
}
