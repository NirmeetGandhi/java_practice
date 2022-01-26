package com.company;

interface myCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Afternoon");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K");
    }
}
interface myWifi{
    void connect(String net);
    void disConnect();
}
class phone{
    public void pickCall(int number){
        System.out.println("Picking Up number "+ number);
    }
    public void cutCall(int number){
        System.out.println("Disconnecting number "+ number);
    }
}
class SmartPhone1 extends phone implements myCamera,myWifi{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public void connect(String net){
        System.out.println("Connecting "+ net);
    }
    public void disConnect(){
        System.out.println("Disconnecting");
    }
//    public void record4KVideo(){
//        System.out.println("Taking Snap and Recording in 4K");
//    }

}
public class interface_example {
    public static void main(String[] args) {
        SmartPhone1 ms = new SmartPhone1();
        ms.connect("Google");
        ms.record4KVideo();
    }
}
