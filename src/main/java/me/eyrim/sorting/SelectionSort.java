package me.eyrim.sorting;

import java.util.Arrays;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public int[] sort(final int[] toSort) {
        int[] sorted = toSort.clone();

        for (int i = 0; i < toSort.length; i++) {
            // Find the smallest from the unsorted part of the array
            // then make the returned index line up with the entire array
            final int indexOfSmallest = findIndexOfSmallestElement(
                Arrays.copyOfRange(sorted, i, sorted.length)
            ) + i;

             sorted = swapValuesAt(sorted, indexOfSmallest, i);
        }

        return sorted;
    }

    public int findIndexOfSmallestElement(final int[] toSearch) {
        int currentSmallest = Integer.MAX_VALUE;
        int indexOfSmallest = -1;

        for (int i = 0; i < toSearch.length; i++) {
            if (toSearch[i] < currentSmallest) {
                currentSmallest = toSearch[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public int[] swapValuesAt(final int[] array, final int firstIndex, final int secondIndex) {
        final int[] arrayCopy = array.clone();
        final int temp = arrayCopy[firstIndex];

        arrayCopy[firstIndex] = arrayCopy[secondIndex];
        arrayCopy[secondIndex] = temp;

        return arrayCopy;
    }
}
