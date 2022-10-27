package com.company;

class T1 implements Runnable{
    public void run(){
        for (int i = 0; i <11 ; i++) {
            System.out.println("Thread1 " + i);
        }
    }
}
class T2 implements Runnable{
    public void run(){
        for (int i = 0; i <11 ; i++) {
            System.out.println("Thread2 " + i);
        }
    }
}
public class ThreadDemooo {
    public static void main(String[] args) {
        T1 t = new T1();
        T2 t1 =  new T2();
        Thread obj = new Thread(t);
        Thread obj1 = new Thread(t1);
        obj.start();
        obj1.start();
    }
}
