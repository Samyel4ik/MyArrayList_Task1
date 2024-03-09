package org.example;

import java.util.Comparator;

/**
 * this class sorts the given array
 * @param <T> The type of elements stored in this List
 */
public class QuickSort<T> {

    /**
     * sorts the given array from the specified low to the specified high
     * @param array
     * @param Low first element index
     * @param high last element index
     * @param comparator Compares two arguments for order. Returns a negative integer, zero, or a positive integer.
     * @param <T>The type of elements stored in this List
     */
    public static <T> void quickSort(T[] array, int Low, int high, Comparator<? super T> comparator) {
        int i, j;
        i = Low;
        j = high;
        T x, y;
        x = array[((Low + high / 2))];

        do {
            while ((comparator.compare(array[i], x) < 0) && (i < high)) {
                i++;
            }
            while ((comparator.compare(array[j], x) > 0) && (j > Low)) {
                j--;
            }

            if (i <= j) {

                swap(array, i, j);

                i++;
                j--;
            }

        } while (i <= j);
        if (Low < j) {
            quickSort(array, Low, j, comparator);
        }
        if (i < high) {
            quickSort(array, i, high, comparator);
        }
    }


    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
