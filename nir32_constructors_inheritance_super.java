package com.company;

class Base12{
    Base12(){
        System.out.println("I am a constructor");
    }
    Base12(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
    public void math2(){
        System.out.println("I am in class Base12 now");
    }
}

class Derived12 extends Base12{
    @Override
    public void math2(){
        System.out.println("I am in class derived12 now");
    }
    Derived12(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived12(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived12{

    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class nir32_constructors_inheritance_super {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
//        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
        Base12 b = new Base12();
        b.math2();
        Derived12 d = new Derived12();
        d.math2();
    }
}
