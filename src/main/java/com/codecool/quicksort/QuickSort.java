package com.codecool.quicksort;

import java.util.List;

public class QuickSort {

    /**
     * Sorts the given List in place
     * @param toSort the List to sort. Throws an error if its null
     */
    public void sort(List<Integer> toSort) {
        if (toSort == null) throw new IllegalArgumentException();
        if (toSort.size() <= 1) return;

        quickSort(toSort,0, toSort.size() - 1);
    }

    private void quickSort(List<Integer> toSort, int left, int right) {
        int i = left;
        int j = right;
        int pivot = toSort.get(left + (right - left) / 2);

        while (i <= j) {
            while (toSort.get(i) < pivot) i++;
            while (toSort.get(j) > pivot) j--;
            if (i <= j) {
                int temp = toSort.get(i);
                toSort.set(i, toSort.get(j));
                toSort.set(j, temp);
                i++;
                j--;
            }
        }
        if (left < j) { quickSort(toSort, left, j); }
        if (i < right) { quickSort(toSort, i, right); }
    }
}
