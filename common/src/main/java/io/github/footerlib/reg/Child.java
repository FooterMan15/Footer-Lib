package io.github.footerlib.reg;

import java.util.Collection;
import java.util.function.Supplier;

public class Child<T> implements FMReg<T> {

    private final FMReg<T> reg;
    private final RegEntries<T> entries = new RegEntries<>();

    public Child(FMReg<T> reg) {
        this.reg = reg;
    }

    @Override
    public <I extends T> RegObj<I> reg(String id, Supplier<I> sup) {
        return this.entries.add(reg.reg(id, sup));
    }

    @Override
    public Collection<RegObj<T>> getEntries() {
        return entries.getEntries();
    }

    @Override
    public void init() {}
}
