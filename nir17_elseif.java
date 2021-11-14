package com.company;
import java.util.Scanner;

public class nir17_elseif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age to check if you are eligible or not:");
        int inputage = sc.nextInt();
//        int age = 19;
        switch (inputage) {
            case 18 -> System.out.println("Congrats you are 18");
            case 28 -> System.out.println("Congrats you are 28");
            case 38 -> System.out.println("Congrats you are 38");
            case 48 -> System.out.println("Congrats you are 48");
            default -> System.out.println("Please choise between 18 ,28,38 or 48");
        }
        /*
        if(inputage==18){
            System.out.println("You are is  still 18 you cannot go to thr party yet turn to 19 to get in party");
        }
        else if (inputage>18){
            System.out.println("Congratulations! you are " + inputage + " You can go to the  party");
        }
        else if(inputage>18){
            System.out.println("Sorry You are not mature enough to come in party");
        }
        else{
            System.out.println("Sorry you are still " + inputage +  " turn  19 to come in the party");
        }
        */

    }
}
