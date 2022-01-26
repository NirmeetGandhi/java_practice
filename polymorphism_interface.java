package com.company;
interface myCamera2{
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
interface myWifi2{
    void connect(String net);
    void disConnect();
}
class phone2{
    public void pickCall(int number){
        System.out.println("Picking Up number "+ number);
    }
    public void cutCall(int number){
        System.out.println("Disconnecting number "+ number);
    }
}
class SmartPhone12 extends phone2 implements myCamera2,myWifi2{
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
public class polymorphism_interface {
    public static void main(String[] args) {
        myCamera2 cam1 = new SmartPhone12(); // This is a smartphone but  use it as camera
        // agar mai is tarah se mycamera2 ka reference leta hu to me sirf mycamera2 wali
        //classes ko hi use kar sakta hu
        cam1.record4KVideo();
//        cam1.connect(); // Not allowed

    }
}
