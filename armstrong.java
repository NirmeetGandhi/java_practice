package com.company;

import java.util.Scanner;

public class armstrong {
    static boolean check(int n){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
        int org = n;
        int sum = 0;
        int cub = 1;
        int r;
        while (n>0){
            r = n%10;
            cub = r*r*r;
            sum = sum + cub;
            n = n/10;
        }
        if (sum==org){
            return true;
        }
        else{
            return false;
        }
    }
    static void print(){
        for (int i = 100; i <=999 ; i++) {
            if (check(i)==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check(23);
//        print();

    }
}
