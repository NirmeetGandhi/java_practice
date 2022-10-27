package com.company;

import java.util.Locale;
import java.util.Scanner;

public class switch_case {

    static void fruits(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
        switch (str){
            case "MANGO":
                System.out.println("King of fruits");
                break;
            case "APPLE":
                System.out.println("Sweet red fruit");
                break;
            case "ORANGE":
                System.out.println("Round fruit");
                break;
            case "GREPS":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Enter the valid fruit");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int user;
        do {
            System.out.println("press 1-Mangoes , 2-Apple , 3-Orange , 4-Greps , 5 to exit");
            user = sc.nextInt();
            switch (user) {
                case 1 -> System.out.println("King of fruits");
                case 2 -> System.out.println("Sweet red fruit");
                case 3 -> System.out.println("Round fruit");
                case 4 -> System.out.println("Small fruit");
                case 5 -> System.out.println("Thank You");
            }
        }while (user!=5);

        fruits();

    }
}
