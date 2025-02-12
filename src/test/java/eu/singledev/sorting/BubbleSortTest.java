package eu.singledev.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, BubbleSort.sortArray(input));
    }

    @Test
    void testReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, BubbleSort.sortArray(input));
    }

    @Test
    void testUnsortedArray() {
        int[] input = {3, 1, 4, 1, 5};
        int[] expected = {1, 1, 3, 4, 5};
        assertArrayEquals(expected, BubbleSort.sortArray(input));
    }

    @Test
    void testSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};
        assertArrayEquals(expected, BubbleSort.sortArray(input));
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, BubbleSort.sortArray(input));
    }

    @Test
    void testArrayWithDuplicates() {
        int[] input = {4, 2, 4, 2};
        int[] expected = {2, 2, 4, 4};
        assertArrayEquals(expected, BubbleSort.sortArray(input));
    }

    @Test
    void testNegativeNumbers() {
        int[] input = {-3, -1, -4, -2};
        int[] expected = {-4, -3, -2, -1};
        assertArrayEquals(expected, BubbleSort.sortArray(input));
    }

    @Test
    void testMixedPositiveAndNegativeNumbers() {
        int[] input = {-1, 3, -2, 0};
        int[] expected = {-2, -1, 0, 3};
        assertArrayEquals(expected, BubbleSort.sortArray(input));
    }
}
