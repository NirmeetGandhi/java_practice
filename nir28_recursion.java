package com.company;
import java.util.Scanner;

public class nir28_recursion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static int fact_itreative(int n){
        int product = 1;
        if (n==0 || n==1){
            return 1;
        }
        else{
        for (int i=1;i<=n;i++) {
            product = product * i;
        }
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to get factorial of:");
        int n = sc.nextInt();


        System.out.println("The Factorial of "+n+" is " +factorial(n));
        System.out.println("The Factorial of "+n+" is " +fact_itreative(n));

    }
}
