package com.company;

public class recursion_message {
    static void message(int n){
        System.out.println("Hello World");
        if (n==5){
            return;
        }
        message(n+1);
    }
    public static void main(String [] args){
        message(1);
    }
}
