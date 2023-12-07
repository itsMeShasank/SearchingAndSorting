package com.epam.searching;

public class BinarySearch {

    public int doSearch(Integer low,Integer high,Integer key,Integer[] elements) {
        while(low <= high) {
            int mid = (low + high)/2;
            if(elements[mid] == key) {
                return mid;
            }else if(elements[mid] > key) {
                high = mid-1;
            } else if (elements[mid] < key) {
                low = mid+1;
            }
        }
        return -1;
    }
}
