package org.example;

import org.junit.Test;

import java.util.Comparator;

import static junit.framework.TestCase.assertEquals;


public class MyArrayLIstTest {
    /**
     * a test that allows you to check the addition of an element
     */
    @Test
    public void add() {
        MyArrayLIst<Integer> actualList = new MyArrayLIst<>();
        actualList.add(2);
        actualList.add(6);
        actualList.add(9);
        actualList.add(15);
        int a = actualList.get(0);
        int b = actualList.get(1);
        int c = actualList.get(2);
        int d = actualList.get(3);

        assertEquals(a, 2);
        assertEquals(b, 6);
        assertEquals(c, 9);
        assertEquals(d, 15);

        assertEquals(actualList.size(), 4);
    }

    /**
     * a test that allows you to check whether an element is retrieved by index
     */
    @Test
    public void get() {
        MyArrayLIst<String> actualList = new MyArrayLIst<>();
        actualList.add("A");
        actualList.add("B");
        actualList.add("C");
        actualList.add("D");
        String a = actualList.get(0);
        String b = actualList.get(1);
        String c = actualList.get(2);
        String d = actualList.get(3);

        assertEquals(a, "A");
        assertEquals(b, "B");
        assertEquals(c, "C");
        assertEquals(d, "D");
    }

    /**
     * a test that allows you to check the deletion of an element by index
     */
    @Test
    public void remove() {
        MyArrayLIst<Integer> actualList = new MyArrayLIst<>();
        actualList.add(2);
        actualList.add(6);
        actualList.add(9);
        actualList.add(15);

        actualList.remove(0);
        assertEquals(actualList.size(), 3);

        int actual = actualList.get(0);
        assertEquals(actual, 6);


    }

    /**
     * a test that allows you to check the cleanliness of a given sheet
     */
    @Test
    public void clear() {
        MyArrayLIst<Integer> actualList = new MyArrayLIst<>();
        actualList.add(2);
        actualList.add(6);
        actualList.add(9);
        actualList.add(15);

        actualList.clear();
        assertEquals(actualList.size(), 0);
    }

    /**
     * a test that allows you to check the number of elements in a given sheet
     */
    @Test
    public void size() {
        MyArrayLIst<Integer> actualList = new MyArrayLIst<>();
        actualList.add(2);
        actualList.add(6);
        actualList.add(9);
        actualList.add(15);

        assertEquals(actualList.size(), 4);
    }

    /**
     * a test that allows you to check sorting using a comparator
     */
    @Test
    public void sort() {
        MyArrayLIst<Integer> actualList = new MyArrayLIst<>();
        actualList.add(2);
        actualList.add(1);
        actualList.add(4);
        actualList.add(7);

        actualList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        int a0 = actualList.get(0);
        int a1 = actualList.get(1);
        int a2 = actualList.get(2);
        int a3 = actualList.get(3);

        assertEquals(a0, 1);
        assertEquals(a1, 2);
        assertEquals(a2, 4);
        assertEquals(a3, 7);
    }
}