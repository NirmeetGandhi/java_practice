package com.company;

class Nirmeet{
    Nirmeet(){
        System.out.println("I am the constructor of Nirmeet class");
    }
    Nirmeet(int x){
        System.out.println("I am the constructor of Nirmeet class with the value of x is "+ x );
    }
    public void math1(int i){
        System.out.println("I am in class Nirmeet");
    }
    public void math2(){
        System.out.println("I am in class Nirmeet and in mathod2");
    }
}

class Nir01 extends Nirmeet{
    public void math3(){
        System.out.println("I am in class Nir01 and in math3");
    }
    @Override
    public void math2(){
        System.out.println("I am in class Nir01 and in mathod2");
    }
    Nir01(){
        super(3);
        System.out.println("I am the constructor of class Nir01");
    }
}
public class test {
    public static void main(String[] args) {
//        Nirmeet n = new Nirmeet();
//        n.math2();
        Nir01 d =  new Nir01();
//        d.math2();
    }
}
