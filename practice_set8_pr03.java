package com.company;
import java.util.Scanner;
//import com.sun.source.tree.BreakTree;

class Square{
    public int getSide(int n){
        n = n*n;
        return n;
    }
    public int getPara(int n){
        return 4*n;
    }
}
public class practice_set8_pr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get Square of:");
        int user = sc.nextInt();

        Square sq =  new Square();
        System.out.println("The area of Square of "+ user +" is "+sq.getSide(user));
        System.out.println("The parameter of square of "+ user+ " is "+sq.getPara(user));

    }
}
