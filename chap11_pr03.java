package com.company;

class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal{
public void eat(){
    System.out.println("Eating...");
}
public void sleep(){
    System.out.println("Sleeping...");
}
}
public class chap11_pr03 {
    public static void main(String[] args) {
        Human h = new Human();
        // Que 3
        h.eat();
        h.sleep();
        h.bite();
        h.jump();

        // Que 5
        Monkey m = new Human(); // it will be able to implement only the methods of class Monkey non-other than that
        m.bite();
        m.jump();

        BasicAnimal b = new Human(); // it will be able to implement only the methods of interface BasicAnimal non-other than that
        b.sleep();
        b.eat();
    }
}
