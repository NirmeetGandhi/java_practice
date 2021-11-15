package com.company;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors_game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int comp = rand.nextInt(3);
//        System.out.println(comp);
        System.out.println("Please wait a sec wfile computer is Choosing :):)");
        System.out.println();

        System.out.println("Computer have chosen , now it's your time to choose:");
        System.out.println("Enter\n0 for Rock\n1 for paper\n2 for scissor");
        int user = sc.nextInt();
        if (user==0 && comp ==0 || user==1 && comp ==1 || user==2 && comp ==2){
            System.out.println("The game is draw!!");
            System.out.println();
        }
        else if(comp==0 && user==1 || comp==1 && user==0 || comp==2 && user==1){
            System.out.println("Sorry!!!Computer won!!");
            System.out.println();
        }
        else if(user==0 && comp==2 || user == 1 && comp == 0 || user==2 && comp==1){
            System.out.println("Congratulations,You won!!");
            System.out.println();
        }
        else {
            System.out.println("Please enter choice between 0 1 and 2 only");
        }
        System.out.println("BECAUSE");
        System.out.println("Computer have chosen:" + comp);
        System.out.println("You have chosen: " + user);

    }
}
