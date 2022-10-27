package com.company;

class c1{
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class access_modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
//        c.meth1(); // all the modifiers can be accessed in the same class so here meth1 is the method of same class c1
        // so if I make an object of same class I can use all of them

//        but private modifier can not be accessed in the same package so d is private here in class c1 but it is
//        in the same package so we can not use it
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.b);
//        System.out.println(c.d); // error

    }
}
