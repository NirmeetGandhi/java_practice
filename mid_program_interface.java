package com.company;

interface A1{
    void greet();
}
abstract class B1{
    abstract void sayHi();
}
class C extends B1 implements A1{
    public void greet(){
        System.out.println("Good Morning");
    }
    void sayHi(){
        System.out.println("HI");
    }
}
class D extends C{
    void dMeth(){
        System.out.println("I am D's method");
    }
}
public class mid_program_interface {
    public static void main(String[] args) {
        D d = new D();
        d.dMeth();
        d.greet();
        d.sayHi();
    }
}
