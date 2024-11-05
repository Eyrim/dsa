package me.eyrim;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.eyrim.sorting.BogoSort;
import me.eyrim.sorting.SelectionSort;
import me.eyrim.utils.SortUtils;
import me.eyrim.utils.Stopwatch;

public class SortingTest {
    private SelectionSort selectionSort;
    private BogoSort bogoSort;

    private Stopwatch stopwatch;
    private SortUtils sortUtils;

    @BeforeEach
    public void init() {
        this.selectionSort = new SelectionSort();
        this.bogoSort = new BogoSort();
        this.sortUtils = new SortUtils();
        this.stopwatch = new Stopwatch();
    }

    @Test
    // don't run this, it took 644961387 for 10 elements
    public void bogoSortEventuallyWorks() {
        final int[] inputArray = this.sortUtils.randomUnsortedArray(7);

        this.stopwatch.start();
        final int[] actual = this.bogoSort.sort(inputArray);
        this.stopwatch.finish();

        System.out.printf("Bogosort took %x seconds\n", this.stopwatch.inSeconds());

        Arrays.sort(inputArray);

        assertArrayEquals(inputArray, actual);

    }

    @Test
    // takes around 8 seconds for 100000 elements
    public void selectionSortMatchesStandardLibrarySort() {
        final int[] inputArray = this.sortUtils.randomUnsortedArray(100000);

        this.stopwatch.start();
        final int[] actual = this.selectionSort.sort(inputArray);
        this.stopwatch.finish();

        System.out.printf("Selection sort took %d seconds\n", this.stopwatch.inSeconds());

        Arrays.sort(inputArray);

        assertArrayEquals(inputArray, actual);
    }

    @Test
    public void indexOfSmallestElement() {
        final int[] randomArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0 };

        assertEquals(randomArray.length - 1, this.selectionSort.findIndexOfSmallestElement(randomArray));
    }

    @Test
    public void swapPlaces() {
        final int[] toSwapArray = { 1, 0 };
        final int[] swappedArray = { 0, 1 };

        assertArrayEquals(swappedArray, this.selectionSort.swapValuesAt(toSwapArray, 0, 1));
    }
}
