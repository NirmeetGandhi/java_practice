package com.company;
import java.util.Scanner;

public class fibonacci_series_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get fibonacci series");
        int user = sc.nextInt();
        int count=0;
        int s1=0;
        int s2=1;
        int temp;
        while (count<user){
            if (count==0){
                System.out.print(s1);
            }
            if (count==1){
                System.out.print(s2);
            }
            if (count>1){
                temp = s1+ s2;
                s1 = s2;
                s2 = temp;
                System.out.print(temp);
            }
            count++;
        }

    }
}
