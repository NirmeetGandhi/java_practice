package com.company;
import java.util.Scanner;

class temp{
    public static int user_input;
//    int user_input;
    int user;
    int switch_input;
    static void takeUserInput(){
//        int user;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temprature in °C");
        int user = sc.nextInt();
        user_input = user;
        System.out.println("You have entered " + user + " °C");
    }
    static void convertInFerenhite(){
        float ans  = (1.8f)*user_input+ 32;
        System.out.println("The ans in ferenhite is " +ans+ "°F");
    }
    static void convertInKelvin(){
        float ans1 = user_input + 273.15f;
        System.out.println("The ans in Kelvin is " + ans1 + "K");
    }
    public static void ans(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to convert in Ferenhite");
        System.out.println("Press 2 to convert in kelvin");
        System.out.println("Press 3 to Exit");
        int switch_input = sc.nextInt();
        switch (switch_input){
            case 1:
                convertInFerenhite();
            case 2:
                convertInKelvin();
            case 3:
                System.out.println("Thank You");
        }

    }

}
public class temprature_convertor {
    public static void main(String[] args) {
//        temp1.takeUserInput();
//        temp1.ans();
    }
}
