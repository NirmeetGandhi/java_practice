package com.company;
import java.util.Scanner;

public class practiceset4_pr2 {
    public static void main(String[] args) {
        System.out.println("What is your income(suppose it is 2.5 lakh so write 2.5 only)");
        Scanner sc = new Scanner(System.in);
        float tax = 0.f;
        float income_user = sc.nextFloat();
        if (income_user<=2.5){
            tax = tax + 0;
        }
        else if(income_user>2.5f && income_user<=5f){
            tax = tax + 0.05f * (income_user-2.5f);
        }
        else if(income_user>5.0f && income_user<=10.0f){
            tax = tax + 0.05f * (5.0f-2.5f);
            tax = tax + 0.2f * (income_user-5.0f);
        }
        else if(income_user>10.0f){
            tax = tax + 0.05f * (5.0f-2.5f);
            tax = tax + 0.05f * (10.0f-5.0f);
            tax = tax + 0.3f * (income_user-10.0f);

        }

        System.out.println("Total tax paid by employee is " +tax+"lakh");

    }
}
