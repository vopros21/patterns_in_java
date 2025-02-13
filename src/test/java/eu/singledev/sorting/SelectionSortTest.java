package eu.singledev.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    @Test
    void testAlreadySortedArray() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SelectionSort.sortArray(input));
    }

    @Test
    void testReverseSortedArray() {
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SelectionSort.sortArray(input));
    }

    @Test
    void testUnsortedArray() {
        Integer[] input = {3, 1, 4, 1, 5};
        Integer[] expected = {1, 1, 3, 4, 5};
        assertArrayEquals(expected, SelectionSort.sortArray(input));
    }

    @Test
    void testSingleElementArray() {
        Integer[] input = {42};
        Integer[] expected = {42};
        assertArrayEquals(expected, SelectionSort.sortArray(input));
    }

    @Test
    void testEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        assertArrayEquals(expected, SelectionSort.sortArray(input));
    }

    @Test
    void testArrayWithDuplicates() {
        Integer[] input = {4, 2, 4, 2};
        Integer[] expected = {2, 2, 4, 4};
        assertArrayEquals(expected, SelectionSort.sortArray(input));
    }

    @Test
    void testNegativeNumbers() {
        Integer[] input = {-3, -1, -4, -2};
        Integer[] expected = {-4, -3, -2, -1};
        assertArrayEquals(expected, SelectionSort.sortArray(input));
    }

    @Test
    void testMixedPositiveAndNegativeNumbers() {
        Integer[] input = {-1, 3, -2, 0};
        Integer[] expected = {-2, -1, 0, 3};
        assertArrayEquals(expected, SelectionSort.sortArray(input));
    }
}
