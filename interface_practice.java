package com.company;

interface Mybicycle{
    int a = 34;
   void applyBreak();
   void Speeedup();
   void Mybicycle();
}

class Avoncycle implements Mybicycle{
    public Avoncycle(){
        System.out.println("I am a Avoncycle constructor");
    }
//    public void Blowhorn(){
//        System.out.println("Pee Pee Poo Poo");
//    }
    public void Mybicycle(){
        System.out.println("I am a Mybicycle class constructor");
    }
    public void applyBreak(){
        System.out.println("Applying break");
    }
    public void Speeedup(){
        System.out.println("Speeding UP");
    }
}
public class interface_practice {
    public static void main(String[] args) {
        Avoncycle p =  new Avoncycle();
//        Mybicycle b = new Mybicycle(); // not possible to create an object of Interface
//        Mybicycle b = new Avoncycle();
//        b.applyBreak();
//        b.Speeedup();
        System.out.println(p.a);
//        p.applyBreak();
//        p.Speeedup();

    }
}
