package com.company;

public class mountain {
    static int peak(int [] arr){
        int st =0;
        int en = arr.length -1;

        while (st<en){
            int mid = st + (en-st)/2;
            if (arr[st]>arr[mid]){
                en = mid;
            }
            else{
                st = mid +1;
            }
        }
        return st;
    }

    static int orderAgnosticBinarySearch(int [] arr,int target,int st,int en){
        boolean isAscending;
       while (st<=en){
           int mid = st + (en-st)/2;
           if (target == arr[mid]){
               return mid;
           }
           if (arr[st]<arr[en]){
               isAscending =true;
           }
           else{
               isAscending = false;
           }
           if (isAscending){
               if (target >arr[mid]){
                   st = mid +1;
               }
               else{
                   en = mid -1;
               }
           }
           else{
               if (target > arr[mid]){
                   en = mid -1;
               }
               else {
                   st = mid +1;
               }
           }
       }
        return -1;
    }

    static int ans(int [] arr,int target){
        int peak = peak(arr);
        int firstTry = orderAgnosticBinarySearch(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,3,1};
        System.out.println(ans(arr,3));
    }
}
