package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class methods_meth {
    static void swap(int arr[] , int i , int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println("New Array");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6};
        System.out.println("old Array");
        System.out.println(Arrays.toString(a));

        swap(a,2,3);


    }
}
