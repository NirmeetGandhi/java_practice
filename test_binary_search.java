package com.company;

public class test_binary_search {
    static int test(int nums[], int target){
//        int len = nums.length;
        int st = 0;
        int en = (nums.length)-1;
        int key = (st+en)/2;

//        System.out.println(nums[st]);
//        System.out.println(nums[key]);
//        System.out.println(nums[en]);
//
        if (target==nums[key]){
            return key;
        }
        if (target<nums[key]){
            for (int i = st; i <key ; i++) {
                if (nums[i]==target){
                    return i;
                }
            }
        }
        if (target>nums[key]){
            for (int i = key+1; i <=en ; i++) {
                if (nums[i] == target){
                    return i;
                }
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        int arr[] = {1,2,34,56,78,90,99};
        System.out.println(test(arr,56));
    }
}
