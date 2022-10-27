package com.company;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user;
        do {
            System.out.println("press 1 to enter number , 2 to exit");
            user = sc.nextInt();
            switch (user){
                case 1:
                    System.out.println("Enter the year to check that the year is leap year or not");
                    System.out.println();
                    int year = sc.nextInt();

                    if (year < 0) {
                        System.out.println("Please enter the year in positive number");
                    }
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        System.out.println(year + " is leap year");
                    } else {
                        System.out.println(year + " is not leap year");
                    }
                case 2:
                    System.out.println("Thank You");
            }

        }while (user!=2);
    }
}
