package com.company;

public class practice_set7_pr06 {
    static int arr(int a,int ... arry){

        int result = a;
        for (int e:arry){
            e = a+e;
            result = e/arry.length;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("avg of 4 and 5 is " + arr(4,5));

    }
}
