package com.company;

import java.util.Scanner;

public class methods_kunal {

    static void greetName(String name){
        String str = "Hello";
        System.out.println(str +" " +  name);
    }
    static void sum_of_numbers(float a , float b){
        float c = a+b;
        System.out.println("The Sum is: " + c);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int user;
//            do {
//                System.out.println("1 to Enter numbers , 2 to Exit ");
//               user = sc.nextInt();
//                switch (user){
//                    case 1:
//                        System.out.println("Enter two numbers: ");
//                        System.out.println("Enter Number 1:");
//                        float a = sc.nextFloat();
//                        System.out.println("Enter Number 2:");
//                        float b = sc.nextFloat();
//                        sum_of_numbers(a,b);
//                        break;
//                    case 2:
//                        System.out.println("Thank You");
//                }
//            }while (user!=2);
        System.out.println("Enter your name");
        String user = sc.next();
        greetName(user);
    }
}
