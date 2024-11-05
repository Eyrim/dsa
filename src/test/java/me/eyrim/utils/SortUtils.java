package me.eyrim.utils;

import java.util.Random;

public class SortUtils {
    /**
     * <pre>
     * Generates an array of random numbers length long
     *
     * Uses 0 as the lower bound and 9 as the upper bound
     * </pre>
     *
     * @param length The length of the desired array
     * @return integer array containing {@code length} numbers between 0 and 9
     */
    public int[] randomUnsortedArray(final int length) {
        final Random rand = new Random();

        return rand.ints(length, 0, 9).toArray();
    }
}
