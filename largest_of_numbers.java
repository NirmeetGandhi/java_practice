package com.company;
import java.util.Scanner;

public class largest_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println(a + " is largest");
        }
        else if(b>a && b>c){
            System.out.println(b + " is largest");
        }
        else {
            System.out.println(c + " is largest");
        }

        int max = Math.max(c,Math.max(a,b));
    }
}
