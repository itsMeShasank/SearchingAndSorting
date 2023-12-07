package com.epam.sorting;

public class InsertionSort {
    public Integer[] doSort(Integer[] elements) {
        for(int i = 1; i <elements.length;i++) {
            int key = elements[i];
            int j = i-1;
            while(j >= 0 && elements[j] > key) {
                elements[j+1] = elements[j];
                j = j-1;
            }
            elements[j+1] = key;
        }
        return elements;
    }
}
