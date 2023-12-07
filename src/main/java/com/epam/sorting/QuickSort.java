package com.epam.sorting;

public class QuickSort {

    private int partition(Integer[] elements,Integer low,Integer high) {
        int pivot = elements[low];
        int i=low;
        int j = high;

        while (i < j) {
            do {
                i++;
            }while (elements[i] <= pivot);

            do {
                j--;
            }while (elements[j] > pivot);

            if(i < j) {
                int temp = elements[i];
                elements[i] = elements[j];
                elements[j] = temp;
            }
        }
        int temp = elements[low];
        elements[low] = elements[j];
        elements[j] = temp;
        return j;
    }
    public void sort(Integer low,Integer high,Integer[] elements) {
        if(low < high) {
            int mid = partition(elements,low,high);
            sort(low,mid,elements);
            sort(mid+1,high,elements);
        }
    }
}
