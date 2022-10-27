package com.company;

import java.util.Arrays;

public class selection_again {
    static int maxIndex(int []arr,int st,int en){
        int max = st;
        for (int i = st; i <=en ; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void selection(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            int lasIndex = arr.length -i-1;
            int maxIndex = maxIndex(arr,0,lasIndex);
            if (arr[lasIndex]<arr[maxIndex]){
                int temp = arr[lasIndex];
                arr[lasIndex]=arr[maxIndex];
                arr[maxIndex]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr= {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
