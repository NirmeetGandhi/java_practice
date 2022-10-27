package com.company;

import java.util.Scanner;

public class mul {

    public static void multiplication(int a){
        for (int i=1;i<=10;i++){
            System.out.println(a + "x" + i + "=" + a*i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number to get the table of ");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        multiplication(ans);
    }
}
