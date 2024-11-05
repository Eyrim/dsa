package me.eyrim.searching;

public class LinearSearch implements SearchingAlgorithm {
    @Override
    public <T> int find(final T[] toSearch, final T target) {
        for (int i = 0; i < toSearch.length; i++) {
            if (toSearch[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }
}
