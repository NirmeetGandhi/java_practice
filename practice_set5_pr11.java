package com.company;
import java.util.Scanner;

public class practice_set5_pr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
//      PROGRAMME TO FIND SUM OF FIRST N EVEN NUMBERS ENTERED BY USER USING FOR LOOP

//      int sum = 0;
//      for (int i=0;i<=n;i++){
//            sum = sum + (2*i);
//      }
//      System.out.println(sum);
//
//      PROGRAMME TO FIND SUM OF FIRST N EVEN NUMBERS ENTERED BY USER USING WHILE LOOP

        int i =0;
        int sum = 0;
        while (i<=n){
            sum = sum + (2*i);
            i++;
        }
        System.out.println(sum);

    }
}
