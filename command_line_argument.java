package com.company;
import java.util.Scanner;

class demo{
    demo(){
        System.out.println("I am the constructor");
    }
    demo(int a){
        System.out.println("I am the constructor with a value is: " + a);
    }
}
public class command_line_argument{
    public static void main(String[] args) {
        System.out.println("Your first argument is: "+args[0]);
//        Scanner sc = new Scanner(System.in);
//        demo p = new demo(3);
//        demo pw = new demo();
    }

}

