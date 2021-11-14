package com.company;
import java.util.Scanner;

public class practice_set7_pr01 {
    // with functional approach
    static void mul(int n){
        for (int i=1;i<=10;i++){
//            product = product * i;
           System.out.println(n + "x" + i + "=" + n * i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to get the multiplication table of:");
        int user = sc.nextInt();
        mul(user);

        // with itrative Approach
//        int product = 1;
//        for (int i=1;i<=10;i++){
////            product = product * i;
//            System.out.println(user + "x" + i + "=" + user * i);
//        }
//        System.out.println(user + "x" + product + "=" + user * product);
    }
}
