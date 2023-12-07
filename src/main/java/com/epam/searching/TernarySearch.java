package com.epam.searching;

public class TernarySearch {

    public int doSearch(Integer low,Integer end,Integer key,Integer[] elements) {

        while (low <= end) {
            int mid1 = low + (end-low)/2;
            int mid2 = end - (end-low)/2;

            if(elements[mid1] == key) {
                return mid1;
            }
            if(elements[mid2] == key) {
                return mid2;
            }

            if(key < elements[mid1]){
                end = mid1-1;
            }else if(key > elements[mid2]) {
                low = mid2+1;
            }else {
                low = mid1+1;
                end = mid2-1;
            }
        }
        return -1;
    }
}
