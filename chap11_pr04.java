package com.company;

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Lifting");
    }
    public void disconnect(){
        System.out.println("Disconnecting...");
    }
}
public class chap11_pr04 {
    public static void main(String[] args) {

        Telephone t = new smartTelephone();
        smartTelephone s = new smartTelephone();
        s.disconnect();
        s.lift();
        s.ring();
        System.out.println();
        t.ring();
        t.lift();
        t.disconnect();
    }
}
