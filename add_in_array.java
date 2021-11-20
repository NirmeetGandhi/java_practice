package com.company;
import java.util.Scanner;

public class add_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr no of elements you want to insert");
        int user = sc.nextInt();

        int [] marks = new int[user];
        System.out.println("Enter the elements of Array: ");
        for (int i=0;i<user;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("The elements are");
        for (int e: marks){
            System.out.println(e);
        }


    }
}
