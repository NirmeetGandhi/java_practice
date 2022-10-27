package com.company;

public class PickInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int st = 0;
        int en = arr.length -1;
        while (st<en){
            int mid = st + (en-st)/2;

            if (arr[mid]>arr[mid+1]){
                //You are in the decreasing part of array
                //It may be the answer
                //but look at left
                //that is why en != mid -1;
                // because the mid can also be the answer
                en = mid;
            }
            else {
                //You are  in the increasing part of array
                //we know that mid+1 > mid , hence we are ignoring the middle element and starting from mid+1
                st = mid +1;
            }
        }
        //in the end , st == en will point to the largest number because of 2 checks
        // st and en always tries to find max element in above 2 checks
        return st;
//        or hence start and end are same , return anything cause start and end are same
//        return en;
    }
    public static void main(String[] args) {

    }
}
