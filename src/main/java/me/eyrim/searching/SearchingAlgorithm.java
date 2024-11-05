package me.eyrim.searching;

public interface SearchingAlgorithm {
    /**
     * <pre>
     * Find the index of a given element in the array, returns -1 if no element found
     * </pre>
     * @param toSearch The array to search through
     * @param target The value to search for, compared using <code>.equals</code>
     */
    public abstract <T> int find(final T[] toSearch, final T target);
}
