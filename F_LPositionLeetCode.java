package com.company;

import java.util.Arrays;

public class F_LPositionLeetCode {
    static int binarySearch(int [] arr , int target , boolean isFirstOccurrence){
        int ans = -1;
        int st = 0;
        int en = arr.length -1;

        while (st<=en){
            int mid = st + (en-st)/2;
            if (target < arr[mid]){
                en = mid -1;
            }
            else if(target > arr[mid]){
                st = mid +1;
            }
            else {
                ans = mid;
                if (isFirstOccurrence){
                    en = mid -1;
                }
                else {
                    st = mid +1;
                }
            }
        }
        return ans;
    }
    static int[] ans(int [] arr , int target){
        int [] ans = {-1,-1};
        ans[0] = binarySearch(arr,target,true);
        ans[1] = binarySearch(arr,target,false);

        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,3,4,4,4,5,6};
        System.out.println(Arrays.toString(ans(arr,5)));
    }
}
