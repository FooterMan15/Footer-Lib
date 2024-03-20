package io.github.footerlib.reg;

import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface FMReg<T> {
    <I extends T> RegObj<I> reg(String id, Supplier<I> sup);

    Collection<RegObj<T>> getEntries();

    default Stream<RegObj<T>> stream() {
        return getEntries().stream();
    }

    default Stream<T> boundStream() {
        return stream().map(RegObj::get);
    }

    void init();
}
