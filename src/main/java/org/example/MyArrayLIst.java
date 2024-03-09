package org.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Represents the implementation of ArrList and all its add, get, remove,clear methods.
 *
 * @param <T> The type of elements stored in this List
 */
public class MyArrayLIst<T> implements ArrList<T> {
    Object[] entities = new Object[0];

    /**
     * Replaces the element at the specified position in this list with
     * the specified element.
     *
     * @param element element to be saved sequentially
     */
    @Override
    public void add(T element) {
        this.entities = Arrays.copyOf(this.entities, this.entities.length + 1);
        this.entities[entities.length - 1] = element;
    }

    /**
     * checks whether there is such an index in the given list
     *
     * @param index the index we are checking
     * @return (true / false)
     */
    private boolean checkIndex(int index) {
        return index <= this.entities.length;
    }

    /**
     * adding an element to a given list at a given index
     *
     * @param index   position in this list where we want to add
     * @param element element to be stored at the specified position
     */
    @Override
    public void add(int index, T element) {
        this.entities[index] = element;
    }

    /**
     * getting an element from a given list by index
     *
     * @param index index under which the element is located
     * @return the entity of which is stored in List
     */
    @Override
    public T get(int index) {
        return (T) this.entities[index];
    }

    /**
     * method for removing an entity from List by passed index
     *
     * @param index index under which the element is located
     */
    @Override
    public void remove(int index) {
        Object[] entities1 = new Object[this.entities.length - 1];
        int a = 0;

        for (int i = 0; i < this.entities.length; i++) {
            if (i != index) {
                entities1[a] = this.entities[i];
                a++;
            }
        }
        this.entities = entities1;
    }

    /**
     * method to clear this list
     */
    @Override
    public void clear() {
        this.entities = new Object[0];
    }

    /**
     * number of elements in this list
     *
     * @return returns number
     */
    @Override
    public int size() {
        return this.entities.length;
    }

    /**
     * the method examines the entity
     *
     * @return string value
     */
    @Override
    public String toString() {
        return Arrays.toString(entities);
    }

    /**
     * sorts the given sheet using a comparator
     *
     * @param comparator Compares two arguments for order. Returns a negative integer, zero, or a positive integer.
     */
    @Override
    public void sort(Comparator<? super T> comparator) {
        QuickSort.quickSort((T[]) entities, 0, size() - 1, comparator);
    }

}
