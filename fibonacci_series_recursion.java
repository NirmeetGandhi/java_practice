package com.company;

public class fibonacci_series_recursion {
    static int fibonacci(int n){
        if (n<2){
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }
    public static void main(String[] args) {
        //this will not work for big numbers like 50,40 , For computers these are very small numbers but still program gets stuck
        int ans = fibonacci(50);
        System.out.println(ans);
    }
}
