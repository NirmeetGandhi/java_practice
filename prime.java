package com.company;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user;
        do {
            System.out.println("Press 1 to Enter number , 2 to Exit");
            user = sc.nextInt();
            switch (user){
                case 1:
                    System.out.println("Enter the number");
                    int num = sc.nextInt();

                    if (num % 10 == 0) {
                        System.out.println("Not Prime");
                    } else {
                        System.out.println("prime");
                    }
                case 2:
                    System.out.println("Thank you");
            }

        }while (user!=2);
    }
}
