package com.company;
import java.util.Scanner;

public class pali_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user;
        do {
        System.out.println("Press 1 to Enter number , 2 to Exit");
        user = sc.nextInt();
            switch (user){
                case 1:
                    System.out.println("Enter a number to check that it is palindrome or not");
                    System.out.println("NOTE:Please enter integers only");
                    int n = sc.nextInt();
                    int r, c, s = 0;
                    c = n;
                    while (n > 0) {
                        r = n % 10;
                        s = (s * 10) + r;
                        n = n / 10;
                    }
                    if (s == c) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not palindrome");
                    }

                case 2:
                    System.out.println("Thank you");
            }

        }while (user!=2);
    }
}
