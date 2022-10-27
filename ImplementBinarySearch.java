package com.company;

public class ImplementBinarySearch {
    static int ascending(int [] arr ,int target ){
        int st = 0;
        int en = arr.length - 1;

        while (st<=en){
            int mid = st + (en-st)/2;

            if(target > arr[mid]){
                st = mid +1;
            }
            else if(target < arr[mid]){
                en = mid - 1;
            }
            else{
                return  mid;
            }
        }
        return -1;
    }

    static int descending(int [] arr , int target){
        int st = 0;
        int en = arr.length -1;

        while (st<=en){
            int mid = st + (en-st)/2;
            if (target == arr[mid]){
                return  mid;
            }
            else if(target > arr[mid]){
                en = mid-1;
            }
            else {
                st = mid +1;
            }
        }
        return -1;
    }

    static int orderAgnostic(int [] arr , int target){
        int st = 0;
        int en = arr.length -1;
        boolean checkAscending;
        if (arr[st] < arr[en]){
            checkAscending = true;
        }
        else{
            checkAscending = false;
        }
        while (st<=en){
            int mid = st + (en-st)/2;
            if (target == arr[mid]){
                return  mid;
            }
//            boolean checkAscending;
//            if (arr[st] < arr[en]){
//                checkAscending = true;
//            }
//            else{
//                checkAscending = false;
//            }
            if (checkAscending){
                if (target>arr[mid]){
                    st = mid +1;
                }
                else{
                    en = mid -1;
                }
            }
            else {
                if (target<arr[mid]){
                    st = mid +1;
                }
                else{
                    en = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,456,4567};
        int [] arr1 = {4567,456,3,1};
//        System.out.println(ascending(arr,4567));
//        System.out.println(descending(arr1,4567));

        System.out.println(orderAgnostic(arr,45623));
        System.out.println(orderAgnostic(arr1,45623));
    }
}
