package com.company;

import java.util.Scanner;

public class method_overloading {
    static void change(int [] arr){
        System.out.println("Please enter any integer value");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        arr[0] = c;
    }
    public static void main(String[] args) {
        int [] marks = {12,13,14,15,126,17};
        System.out.println("The array before changing the 1 st element was " + marks[0]);
        for (int e:marks){
            System.out.println(e);
        }

        change(marks);
        System.out.println("The array after changing the 1 st element is " + marks[0]);
        for (int e:marks){
            System.out.println(e);
        }
    }
}
