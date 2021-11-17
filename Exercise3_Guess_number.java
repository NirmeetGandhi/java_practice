package com.company;
import java.util.Scanner;
import java.util.Random;

class Game{
    int number;
    int cNumber;
    int user_input;
    int comp_input;
    int noOfGuesses;


    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        number  = user_input;
//        System.out.println(user_input);
    }
    public void randNumber(){
        Random rand = new Random();
        int comp_input = rand.nextInt(100);
        cNumber = comp_input;
//        System.out.println(cNumber);
    }
    public void ans(){

//        int ans;
            if (number == cNumber) {
                System.out.println("Congratulations!!You have guessed the correct number ☺ ☺ ️");
            }
            else if (number > cNumber && number <= 100) {
                System.out.println("You guessed too high");
                System.out.println();
            }
            else if (number < cNumber && number <= 100) {
                System.out.println("You guessed too low");
                System.out.println();
            }
            else {
                System.out.println("WARNING:PLEASE GUESS THE NUMBER UNDER 100 ONLY");
         }
    }
    public boolean check(){
        boolean check = false;
        while (number == cNumber){
            check = true;
            break;
        }
        return check;
    }
}
public class Exercise3_Guess_number {
public static void main(String[] args) {
        Game pl = new Game();
        System.out.println("Computer have guessed the number");
    System.out.println("Now it's your time to guess the number");
    pl.randNumber();
        while(!pl.check()) {
//            pl.randNumber();
            System.out.println("Guess the number:");
            pl.takeUserInput();
            pl.ans();
        }
    System.out.println(" ☺ ☺ Thank you so much for playing this game i hope you had a nice time playing this game");
    System.out.println();
    System.out.println(" ☺ ☺  ️TheGame is developed by Nirmeet Gandhi  ☺ ☺ ");
        }
    }
