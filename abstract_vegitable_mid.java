package com.company;

abstract class Vegetable{
    String vegetableColor;
    abstract String stringAns();
}
class potato extends Vegetable{
    String vegetableColor = "Yellow";
    String stringAns(){
       return vegetableColor;
    }
}
class brinjal extends  Vegetable{
    String vegetableColor = "Red";
    String stringAns(){
        return vegetableColor;
    }
}
class tomato extends Vegetable{
    String vegetableColor = "Green";
    String stringAns(){
        return vegetableColor;
    }
}
public class abstract_vegitable_mid {
    public static void main(String[] args) {
        potato p =new potato();
//        System.out.println(p.vegetableColor);
        System.out.println(p.vegetableColor);

        brinjal b = new brinjal();
        System.out.println(b.vegetableColor);
        b.stringAns();

        tomato t = new tomato();
        System.out.println(t.vegetableColor);
        t.stringAns();

    }
}
