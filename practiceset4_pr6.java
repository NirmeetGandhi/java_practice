package com.company;
import java.util.Scanner;

public class practiceset4_pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL");
        String str = sc.nextLine();

        if(str.contains(".com")){
            System.out.println("This is the URL of commercial website");
        }
        else if(str.contains(".website")){
            System.out.println("This is the URL of Nirmeet Gandhi's website");
        }
        else if(str.contains(".in")){
            System.out.println("This is the URL of indian website");
        }

    }
}
