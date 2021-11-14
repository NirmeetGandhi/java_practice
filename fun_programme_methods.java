package com.company;
import java.util.Scanner;

public class fun_programme_methods {
    static void telljoke(){
        System.out.println("Did you hear about the mathematician who’s afraid of negative numbers?\n" +
                "He’ll stop at nothing to avoid them.");
    }
    static void telljok1e(){
        System.out.println("What’s the best thing about Switzerland?\n" +
                "I don’t know, but the flag is a big plus..");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int user = sc.nextInt();
        if (user==3){
            telljoke();
        }
        else{
            telljok1e();
        }




    }
}

