package com.company;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class find_numbers_disappeared_in_arr_leetcode {
    static void swap(int[]arr,int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static List<Integer> ans1(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {7,3,2,4,8,3,2,1};
//        ans(arr);
        System.out.println(ans1(arr));
//        System.out.println(Arrays.toString(arr));
    }
}
