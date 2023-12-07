package com.epam.sorting;

public class BubbleSort {

    public Integer[] doSort(Integer[] elements) {
        for(int i =0;i<elements.length-1;i++) {
            for(int j=0;j< elements.length-1-i;j++) {
                if(elements[j] > elements[j+1]) {
                    int temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
        }
        return elements;
    }
}
