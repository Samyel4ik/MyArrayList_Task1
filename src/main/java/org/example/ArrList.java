package org.example;

import java.util.Comparator;

/**
 * an interface that helps create a collection with the main methods that are implemented in the ArrayList collection
 *
 * @param <T>The type of elements stored in this List
 */
public interface ArrList<T> {
    /**
     * Replaces the element at the specified position in this list with
     * the specified element.
     *
     * @param element element to be saved sequentially
     */
    void add(T element);

    /**
     * adding an element to a given list at a given index
     *
     * @param index   position in this list where we want to add
     * @param element element to be stored at the specified position
     */
    void add(int index, T element);

    /**
     * getting an element from a given list by index
     *
     * @param index index under which the element is located
     * @return the entity of which is stored in List
     */
    T get(int index);

    /**
     * method for removing an entity from List by passed index
     *
     * @param index index under which the element is located
     */
    void remove(int index);

    /**
     * method to clear this list
     */
    void clear();

    /**
     * number of elements in this list
     *
     * @return returns number
     */
    int size();

    /**
     * sorts the given sheet using a comparator
     *
     * @param comparator Compares two arguments for order. Returns a negative integer, zero, or a positive integer.
     */
    void sort(Comparator<? super T> comparator);
}
