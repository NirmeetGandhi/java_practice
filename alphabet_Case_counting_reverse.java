package com.company;

import java.util.Scanner;

public class alphabet_Case_counting_reverse {
    static void alphabet_case(){
        Scanner sc = new Scanner(System.in);
        int user;
        do {
            System.out.println("Press 1 to Enter the character, 2 to exit");
            user = sc.nextInt();
            switch (user){
                case 1:
                    System.out.println("Enter the character");
                    char ch = sc.next().trim().charAt(0);

                    if (ch >= 'a' && ch <= 'z') {
                        System.out.println("Lower case");
                    } else {
                        System.out.println("Uppercase");
                    }
                    break;
                case 2:
                    System.out.println("ThankYou");
            }

        }while (user!=2);
    }

    static void counting_occurrences(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        System.out.println("Press the number of which you want to count the occurrence");
        int ch = sc.nextInt();
        int r;
        while (n>0){
            r = n%10;
            if (r==ch){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }

    static void reverse(){
        Scanner sc = new Scanner(System.in);
        int r;
        int s = 0;
        int n = sc.nextInt();

        while (n>0){
            r = n%10;
            s= (s*10)+r;
            n = n/10;
        }

        System.out.println(s);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        alphabet_case();
//        counting_occurrences();
            reverse();
    }
}


