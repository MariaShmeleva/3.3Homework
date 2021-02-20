package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class SorterTest {
    @Test
    public void positiveSortTest() {
        int[] i = {15, 8, 27, 7, 96, 9, 7, 16, 37};
        int[] expectedArray = {7, 7, 8, 9, 15, 16, 27, 37, 96};
        Assertions.assertArrayEquals(expectedArray, Sorter.sort(i));
    }

    @Test
    public void negativeSortTest() {
        int[] i = {-15, -8, -27, -7, -96};
        int[] expectedArray = {-96, -27, -15, -8, -7};
        Assertions.assertArrayEquals(expectedArray, Sorter.sort(i));
    }

    @Test
    public void positiveNegativeSortTest() {
        int[] i = {-15, 8, -27, -7, 96, 9, 7, -16, 37};
        int[] expectedArray = {-27, -16, -15, -7, 7, 8, 9, 37, 96};
        Assertions.assertArrayEquals(expectedArray, Sorter.sort(i));
    }

    @Test
    public void notNullSortTest() {
        int[] i = {4, 5, 1, 7, 6, 2};
        Assertions.assertNotNull(i);
    }

    @Test
    public void isNullSortTest() {
        int[] i = null;
        Assertions.assertNull(i);
    }

    @Test
    public void sameSortTest() {
        int[] i = {7, 7, 7, 7, 7, 7};
        int[] expectedArray = {7, 7, 7, 7, 7, 7};
        Assertions.assertArrayEquals(expectedArray, Sorter.sort(i));
    }
}