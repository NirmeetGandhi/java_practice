package com.company;

class Base123{
    Base123(){
        System.out.println("I am a constructor");
    }
    Base123(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived123 extends Base123{
    Derived123(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived123(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived123 extends  Derived123{
    ChildOfDerived123(){
        System.out.println();
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived123(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class constructor_inheritance {
    public static void main(String[] args) {
// Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived123 cd = new ChildOfDerived123(12, 13, 15);



    }
}
