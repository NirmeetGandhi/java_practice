package com.company;

class Base1{
    Base1(){
        System.out.println("I am a constructor of Base class");
    }
    Base1(int a){
        System.out.println("I am a the overloaded constructor of Base class with value: "+ a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(3);
        System.out.println("I am the constructor of derive class");
    }
}
public class nir32_constructors_in_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        // Thus the derived1 class is extended from Base1 class I have only made a constructor in Base1 class but the \
        // Derived1 class is derived from Bae1 class It will also run the constructor of Base1 class and if the Derived1
        // class will have it's own constructor it will also run the constructor of Base1 class as well as it's own
        // Constructor
        Derived1 d = new Derived1();
    }
}
