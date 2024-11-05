package me.eyrim.searching;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch implements SearchingAlgorithm {
    private Integer lengthOfOriginal = null;

    @Override
    public <T> int find(final T[] toSearch, final T target) {
        if (this.lengthOfOriginal == null) {
            this.lengthOfOriginal = toSearch.length;
        }


        final int pivot = toSearch.length / 2;
        final Comparator<T> stringComparator = Comparator.comparing(T::toString);
        int indexOfMatch;

        if (toSearch[pivot].equals(target)) {
            // Arrays.stream(toSearch)
            // .forEach(System.out::println);
            return pivot + this.lengthOfOriginal;
        }
        // will never be equal to zero
        if (stringComparator.compare(toSearch[pivot], target) < 0) {
            final T[] rightSide = Arrays.copyOfRange(toSearch, pivot, toSearch.length);

            indexOfMatch = find(rightSide, target);
        } else {
            final T[] leftSide = Arrays.copyOfRange(toSearch, 0, pivot);

            indexOfMatch = find(leftSide, target);
        }

        if (toSearch.length == 1) {
            return -1;
        } else {
            return indexOfMatch;
        }
    }
}
