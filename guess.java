package com.company;
import java.util.Random;
import java.util.Scanner;

class Game3{
    int number;
    int c_number;
    int user_input;
    int comp_input;

    public void setUser_input(){
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        number = user_input;
    }
    public void Random(){
        Random rand = new Random();
        int comp_input = rand.nextInt(100);
        c_number = comp_input;
    }
    public void ans(){
        if (number==c_number){
            System.out.println("Congratulations!!You guessed the correct number");
        }
        else if(number > c_number && number<=100){
            System.out.println("You guessed too high");
        }
        else if(number < c_number && number<=100){
            System.out.println("You guessed too low");
        }
        else {
            System.out.println("Guess the number between 0 and 100 only");
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
public class guess {
    public static void main(String[] args) {
        Game3 play = new Game3();
        System.out.println("Welcome to the Game");
        System.out.println("Guess the number between 0 and 100 only");
        play.Random();

        while (!play.check()){
            System.out.println("Guess the Number");
            play.setUser_input();
            play.ans();
        }
    }
}
