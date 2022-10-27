package com.company;

public class NumberSystem {
    static boolean oddOrEven(int n){
//        int n = 14;
        //this will return true only if th number is even otherwise it will return false
        return ((n&1)==0);
    }
    static int uniqueAnswer(int []arr){
        int unique= 0;
        for (int num:arr) {
            unique ^= num;
        }
        return unique;
    }
    public static void main(String [] args){
//        System.out.println(oddOrEven(145));
        int [] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(uniqueAnswer(arr));
    }
}
