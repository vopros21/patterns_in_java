package eu.singledev.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopDownMergeSortTest {

    @Test
    void testSortIntArray() {
        Integer[] array = {6, 5, 12, 10, 9, 1};
        Integer[] expected = {1, 5, 6, 9, 10, 12};
        TopDownMergeSort.sortArray(array, Integer::compareTo);
        assertArrayEquals(expected, array);
    }

    @Test
    void testSortStringArray() {
        String[] array = {"dog", "cat", "apple", "banana"};
        String[] expected = {"apple", "banana", "cat", "dog"};
        TopDownMergeSort.sortArray(array, String::compareTo);
        assertArrayEquals(expected, array);
    }

    @Test
    void testEmptyArray() {
        Integer[] array = {};
        Integer[] expected = {};
        TopDownMergeSort.sortArray(array, Integer::compareTo);
        assertArrayEquals(expected, array);
    }

    @Test
    void testSingleElementArray() {
        Integer[] array = {5};
        Integer[] expected = {5};
        TopDownMergeSort.sortArray(array, Integer::compareTo);
        assertArrayEquals(expected, array);
    }

    @Test
    void testDuplicateElementsArray() {
        Integer[] array = {5, 2, 8, 2, 1};
        Integer[] expected = {1, 2, 2, 5, 8};
        TopDownMergeSort.sortArray(array, Integer::compareTo);
        assertArrayEquals(expected, array);
    }

    @Test
    void testNegativeNumbersArray() {
        Integer[] array = {5, -2, 8, -1};
        Integer[] expected = {-2, -1, 5, 8};
        TopDownMergeSort.sortArray(array, Integer::compareTo);
        assertArrayEquals(expected, array);
    }
}
