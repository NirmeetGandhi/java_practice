package com.company;

public class FindNoOfDigits {
    public static void main(String[] args) {
        int n = 16;
        int b = 2;

        System.out.println((int)(Math.log(n)/Math.log(b)+1));
    }
}
