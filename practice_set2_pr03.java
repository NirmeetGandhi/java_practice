package com.company;
import java.util.Scanner;

public class practice_set2_pr03 {
    public static void main(String[] args) {
        System.out.println("You can enter a number either int ot float number");
        float givenNum = 24;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        float a = sc.nextFloat();

        if(a>=givenNum){
            System.out.println("TRUE:Your Number is Greater then the default number");
            System.out.println("The default number is " + givenNum);
        }
        else {
            System.out.println("FALSE:Your Number is not Greater then the default number");
            System.out.println("The default number is " + givenNum);
        }

    }
}
