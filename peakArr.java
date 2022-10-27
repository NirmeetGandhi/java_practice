package com.company;

public class peakArr {
    static int ans(int [] arr){
        int st = 0;
        int en= arr.length -1;
        while (st<en){
            int mid = st + (en-st)/2;
            if(arr[mid] > arr[mid+1]){
                en = mid;
            }
            else {
                st = mid +1;
            }
        }
        return st;
    }

    static int smallestGreaterThenTarget(int [] arr , int target){
        int st = 0;
        int en = arr.length -1;

        while (st<=en){
         int mid = st + (en-st)/2;
         if (target == arr[mid]){
             return mid;
         }
         if (target  <arr[mid]){
             en = mid -1;
         }
         else {
             st = mid +1;
         }
        }
        return arr[st % arr.length];
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,5,6,4};
        System.out.println(ans(arr));
    }

//    int st = 0;
//    int en = letters.length -1;
//
//        while(st<=en){
//        int mid = st + (en-st)/2;
//
//        if(target < letters[mid]){
//            en = mid -1;
//        }
//        else{
//            st = mid +1;
//        }
//    }
//        return letters[st % letters.length];
}
