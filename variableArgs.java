package com.company;

import java.util.Arrays;

public class variableArgs {
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static int mul(int a,int ...v){
        int result = a;
        for (int e:v) {
            result = result*e;
        }
        return result;
    }
    public static void main(String[] args) {
        fun(12,12,23,4,67);
        System.out.println(mul(2,12,12,23));

    }
}
