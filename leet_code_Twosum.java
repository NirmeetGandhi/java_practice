package com.company;

import java.util.Arrays;

public class leet_code_Twosum {
    static int[] ans(int nums[],int target){
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
//            if (nums[i] + nums[i+1] == target){
//                return new int[]{i,i+1};
//            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        System.out.println(Arrays.toString(ans(arr,7)));
    }
}
