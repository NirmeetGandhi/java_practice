package com.company;

abstract class Nirmeet01{
    abstract public void greet();
    public void sayHi(){
        System.out.println("Hello");
    }
}
class one extends Nirmeet01{
    public void greet(){
        System.out.println("Hola");
    };
}
public class test_abstract {
    public static void main(String[] args) {

    }
}
