package com.company;
import java.util.Scanner;

public class practice_set7_pr03 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to get the sum of natural number");
        int user1 = sc.nextInt();

        for (int i=0;i<=user1;i++){
            sum = sum + i;
        }
        System.out.println("The sum of First "+user1+" Natural numbers is "+sum);


    }
}
