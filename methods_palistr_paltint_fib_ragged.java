package com.company;
import java.util.Scanner;

public class methods_palistr_paltint_fib_ragged {
   // Method to find that the String is palindrome or not
    static void peli_rev_string(){
        Scanner sc = new Scanner(System.in);
        int user;
        do {
            System.out.println("Press 1 to Enter the String , 2 to Exit");
            user = sc.nextInt();
            switch (user){
                case 1:
                    System.out.println("Enter the string");
                    String str = sc.next();
                    String org_str;
                    org_str = str;
                    String rev_str = "";
                    int len = str.length();

                    for (int i = len - 1; i >= 0; i--) {
                        rev_str = rev_str + str.charAt(i);
                    }
                    if (rev_str.equals(org_str)) {
                        System.out.println("The String "+org_str +" is Palindrome");
                        System.out.println();
                    } else {
                        System.out.println("The String "+org_str +" is not Palindrome");
                        System.out.println();
                    }
                case 2:
                    System.out.println("Thank You");
                    System.out.println();
            }

        }while (user!=2);
    }

    // Method to find that the Integer is palindrome or not
    static void peli_rev_int(){
        Scanner sc = new Scanner(System.in);
        int user;
        do {
            System.out.println("Press 1 to Enter the Integer , 2 to Exit");
            user = sc.nextInt();
            switch (user){
                case 1:
                    System.out.println("Enter an Integer");
                    int n = sc.nextInt();
                    int r, c, s = 0;
                    c = n;
                    while (n > 0) {
                        r = n % 10;
                        s = (s * 10) + r;
                        n = n / 10;
                    }
                    if (s == c) {
                        System.out.println("The Integer "+ c +" is Palindrome");
                        System.out.println();
                    } else {
                        System.out.println("The Integer "+ c +" is not Palindrome");
                        System.out.println();
                    }

                case 2:
                    System.out.println("Thank You");
                    System.out.println();
            }

        }while (user!=2);
    }

    // Method to find the fibonacci series of given number
    static void rev_fib(){
        Scanner sc = new Scanner(System.in);
        int user;

        do {
            System.out.println("Press 1 to Enter the Number , 2 to Exit");
            user = sc.nextInt();
            switch (user){
                case 1:
                    System.out.println("Enter the number");
                    int inp = sc.nextInt();
                    int s1 = 0;
                    int s2 = 1;
                    int count = 0;
                    int temp = 0;

                    while (count < inp) {
                        if (count == 0) {
                            System.out.println(s1);
                        } else if (count == 1) {
                            System.out.println(s2);
                        } else if (count > 1) {
                            temp = s1 + s2;
                            s1 = s2;
                            s2 = temp;
                            System.out.println(temp);
                            System.out.println("The Fibonacci series of " + inp+" is ||Above||:");
                        }
                        count++;
                    }
                case 2:
                    System.out.println("Thank you");
                    System.out.println();
            }

        }while (user!=2);
    }

    // Method that prints all the elements of ragged array in form of matrix
    static void ragged(){
        int temp[][];
        temp = new int[3][];

        temp[0] = new int[2];
        temp[1] = new int[3];
        temp[2] = new int[4];

        temp[0][0] =  1;
        temp[0][1] =  2;

        temp[1][0] =  3;
        temp[1][1] =  4;
        temp[1][2] =  5;

        temp[2][0] =  6;
        temp[2][1] =  7;
        temp[2][2] =  8;
        temp[2][3] =  9;

        for (int i=0;i<temp.length;i++){
            for (int j=0;j<temp[i].length;j++){
                System.out.println(temp[i][j]);
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//      ragged();
//      peli_rev_string();
//      peli_rev_int();
      rev_fib();
    }
}
