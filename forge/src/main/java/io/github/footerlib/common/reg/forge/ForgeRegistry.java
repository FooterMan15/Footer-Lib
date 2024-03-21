package io.github.footerlib.common.reg.forge;

import io.github.footerlib.reg.FMReg;
import io.github.footerlib.reg.RegEntries;
import io.github.footerlib.reg.RegObj;
import net.minecraft.core.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

import java.util.Collection;
import java.util.function.Supplier;

public class ForgeRegistry<T> implements FMReg<T> {
    private final DeferredRegister<T> register;
    private final RegEntries<T> entries = new RegEntries<>();

    public ForgeRegistry(Registry<T> reg, String id) {
        this.register = DeferredRegister.create(reg.key(), id);
    }

    @Override
    public <I extends T> RegObj<I> reg(String id, Supplier<I> sup) {
        return this.entries.add(new ForgeRegObj<>(register.register(id, sup)));
    }

    @Override
    public Collection<RegObj<T>> getEntries() {
        return this.entries.getEntries();
    }

    @Override
    public void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        register.register(bus);
    }
}
