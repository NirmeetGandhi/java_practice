package com.company;

import java.util.Arrays;

public class selection_sorttt {
    static int maxIndex(int[]arr,int st,int en){
        int max = st;
        for (int i = st; i <=en ; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b] =temp;
    }
    static void insertion(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            int lastIndex = arr.length -i-1;
            int maxIndex = maxIndex(arr,0,lastIndex);

            swap(arr,maxIndex,lastIndex);
        }
    }
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
