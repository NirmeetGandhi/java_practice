package com.company;
import java.util.Scanner;

public class add_in_array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements you want to insert");
        int user = sc.nextInt();

        String [] marks = new String[user];
        System.out.println("Enter the elements: ");
        for (int i=0;i<user;i++){
            marks[i] = sc.nextLine();
        }
        System.out.println("The elements are");
        for (String e: marks){
            System.out.println(e);
        }
        }
    }

