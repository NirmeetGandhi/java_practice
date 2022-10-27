package com.company;

public class SearchInRotatedSortedArrayWithDuplicateValuesLeetCode {
    static int findPivot(int [] arr){
        int st = 0;
        int en = arr.length -1;
        while (st<=en){
            int mid = st + (en-st)/2;
            if (mid<en && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>st &&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[st] && arr[mid] == arr[en]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (st < en && arr[st] > arr[st + 1]) {
                    return st;
                }
                st++;

                // check whether end is pivot
                if (en > st && arr[en] < arr[en - 1]) {
                    return en - 1;
                }
                en--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[st] < arr[mid] || (arr[st] == arr[mid] && arr[mid] > arr[en])) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int [] arr , int target , int st ,int en){
        while (st<=en){
            int mid = st + (en-st)/2;

            if (target > arr[mid]){
                st= mid +1;
            }
            else if(target < arr[mid]){
                en = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int searchInRotatedSortedArray(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (pivot > arr[0]) {
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length - 1);
    }

    public static void main(String[] args) {
        int [] arr = {2,9,2,2,2};
        System.out.println(searchInRotatedSortedArray(arr,2));
    }
}
