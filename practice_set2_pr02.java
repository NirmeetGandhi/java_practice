package com.company;

public class practice_set2_pr02 {
    public static void main(String[] args) {
        char grade = 'B';

        // encrypt the grade
        grade = (char)(grade +  8);
        System.out.println("The encrypted marks are:" + grade);

        // decrypt the grade
        grade = (char)(grade - 8);
        System.out.println("The decrypted marks are:" + grade);
    }
}
