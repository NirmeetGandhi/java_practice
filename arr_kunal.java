package com.company;

import java.util.Arrays;

public class arr_kunal {
    public static void main(String[] args) {
        int [] marks = {1,2,3,4,5};
        System.out.println("Old array is " + Arrays.toString(marks));
        change(marks);
        System.out.println("New array is " + Arrays.toString(marks));

    }
    static void change(int arr[]){
        arr[0] = 99;
    }
}
