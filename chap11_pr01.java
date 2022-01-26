package com.company;

abstract class pen{
  abstract void write();
  abstract void refill();
}
class fountainPen extends pen{
    public void write(){
        System.out.println("Writing...");
    }
    public void refill(){
        System.out.println("Reefilling...");
    }
    public void changeNib(){
        System.out.println("Changing the Nib");
    }
}
public class chap11_pr01 {
    public static void main(String[] args) {
        fountainPen p = new fountainPen();
        p.changeNib();
        p.write();
        p.refill();
    }
}
