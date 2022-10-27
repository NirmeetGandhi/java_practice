package com.company;

import java.util.Scanner;

public class random {
    static void meth1(){
        System.out.println("What’s the best thing about Switzerland?\n" +
                "I don’t know, but the flag is a big plus.");
    }
    static void meth1(String nir){
        System.out.println("What’s the best thing about Switzerland?\n" +
                "I don’t know, but the flag is a big plus." + nir);
    }
    static void meth2(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }
    static void meth3(){
        System.out.println("Yesterday I saw a guy spill all his Scrabble letters on the road. I asked him, “What’s the word on the street?”\n" +
                "Once my dog ate all the Scrabble tiles. For days he kept leaving little messages around the house. Don’t miss these hilarious egg puns that will absolutely crack you up.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a random number");
        int c = sc.nextInt();

        if (c>=0 && c<=50){
            meth1();
            meth1("Nirmeet");
        }
        else if(c>50 && c<=100){
         meth2();
        }
        else if(c>100){
            meth3();
        }
    }
}
