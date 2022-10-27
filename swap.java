package com.company;

import java.util.Arrays;

public class swap {
    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            swapping(arr,start,end);
            start++;
            end--;
        }
    }
    static void swapping(int arr[],int i,int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println("Before");
        System.out.println(Arrays.toString(a));
//        swapping(a,1,2);
            reverse(a);

    }


}
