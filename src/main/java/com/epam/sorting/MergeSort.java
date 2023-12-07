package com.epam.sorting;

public class MergeSort {
    public void merge(Integer low,Integer mid,Integer high,Integer[] numbers) {

        int i = low;
        int j = mid+1;
        int k=low;
        Integer[] sortedElements = new Integer[100];

        while(i <= mid && j <= high) {
            if(numbers[i] <= numbers[j]) {
                sortedElements[k++] = numbers[i++];
            }else {
                sortedElements[k++] = numbers[j++];
            }
        }
        while (i <= mid) {
            sortedElements[k++] = numbers[i++];
        }
        while (j <= high) {
            sortedElements[k++] = numbers[j++];
        }
        for(k = low; k<=high;k++) {
            numbers[k] = sortedElements[k];
        }
    }
    public void doSort(Integer low,Integer high,Integer[] elements) {

        if(low < high) {
            int mid = (low+high)/2;
            doSort(low,mid,elements);
            doSort(mid+1,high,elements);
            merge(low,mid,high,elements);
        }
    }
}
