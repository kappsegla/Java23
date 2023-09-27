package org.example.utils;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class BooleanUtils {

    public static <T> boolean not(BooleanSupplier supplier) {
        return !supplier.getAsBoolean();
    }
}
