package com.company;
import java.util.Scanner;

public class test_multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO GET THE TABLE:");
        int user = sc.nextInt();
        System.out.println("YOUR ANSWER IS: ");
        for (int i=1;i<=10;i++){
            System.out.println(user + "x" + i + "=" + user*i);
        }
    }

}
