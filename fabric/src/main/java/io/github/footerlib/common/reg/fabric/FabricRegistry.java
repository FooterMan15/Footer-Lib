package io.github.footerlib.common.reg.fabric;

import io.github.footerlib.reg.FMReg;
import io.github.footerlib.reg.RegEntries;
import io.github.footerlib.reg.RegObj;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

import java.util.Collection;
import java.util.function.Supplier;

public class FabricRegistry<T> implements FMReg<T> {
    private final RegEntries<T> entries = new RegEntries<>();
    private final Registry<T> reg;
    private final String id;

    public FabricRegistry(Registry<T> reg, String id) {
        this.reg = reg;
        this.id = id;
    }

    @Override
    public <I extends T> RegObj<I> reg(String id, Supplier<I> sup) {
        return entries.add(FabricRegObj.of(this.reg, new ResourceLocation(this.id, id), sup));
    }

    @Override
    public Collection<RegObj<T>> getEntries() {
        return this.entries.getEntries();
    }

    @Override
    public void init() {}
}
