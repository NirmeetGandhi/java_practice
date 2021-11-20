package com.company;

class Animal{
    String Sound;

    public String getSound() {
        return Sound;
    }

    public void setSound(String sound) {
        Sound = sound;
    }
}
class Dog extends Animal{
    String Dog;
}

public class nir31_quick_quiz {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        d.setSound("Bark!!Bark");
        System.out.println(d.getSound());
    }
}
