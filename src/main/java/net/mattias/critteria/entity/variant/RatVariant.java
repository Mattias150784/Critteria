
package net.mattias.critteria.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum RatVariant {
    GRAY(0),
    BLACK(1),
    BROWN(2);

    private static final RatVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(RatVariant::getId)).toArray(RatVariant[]::new);
    private final int id;

    RatVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static RatVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
