package com.company;
import java.util.Random;
import java.util.Scanner;

class Game1{
    int number;
    int c_number;
    int user_input;
    int comp_input;

    public void setUser_input(){
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        number = user_input;
    }
    public void Rand(){
        Random rd = new Random();
        int comp_input = rd.nextInt(100);
        c_number = comp_input;
    }
    public void ans(){
        if (number==c_number){
            System.out.println("Congratulations!!You have guessed the correct number");
        }
        else if(number > c_number && number<100){
            System.out.println("You guessed too high");
        }
        else if(number < c_number && number<100){
            System.out.println("You guessed too Low");
        }
        else {
            System.out.println("Please guess the number between 0 and 100 only");
        }
    }
    public boolean check(){
        boolean check = false;
        while (number==c_number){
            check = true;
            break;
        }
        return check;
    }
}
public class guess_number {
    public static void main(String[] args) {
        Game1 play = new Game1();
        System.out.println("Welcome to the game Guess the number");
        System.out.println();
        play.Rand();
        while (!play.check()){
            System.out.println("Guess the Number");
            play.setUser_input();
            play.ans();
        }


    }
}
