package com.company;
class MyParent{
    MyParent(){
        System.out.println("I am parent class constructor");
    }
    MyParent(int x){
        System.out.println("I am parent class constructor with x value " + x);
    }
}
class MyChild extends MyParent{
    MyChild(){
        System.out.println("I am child class constructor");
    }
    MyChild(int x,int y){
        super(x);
        System.out.println("I am child class constructor with y value " + y);
    }
}
class ChildOfMyChild extends MyChild{
    ChildOfMyChild(){
        System.out.println("I am ChildOfMyChild class constructor");
    }
    ChildOfMyChild(int x,int y,int z){
        super(12,13);
        System.out.println("I am ChildOfMyChild class constructor with z value " + z);
    }
}
public class super_constructor_inheritance {
    public static void main(String[] args) {
        ChildOfMyChild c = new ChildOfMyChild(12,13,15);

    }
}
