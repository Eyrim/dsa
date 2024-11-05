package me.eyrim.utils;

import java.util.Arrays;

public class ArrayUtils {
    public void printArray(final int[] array) {
        Arrays.stream(array)
            .forEach(System.out::println);
    }
}
