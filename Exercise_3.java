package com.company;
import java.util.Random;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Random comp = new Random();
        int comp_input;


//        int comp_input = comp.nextInt(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number ");
//        int user_input = sc.nextInt();

        do {
            System.out.println("Guess the number ");
            int user_input = sc.nextInt();
            comp_input = comp.nextInt(10);

            if (comp_input == user_input){
                System.out.println("Congratulations!! you guessed the correct number");
                break;
            }
            else if(comp_input > user_input){
                System.out.println("Guess the larger number ");
            }
            else if(comp_input < user_input){
                System.out.println("Guess the smaller number ");
            }
        }while (comp_input >=0);
//        System.out.println(comp_input);


    }
}
