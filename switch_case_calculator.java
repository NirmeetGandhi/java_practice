package com.company;
import java.util.Scanner;

public class switch_case_calculator {
    static void calculator(){
        Scanner sc = new Scanner(System.in);
        int user_inp;
        do{
            System.out.println("Enter 1st number");
            int num1  = sc.nextInt();
            System.out.println("Enter 2nd number");
            int num2 = sc.nextInt();
            System.out.println("Enter 1 for addition , 2 for Subtraction , 3 for Multiplication , 4 for Division , 5 to Exit");
            user_inp =  sc.nextInt();
            switch (user_inp) {
                case 1 -> System.out.println("Sum is " + (num1 + num2));
                case 2 -> System.out.println("Subtraction is " + (num1 - num2));
                case 3 -> System.out.println("Multiplication is " + (num1 * num2));
                case 4 -> System.out.println("Division is " + (num1 / num2));
                case 5 -> System.out.println("Thank you very much");
            }
        }while (user_inp!=5);


    }
    public static void main(String[] args) {
        calculator();
    }
}
