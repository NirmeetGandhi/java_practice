package com.company;
//https://leetcode.com/problems/find-in-mountain-array/
public class ElementInMountainArrayLeetCodeHard {
    static int peakInAMountainArray(int [] arr){
        int st = 0;
        int en = arr.length -1;

        while (st < en){
            int mid = st + (en-st)/2;
            if (arr[mid]>arr[mid+1]){
                en = mid;
            }
            else{
                st = mid +1;
            }
        }
        return st;
    }
    static int orderAgnostic(int [] arr ,int target,int st , int en){
        boolean isCheck;
        while (st<=en){
            int mid = st + (en-st)/2;
            if (arr[mid]==target){
                return mid;
            }
            if(arr[st]<arr[en]){
                isCheck = true;
            }
            else{
                isCheck = false;
            }
            if (isCheck){
                if (target > arr[mid]){
                    st = mid +1;
                }
                else{
                    en = mid -1;
                }
            }
            else{
                if (target < arr[mid]){
                    en = mid -1;
                }
                else {
                    st = mid +1;
                }
            }
        }
        return -1;
    }

    static int ans(int [] arr  , int target){
        int peak = peakInAMountainArray(arr);
        int firstTry = orderAgnostic(arr,target,0,peak);
        if (firstTry!= -1){
            return firstTry;
        }
        return orderAgnostic(arr,target,peak+1,arr.length-1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,1};
        System.out.println(ans(arr,3));
    }
}
