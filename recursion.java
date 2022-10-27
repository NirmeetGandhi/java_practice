package com.company;
import java.util.Scanner;

public class recursion {
    int ans;
    static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        else {
           return a * factorial(a - 1);
        }
    }
    static int factorial_itrative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Enter the value");
        Scanner  sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("The value of" + x+ "!" +  " is "+ factorial(x));
        System.out.println("The value of" + x+ "!" +  " is "+ factorial(x));
    }
}
