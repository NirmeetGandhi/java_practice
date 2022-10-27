package com.company;

import java.util.Arrays;

public class bubble_sort_1 {
    static void sort(int [] arr){
        boolean swapped;
        for (int i = 0; i <arr.length ; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            //if you did not swap you should break
            //when swapped value is false means no swapping is occurring
            // it is basically telling that if the swapped value is not true means swapped value is false
            // swapped == false && (!swapped == means swapped true nahi hai) both are equal
            if (swapped==false){ // swapped = false -->//!swapped = true   ---> //(!swapped==true)
                break;
            }
        }

    }
    public static void main(String[] args) {
        int [] arr = {1,3,1,2,90,12};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
