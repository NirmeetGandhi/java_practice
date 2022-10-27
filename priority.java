package com.company;

public class priority {
    static int math1(int x , int y){
        int z;
        if(y>x){
            z = x+y;
            System.out.println(z);
        }
        else{
            z = x-y;
            System.out.println(z);
        }
        return z;
    }
    public static void main(String[] args) {
        int c =  math1(4,5);
        priority obj1  = new priority();
        obj1.math1(4,5);
//        System.out.println(c);
    }
}
