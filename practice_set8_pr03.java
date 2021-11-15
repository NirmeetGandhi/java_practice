package com.company;
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

        Square sq =  new Square();
        System.out.println("The area of Square is  "+sq.getSide(3));
        System.out.println("The parameter of square is "+sq.getPara(3));

    }
}
