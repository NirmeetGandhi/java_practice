package com.company;

import java.util.Arrays;

public class cycle_sort_practice {
    static void sort(int[]arr){
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i] - 1;

            if(arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,6,1,2,3,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
