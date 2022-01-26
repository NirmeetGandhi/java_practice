package com.company;

class ph{
    ph(String a){
        System.out.println("i am the constructor in phone "+a);
    }
    public void on(){
        System.out.println("Turning on phone... " );
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}
class sp extends ph{
    private static final String a = "Nirmeet";

    sp(){
        super(a);
        System.out.println("i ma the constructor of smartphone ");
    }
    public void on(){
        System.out.println("Turning on Smartphone...");
    }
    public void greet(){
        System.out.println("Good Morning from smartphone");
    }
    public void swagat(){
        System.out.println("apka swagat hai");
    }
}
public class test_dynamic_methods {
    public static void main(String[] args) {
//        obj.swagat();
//        obj.on();
//        obj.greet();
        sp obj1 = new sp();


//        ph obj1 = new sp();
//        obj1.on();
//        obj1.greet();
//        obj1.swagat();
    }
}
