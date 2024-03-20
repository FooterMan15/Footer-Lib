package io.github.footerlib.forge.reg;

import io.github.footerlib.reg.RegObj;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.RegistryObject;

public class ForgeRegObj<T> implements RegObj<T> {
    private final RegistryObject<T> obj;

    public ForgeRegObj(RegistryObject<T> obj) {
        this.obj = obj;
    }

    @Override
    public T get() {
        return obj.get();
    }

    @Override
    public ResourceLocation getID() {
        return obj.getId();
    }
}
