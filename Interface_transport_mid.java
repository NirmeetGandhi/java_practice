package com.company;

interface Transport{
    void deliver();
    default void animal(){
        greet();
        System.out.println("Just for understanding concept of default methods");
    }
    private void greet(){
        System.out.println("Hi");
    }
}
abstract class animal{
    abstract void show();
}
class Tiger extends animal{
    @Override
    void show(){
        System.out.println("Tiger");
    }
}
class camel extends animal implements Transport{
    void show(){
        System.out.println("Camel");
    }
    public void deliver(){
        System.out.println("Hey Camel,We are delivering you to your owner");
    }
}
class Deer extends animal{
    void show(){
        System.out.println("Deer");
    }
}
class Donkey extends animal implements Transport{
    void show(){
        System.out.println("Donkey");
    }
    public void deliver(){
        System.out.println("Hey Donkey,We are delivering you to your owner");
    }
}
public class Interface_transport_mid {
    public static void main(String[] args) {
        Donkey d = new Donkey();
        d.deliver();
        d.show();

        String [] Animal = new String[4];
//        Animal[0] = d.show();
    }
}
