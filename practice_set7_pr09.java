package com.company;
import  java.util.Scanner;

public class practice_set7_pr09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius(°C) to convert in Fahrenheit(°F)");
        float user = sc.nextFloat();
        System.out.println(user+ "°C");
        float ans = (1.8f)*user + 32;
        System.out.println("You entered "+ user+" °C");
        System.out.println("The ans in Fahrenheit is "+ ans + " °F ");
//        System.out.println(ans);

    }
}
