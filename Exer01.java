// write a java code to convert marks into percentage that user inputs
package com.company;
import java.util.Scanner;
public class Exer01 {
    public static void main(String[] args) {
        int totalMarks = 100;
        System.out.println();
        System.out.println();
        System.out.println("**********************This is a programme made by Nirmeet Gandhi**********************");
        System.out.println();
        System.out.println();
        System.out.println("Purpose is that You will input 5 subjects marks(They will be out of 100) and my programme will convert it into Percentage");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 1st subject: ");
        int marks1 = sc.nextInt();
        System.out.println("Enter the marks of 2nd subject: ");
        int marks2 = sc.nextInt();
        System.out.println("Enter the marks of 3rd subject: ");
        int marks3 = sc.nextInt();
        System.out.println("Enter the marks of 4th subject: ");
        int marks4 = sc.nextInt();
        System.out.println("Enter the marks of 5th subject: ");
        int marks5 = sc.nextInt();

        int gotmark = (marks1 + marks2 + marks3 + marks4 + marks5);
        float ans = (gotmark*100)/500;
        System.out.print("Your percentage is: ");
        System.out.println(ans + "%");
    }
}
