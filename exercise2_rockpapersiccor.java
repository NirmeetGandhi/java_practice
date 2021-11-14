package com.company;
import java.util.Scanner;

public class exercise2_rockpapersiccor {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("USER1:\nChoose--->:\n0-Rock\n1-Paper\n3-Scissor\n");
        int user1 = sc1.nextInt();


        System.out.println("USER2:\nchoose--->:\n0-Rock,\n1-Paper\n3-Scissor\n");
        int user2 = sc1.nextInt();



//        if(user1==0 && user2==0)
//        {
//            String r = "Rock";
//        }
//        else if(user1==1 && user2==1){
//            String p = "paper";
//        }
//        else if(user1==2 && user2==2){
//            String s = "scissor";
//        }

        if(user1==0 && user2==0 || user1==1 && user2==1 || user1==2 && user2==2){
            System.out.println("Sorry!!Play again The game is draw:)");
        }
        else if(user1==0 && user2==2 || user1==1 && user2==0 || user1==2 && user1==0) {
            System.out.println("Congratulations!!User1 Won");
        }
        else if(user2==0 && user1==2 || user2==1 && user1==0 || user2==2 && user1==1)
        {
            System.out.println("Congratulations!!User2 Won");
        }
        else{
            System.out.println("Please Enter Choice Between 0,1 and 2 Only");
        }
        System.out.println("----------------------------------------------------------THANK YOU VERY MUCH FOR PLAYING THIS GAME:)--------------------------------------------------------");


    }
}
