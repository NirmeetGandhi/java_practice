package com.company;

public class practice_set6_pr03 {
    public static void main(String[] args) {
        int [] marks = {23,45,67,89,90};
        int sum = 0;
        for (int e:marks){
            sum = sum + e;

        }
        System.out.println("The avg marks is "+ sum/marks.length );
    }
}
