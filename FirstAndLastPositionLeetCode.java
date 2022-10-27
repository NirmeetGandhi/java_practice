package com.company;

import java.util.Arrays;

public class FirstAndLastPositionLeetCode {
    static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0){
            return new int[]{-1,-1};
        }
        if (nums.length == 1){
            return new int[]{-1,-1};
        }
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==target){
                return new int[]{i, i+1};
            }
//            else {
//                for (int element:nums) {
//                    if (element != target){
//                        return new int[]{-1,-1};
//                    }
//                }
//            }
        }
        for (int element:nums) {
            if (target != element){
                return new int[]{-1,-1};
            }
        }
        return new int[]{};
    }

    static int[] searchRange1(int[] nums, int target){
        int st = 0;
        int en = nums.length -1;

        for (int i = st; i <=en ; i++) {
            for (int j = en; j <=st ; j++) {
//                if (nums[i] && nums[j] == target){
                    return new int[]{i,j};
//                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] arr = {5,7,7,7,8,8,10};
//        System.out.println(Arrays.toString(searchRange(arr,6)));
        System.out.println(Arrays.toString(searchRange1(arr,7)));
    }
}
