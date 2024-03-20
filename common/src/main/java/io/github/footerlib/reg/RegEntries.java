package io.github.footerlib.reg;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

/* FooterLib Registries inspired by ResourcefulLib. */
public class RegEntries<T> {
    private final List<RegObj<T>> entries = new ArrayList<>();

    public <I extends T> RegObj<I> add(RegObj<I> entry) {
        entries.add((RegObj<T>) entry);
        return entry;
    }

    public List<RegObj<T>> getEntries() {
        return ImmutableList.copyOf(entries);
    }
}
