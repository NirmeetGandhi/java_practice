package com.company;

public class rev_FindElementInMountainArray {
    static int peakInArr(int [] arr){
        int st = 0;
        int en = arr.length -1;

        while (st<en){
            int mid = st + (en-st)/2;
            if (arr[mid]>arr[mid+1]){
                en = mid;
            }
            else{
                st = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {


    }
}
