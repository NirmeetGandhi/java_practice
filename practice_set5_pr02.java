package com.company;
import java.util.Scanner;

public class practice_set5_pr02 {
    public static void main(String[] args) {
//        int sum = 0;
//        int n=3;
//        for (int i=0;i<n;i++){
//            sum = sum + (2*i);
//        }
//        System.out.print("The sum is:");
//        System.out.println(sum);

        // PRINTS THE SUM OF FIRST N EVEN NUMBERS ENTERED BY USER USING FOR LOOP

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the numbers to get sum");
        int n = sc.nextInt();
        int sum = 0;

        for (int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.println("The sum is:");
        System.out.println(sum);

    }
}
