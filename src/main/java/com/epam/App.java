package com.epam;

import com.epam.searching.BinarySearch;
import com.epam.searching.TernarySearch;
import com.epam.sorting.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Integer[] elements = new Integer[] {1,4,5,6,8,12,15,45,89,98,120};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.doSearch(0,elements.length-1,98,elements));

        TernarySearch ternarySearch = new TernarySearch();
        System.out.println(ternarySearch.doSearch(0,elements.length-1,98,elements));

        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.doSort(new Integer[]{3, 2, 56, 23, 11, 10, 89, 15, 20})));

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.doSort(new Integer[]{3, 2, 56, 23, 11, 10, 89, 15, 20})));

        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.doSort(new Integer[]{3, 2, 56, 23, 11, 10, 89, 15, 20})));

        MergeSort mergeSort = new MergeSort();
        Integer[] numbers = new Integer[]{3, 2, 56, 23, 11, 10, 89, 15, 20};
        mergeSort.doSort(0,numbers.length-1,numbers);
        System.out.println(Arrays.toString(numbers));

        QuickSort quickSort = new QuickSort();
        quickSort.sort(0,numbers.length-1,numbers);
        System.out.println(Arrays.toString(numbers));


    }
}
