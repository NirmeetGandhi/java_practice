package com.company;

import java.util.Arrays;

public class FindtheDuplicatNumber {
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void findDuplicate(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
//        for (int j = 0; j <arr.length ; j++) {
//            if (arr[j]!=j+1){
//                return arr[j];
//            }
//        }
//        return -1;
    }
    public static void main(String[] args) {
            int[] arr= {4,3,2,7,8,2,3,1};
//        System.out.println(findDuplicate(arr));
        findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
