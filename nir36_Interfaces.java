package com.company;
 // interface ka matlab agar koi  iss interface class kpo use kar raha hai to us class me jo interface
 // class ki sari methods hai unki body ban ni hi chaliye
interface Bicycle{
    int a = 45;
    public void applyBreak(int decrement);
    public void speedUp(int increment);
}
interface Bicycle1{
    int x = 34;
    public void blowHornKgf();
    public void blowHornInception();
}
class aoneCycle implements Bicycle,Bicycle1{
    int a = 3;
    int x = 5;
    // jab bhi hum interface class ki methods ko dusri class me implement karte hai to hame public likhna hi padega
    // varna error milega like hum log ye nahi likh sakte Error milega kyoki public nahi likha hai
//    public void applyBreak(int decrement){
//        System.out.println("Applying Break");
//    }
    // True
    // methods of Bicycle Interface class
    public void applyBreak(int decrement){

        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speed");
    }

    // methods of Bicycle 1 Interface class
    public void blowHornKgf(){
        System.out.println("Hello i am KGF Movie");
    }
    public void blowHornInception(){
        System.out.println("Hello i am Inception movie by christopher Nolan");
    }
}
public class nir36_Interfaces {
    public static void main(String[] args) {
//   hum bohot sare interfaces ko implement karke ek class bana sakte hai aur usi ke sath sath ek class extend bhi
//   kar sakte hai like : class aoneCycle extends Cycle implements Bicycle
// par abstract class me sirf ek parent aur child hota hai
        aoneCycle Nir = new aoneCycle();
        //What we can do:we can give properties in interface
        System.out.println(Nir.a);
        System.out.println(Nir.x);
//        System.out.println(Nir.a);

        //What we cannot do:we cannot modify the properties in interface as they are final
//        Nir.a = 46; --> will throw an error

//        NOTE NOTE NOTE: YOU CAN CREATE REFERENCE OF INTERFACES BUT NOT THE OBJECT OF INTERFACES
    }
}
