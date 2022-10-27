package com.company;

import java.util.Arrays;

public class LeetCodeExamples {
    //find first and last position of element in sorted array

    static int binarySearch(int [] arr ,int target , boolean firstOccurrence){
        int st = 0;
        int en = arr.length -1;
        int ans = -1;

        while (st<=en){
            int mid = st + (en-st)/2;
            if (target < arr[mid]){
                en = mid -1;
            }
            else if(target > arr[mid]){
                st = mid + 1;
            }
            else {
                ans = mid;
                if (firstOccurrence){
                    en = mid -1;
                }
                else {
                    st = mid +1;
                }
            }
        }
        return ans;
    }

    static int[] ans(int [] arr ,int target){
        int [] ans = {-1,-1};
        ans[0] = binarySearch(arr,target,true);
        ans[1] = binarySearch(arr,target,false);

        return ans;
    }

    static int bSearch(int [] arr ,int target , int st , int en){
        while (st<=en){
            int mid = st + (en-st)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (target < arr[mid]){
                en = mid -1;
            }
            else if(target > arr[mid]){
                st = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int ansOfInfiniteArray(int [] arr ,int target){
        int st = 0;
        int en = 1;
        while (target > arr[en]){
            int new_st = en +1;
            en = en + (en-st+1) * 2;
            st = new_st;

        }
            return bSearch(arr,target,st,en);
    }
    public static void main(String[] args) {
        int  [] arr = {5,7,7,7,8,8,8,8,8,10,11,12,13,14,15,16,17,18,19,20};
//        System.out.println(Arrays.toString(ans(arr,8)));
        System.out.println(ansOfInfiniteArray(arr,10));
    }
}
