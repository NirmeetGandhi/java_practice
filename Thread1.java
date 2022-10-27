package com.company;
class ThreadDemo extends Thread{

    public void run(){

       for (int i =0;i<11;i++){
           System.out.println("Thread1 " + i);
           i++;
       }
    }
}
//class ThreadDemo1 extends Thread{
//    @Override
//    public void run(){
//        int i = 0;
//        while (i<10){
//            System.out.println("Thread2 " + i);
//            i++;
//        }
//    }
//}
public class Thread1 {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        t1.start();
        t2.start();

        for (int i = 0; i < 11; i++) {
            System.out.println("Main Thread");
        }
    }
}
