package com.company;

import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {
    static int[] searchRange(int[] nums, int target){
        int [] ans = {-1,-1};
        ans[0] = ans(nums , 8, true);
        ans[1] = ans(nums , 8, false);

        return ans;
    }
    static int ans(int [] arr,int target , boolean first){
        int ans = -1;
        int st = 0;
        int en = arr.length -1;

        while (st<=en){
            int mid = st + (en -st)/2;
            if (target > arr[mid]){
                st = mid +1;
            }
            else if (target < arr[mid]){
                en = mid - 1;
            }
            else {
                ans = mid;
                if (first){
                    en = mid -1;
                }
                else {
                    st = mid +1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
}
