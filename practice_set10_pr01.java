package com.company;

class Circle1{
    int radius;
    Circle1(){
        System.out.println("I am the non param constructor");
    }
    Circle1(int r){
        System.out.println("I am the parameterized constructor");
    }
     public double area(int radius){
         return Math.PI*this.radius*this.radius;
     }
}

class myCylinder extends Circle1{
    int height;
    myCylinder(){
        super(12);
        System.out.println("I am the parameterized constructor");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class practice_set10_pr01 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();

        c1.area(12);
    }
}
