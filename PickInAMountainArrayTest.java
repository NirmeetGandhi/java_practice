package com.company;

public class PickInAMountainArrayTest {
    public int peakIndexInMountainArrayTrial(int[] arr) {

        // complexity o(n);
        int max = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                return max;
            }
        }
        return -1;
    }

    static int ans(int [] arr , int target){
//        int st = 0;
//        int en = arr.length -1;
//        while (st<=en){
//            int mid = st + (en-st)/2;
////            for (int i = st; i < ; i++) {
////
////            }
//        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
