package com.codecool.quicksort;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Use the tests to check your code!
        QuickSort quickSort = new QuickSort();

        List<Integer> toSort = Arrays.asList(5, 3, 1, 5, 9, 3, 2, 10, 6);
        quickSort.sort(toSort);
        for (int i: toSort) {
            System.out.println(i + " ");
        }
    }

}
