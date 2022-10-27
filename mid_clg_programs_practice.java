package com.company;
import java.util.Scanner;
class Fan{
    int slow = 1;
    int medium =2;
    int fast = 3;
    int speed = 1;
    boolean f_on;
    double radius = 4;
    String color = "Blue";

    void show(boolean on){
        if(on){
            System.out.println("Fan is On");
            System.out.println(speed);
            System.out.println(radius);
            System.out.println(color);
        }
        else{
            System.out.println("Fan is Off");
            System.out.println(radius);
            System.out.println(color);
        }
    }

}
public class mid_clg_programs_practice {
    static void occurrenceInString(char target){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int count = 0;

        for (int i = len-1; i >=0 ; i--) {
            if (str.charAt(i)==target){
                count++;
            }
        }
        System.out.println(target + " is occurring " + count + " times in " + str);
    }

    static void stringPalindromeCheck(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String org_str = str;
        String rev_Str = "";
        int len = str.length();

        for (int i = len-1; i >=0 ; i--) {
            rev_Str = rev_Str + str.charAt(i);
        }
        if (rev_Str.equals(org_str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    static void printReverse(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        String rev_Str = "";
        for (int i = len-1; i >=0 ; i--) {
            rev_Str = rev_Str + str.charAt(i);
        }
        System.out.println(rev_Str);
    }


    public static void main(String []args){
//        occurrenceInString('e');
//        stringPalindromeCheck();
//        printReverse();
        Fan f = new Fan();
        f.show(true);
    }
}
