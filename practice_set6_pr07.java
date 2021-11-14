package com.company;

public class practice_set6_pr07 {
    public static void main(String[] args) {

        int [] arr = {1,4,-565,765,-78};
        int min = 2147483647;
        for (int e:arr){
            if (e<min){
                min = e;
            }
        }
        System.out.println(min);
//        2147483647
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
    }
}
