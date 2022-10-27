package com.company;

import java.util.Scanner;

public class practice_set7_problem09 {
    public static void main(String[] args) {
        System.out.println("Enter the temprature in celcius to convert in ferenhite or kelvin");
        Scanner sc = new Scanner(System.in);
        float user1  = sc.nextFloat();

        System.out.println("Press 1 to convert in Ferenhite");
        System.out.println("Press 2 to convert in kelvin");
        System.out.println("Press 3 to Exit");

        int user = sc.nextInt();

            switch (user){
                case 1:
                    //convertes in ferenhite
                    System.out.println("You have entered " + user1+ "°C");
                    float ans  = (1.8f)*user1 + 32;
                    System.out.println("The ans in ferenhite is " +ans+ "°F");
                    break;
                case 2:
                    //converts in kelvin
                    System.out.println("You have entered " + user1+ "°C");
                    float ans1 = user1 + 273.15f;
                    System.out.println("The ans in Kelvin is " + ans1 + "K");
                    break;
                case 3:
                    System.out.println("Thank you");
            }

//        System.out.println("You have entered " + user+ "°C");
//        float ans  = (1.8f)*user + 32;
//        System.out.println("The ans in ferenhite is " +ans+ "°F");
    }
}
