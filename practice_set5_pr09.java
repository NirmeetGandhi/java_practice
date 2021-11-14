package com.company;
import java.util.Scanner;

public class practice_set5_pr09 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;

        for (int i=1;i<=n;i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}
