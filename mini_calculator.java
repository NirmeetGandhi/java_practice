package com.company;
import java.util.Scanner;


public class mini_calculator {
    public static void main(String[] args) {
//        System.out.print("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float input_1 = sc.nextFloat();
        System.out.println("Enter second number");
        float input_2 = sc.nextFloat();
        System.out.println("\n0-Sum\n1-Subtraction\n2-Multiplication\n4-Division");
        int input = sc.nextInt();
        System.out.println("You have entered "+input_1+ " and "+ input_2);

        switch (input){
            case 0:
            System.out.println("Calculating Addition");
            System.out.print("The ans is ");
            System.out.print(input_1 + input_2);
            break;
            case 1:
            System.out.println("Calculating Subtraction");
            System.out.print("The ans is ");
            System.out.print(input_1 - input_2);
            break;
            case 2:
            System.out.println("Calculating Multiplication");
            System.out.println("The ans is " );
            System.out.print(input_1 * input_2);
            break;
            case 3:
            System.out.println("Calculating Division");
            System.out.println("The ans is ");
            System.out.print(input_1 / input_2);
            break;
            default:
                System.out.println("Invalid input please enter between 0,1 and 2 only");
        }


    }
}
