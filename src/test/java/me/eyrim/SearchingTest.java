package me.eyrim;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.eyrim.searching.BinarySearch;
import me.eyrim.searching.LinearSearch;
import me.eyrim.utils.FileUtils;

public class SearchingTest {
    private String[] fileContent;
    private final String wordListFilePath = "/home/mfuller/Documents/ongoing/dsa/algo/algo/src/test/resources/word-list.txt";

    private LinearSearch linearSearch;
    private BinarySearch binarySearch;

    private FileUtils fileUtils;

    @BeforeEach
    public void setup() {
        this.linearSearch = new LinearSearch();
        this.binarySearch = new BinarySearch();

        this.fileUtils = new FileUtils();

        this.fileContent = this.fileUtils.readFileToArray(wordListFilePath);
    }

    @Test
    public void linearSearchCanFindElement() {
        final int expectedIndexOf = Arrays.binarySearch(fileContent, "asparagus");
        final int actualIndexOf = this.linearSearch.find(fileContent, "asparagus");

        assertEquals(expectedIndexOf, actualIndexOf);
    }

    @Test
    public void binarySearchCanFindElement() {
        final int expectedIndexOf = Arrays.binarySearch(fileContent, "asparagus");
        final int actualIndexOf = this.binarySearch.find(fileContent, "asparagus");

        System.out.printf("index of asparagus is: %d", expectedIndexOf);
        System.out.printf("found index of asparagus is: %d", actualIndexOf);

        assertEquals(expectedIndexOf, actualIndexOf);
    }
}
