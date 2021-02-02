package dev.frankheijden.insights.api.utils;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {

    private MapUtils() {}

    /**
     * Converts a sequence of key-value pairs into a map.
     */
    @SafeVarargs
    public static <T> Map<T, T> toMap(T... objects) {
        if (objects.length % 2 != 0) throw new IllegalArgumentException("Must be a multiple of two");
        Map<T, T> map = new HashMap<>(objects.length >> 1);
        for (int i = 0; i < objects.length; i += 2) {
            map.put(objects[i], objects[i + 1]);
        }
        return map;
    }
}
