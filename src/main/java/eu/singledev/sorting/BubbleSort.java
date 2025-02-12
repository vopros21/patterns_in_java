package eu.singledev.sorting;

public class BubbleSort {
    public static int[] sortArray(int[] source) {
        boolean moved = true;
        while (moved) {
            moved = false;
            for (int i = 0; i < source.length - 1; i++) {
                if (source[i] > source[i+1]) {
                    moved = true;
                    int tmp = source[i];
                    source[i] = source[i+1];
                    source[i+1] = tmp;
                }
            }
        }
        return source;
    }
}
