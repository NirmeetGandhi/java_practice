package com.company;

class myBase{
    myBase(){
        System.out.println("I am the constructor of base class");
    }
    myBase(int a){
        System.out.println("I am the overloaded constructor of base class with value of a: " + a);
    }
}
class myDerived extends myBase{
    myDerived(){
        super(0);
        System.out.println("I am the constructor of derived class");
    }
    myDerived(int b){
        super(1);
        System.out.println("I am the overloaded constructor of derived class with the value of b is " + b);
    }
}
class myDerived1 extends myDerived{
    myDerived1(){
        super(2);
        System.out.println("I am the constructor of myDerived1 class");
    }
    myDerived1(int c){
        System.out.println("I am the overloaded constructor of myDerived1 class with the value of c is "+ c);
    }
}

class myDerived2 extends myDerived1{
    myDerived2(){
        System.out.println("I am the constructor of myDerived2 class");
    }
    myDerived2(int d){
        System.out.println("I am the overloaded constructor of myDerived2 class with the value of d is "+ d);
    }
}
public class test_constructor_in_inheritance {
    public static void main(String[] args) {
        myDerived2 d = new myDerived2(4);
    }
}
