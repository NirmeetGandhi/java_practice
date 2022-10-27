package com.company;

public class InfiniteArray_FirstAndLastIndex_PeakInArray {

    static int binarySearchForInfiniteArray(int [] arr , int target , int st , int en){
        while (st<=en){
            int mid = st + (en-st)/2;
            if (target > arr[mid]){
                st = mid +1;
            }
            else if(target  <arr[mid]){
                en = mid -1;
            }
            else {
                return mid;
            }
        }
        return  -1;
    }

    static  int ansInfiniteArray(int [] arr , int target){
        int st = 0;
        int en = 1;

        while (target  >arr[en]){
            int new_st = en +1;
            en = en + (en-st+1)*2;
            st = new_st;
        }
        return binarySearchForInfiniteArray(arr,target,st,en);
    }

    static int peakInArray(int [] arr){
        int st = 0;
        int en = arr.length -1;
        while (st<en){
            int  mid = st + (en-st)/2;
            if (arr[mid]>arr[mid+1]){
                en = mid;
            }
            else{
                st = mid +1;
            }
        }
        return st;
    }
    static int orderAgnosticForPeakInArray(int [] arr , int target , int st , int en){
        boolean isAscending;
        while (st<=en){
            int mid = st + (en-st)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (arr[st]<arr[en]){
                isAscending = true;
            }
            else {
                isAscending = false;
            }
            if (isAscending){
                if (target > arr[mid]){
                    st = mid +1;
                }
                else if(target < arr[mid]){
                    en = mid -1;
                }
            }
            else {
                if (target > arr[mid]){
                    en = mid -1;
                }
                else {
                    st = mid +1;
                }
            }
            return mid;
        }
        return -1;
    }

    static  int ansPeakInArray(int [] arr ,int target){
        int peak = peakInArray(arr);
        int first = orderAgnosticForPeakInArray(arr,target,0,peak);
        if (first != -1){
            return first;
        }
        return orderAgnosticForPeakInArray(arr,target,peak+1,arr.length-1);
    }
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        System.out.println(ansInfiniteArray(arr,4));
        int [] arr = {1,2,3,4,5,3,1};
        int [] arr1 = {0,1,2,4,2,1};
        System.out.println(ansPeakInArray(arr1,3));
    }
}
