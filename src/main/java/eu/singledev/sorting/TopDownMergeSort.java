package eu.singledev.sorting;

import java.lang.reflect.Array;
import java.util.Comparator;

/**
 * This class provides a top-down merge sort implementation. It sorts arrays of any type
 * using a comparator to define the sorting order.
 *
 * @author Mike Kostenko
 * @version 1.0
 */
public class TopDownMergeSort {

    /**
     * Sorts the given array using the top-down merge sort algorithm.
     * This method is the entry point for sorting; it calls the recursive helper method.
     *
     * @param array      The array to be sorted.
     * @param comparator The comparator used to compare elements in the array.
     * @param <T>        The type of elements in the array.
     */
    public static <T> void sortArray(T[] array, Comparator<T> comparator) {
        mergeSortHelper(array, 0, array.length - 1, comparator);
    }

    /**
     * Recursive helper method to perform the merge sort.
     * This method divides the array into smaller sub-arrays until each contains one element,
     * then merges these sub-arrays back together in sorted order.
     *
     * @param array      The array being sorted.
     * @param left       The starting index of the current sub-array.
     * @param right      The ending index of the current sub-array.
     * @param comparator The comparator used to compare elements.
     * @param <T>        The type of elements in the array.
     */
    private static <T> void mergeSortHelper(T[] array, int left, int right, Comparator<T> comparator) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort the left and right halves
            mergeSortHelper(array, left, mid, comparator);
            mergeSortHelper(array, mid + 1, right, comparator);

            // Merge the sorted halves
            merge(array, left, mid, right, comparator);
        }
    }

    /**
     * Merges two sorted sub-arrays into one sorted sub-array.
     * This method is used by the merge sort algorithm to combine sorted parts of the array.
     *
     * @param array      The original array being sorted.
     * @param left       The starting index of the left sub-array.
     * @param mid        The ending index of the left sub-array.
     * @param right      The ending index of the right sub-array.
     * @param comparator The comparator used to compare elements.
     * @param <T>        The type of elements in the array.
     */
    private static <T> void merge(T[] array, int left, int mid, int right, Comparator<T> comparator) {
        // Create temporary arrays
        @SuppressWarnings("unchecked")
        T[] leftArray = (T[]) Array.newInstance(array.getClass().getComponentType(), mid - left + 1);
        @SuppressWarnings("unchecked")
        T[] rightArray = (T[]) Array.newInstance(array.getClass().getComponentType(), right - mid);

        // Copy data to temporary arrays
        System.arraycopy(array, left, leftArray, 0, leftArray.length);
        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        while (i < leftArray.length && j < rightArray.length) {
            if (comparator.compare(leftArray[i], rightArray[j]) <= 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[], if there are any
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[], if there are any
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
