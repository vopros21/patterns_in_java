package eu.singledev.sorting;
/**
 * This class provides a method to sort an array of objects using the Selection Sort algorithm.
 * Selection Sort is a simple sorting algorithm that works by repeatedly finding the minimum element
 * from the unsorted part of the array and swapping it with the first unsorted element.
 *
 * @author Mike Kostenko
 * @version 0.1
 */
public class SelectionSort {

    /**
     * Sorts an array of objects in ascending order using the Selection Sort algorithm.
     * The array elements must implement the Comparable interface.
     *
     * @param source The array of objects to be sorted.
     * @return The sorted array.
     * @note This method sorts the array in-place, meaning it modifies the original array.
     */
    public static <T extends Comparable<T>> T[] sortArray(T[] source) {
        for (int i = 0; i < source.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < source.length; j++) {
                if (source[j].compareTo(source[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swapping logic
            T temp = source[minIndex];
            source[minIndex] = source[i];
            source[i] = temp;
        }
        return source;
    }
}


