package me.eyrim.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BogoSort implements SortingAlgorithm {
    private final static SelectionSort selectionSort = new SelectionSort();

    @Override
    public int[] sort(final int[] toSort) {
        int tries = 0;
        int[] potentiallySortedArray = toSort;

        while (!Arrays.equals(selectionSort.sort(toSort), potentiallySortedArray)) {
            potentiallySortedArray = shuffleArray(toSort);
            tries += 1;
        }

        System.out.println("Bogosort tried " + tries + " times");
        return potentiallySortedArray;
    }

    private int[] shuffleArray(final int[] toShuffle) {
        final int[] shuffledArray = new int[toShuffle.length];
        final Random rand = new Random();
        int newIndex;
        final List<Integer> previouslyUsedIndexes = new ArrayList<>(toShuffle.length);

        for (int i = 0; i < toShuffle.length; i++) {
            newIndex = newIndex(rand, toShuffle.length);

            while (previouslyUsedIndexes.contains(newIndex)) {
                newIndex = newIndex(rand, toShuffle.length);
            }

             shuffledArray[newIndex] = toShuffle[i];
        }
        //
        //Arrays.stream(shuffledArray)
        //    .forEach(System.out::println);
        //
        //System.out.println("-".repeat(10));

        return shuffledArray;
    }

    private int newIndex(final Random rand, final int upperBound) {
        return rand.nextInt(0, upperBound);
    }
}
