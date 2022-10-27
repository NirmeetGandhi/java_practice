package com.company;

import javax.swing.*;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

        public void Base(){
            System.out.println("I am the constructor");
        }
}
class Derived extends Base{ // in this case the Derived class is derived from the Base class , so The Base class
//        is the father of Derived class and the Derived class is the son of Base class.

//        Suppose if I change X in Base class So it will be automatically get change in Derived Class also.
//        now I am making another class but, I want to add all the things that are there in Base class and i this class
//        should also have some of It's own properties so instead of copying all things from the Base class and pasting
//        it in this class I can use inheritance
//        once I write extends and the class name that is Base , all things in the base class will get available for
//        this class . will be able to use those things? that will be decided by access modifiers
    int y;

    public int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class nir31_inharitance {
    public static void main(String[] args) {
//        Base b = new Base();
//        b.setX(3);
//        System.out.println(b.getX());

//        but I can also do the same thing with
//        instead of Base we can also write Derived because all the properties of Base class are in the derives
//        now So we can also use all the properties of base class in derived class
        Derived b = new Derived();
        b.setX(4);
        System.out.println(b.getX());
        Base b1 = new Derived();
//        b1.setY(3);
        b1.Base();
    }
}
