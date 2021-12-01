package com.company;

interface Bicycle2{
    // Bodies must be empty
    public void speedUp();
    public void speedDown();
    // Not Possible we can not define any properties in interfaces we can just declare it
//    public void clutch(){
//        System.out.println("Clutch");
//    }
}

class avonCycle implements Bicycle2{
    public void speedUp(){
        System.out.println("Speeding Up the bicycle");
    }
    public void speedDown(){
        System.out.println("Decreasing the speed of Bicycle");
    }
}
public class interfaces {
    public static void main(String[] args) {
//        Bicycle2 b = new Bicycle2(); // not possible to create object of interface
          Bicycle2 b = new avonCycle(); // possible to create reference of an interface
//        avonCycle a = new Bicycle2(); // not possible
//         interface ka object nahi ban sakta par reference ban sakta hai
        }
    }

