package eu.singledev.searching;

public class LinearSearch {
    public static <T> T search(T[] array, T target) {
        for (T element : array) {
            if (element == null && target == null) {
                return null;
            }
            if (element != null && element.equals(target)) {
                return element;
            }
        }
        return null;
    }
}
