package com.company;

interface Camera{
    void takePhoto();
    void takeRecord();
}
interface wifi{
    //    String network = null;
    private void greet() {
        // hum is private method ko implement nahi kar sakte jo class iss class ko implement kar rahi hai
        // par agar hum isko default method me dalenge to hum isko run kar sakte hai agar ye overwrite nahi hua he to
        // uss class me jaha ye interface implement hua hai
        System.out.println("Good Morning!!");
    }
    private void sayHi(){

    }
    void setNetwork(String network);
    default void  getNetwork(){
        greet();
        System.out.println("Getting list of networks");
    }
}
interface Gps{
//    String location = null;
    void setGps(String location);
    void getGps();
}
interface media{
    void playMusic();
    void stopMusic();
}
class cellPhone{
    void callNumber(int number){
        System.out.println("Calling... " + number);
    }
    void talkNumber(int number){
        System.out.println("Connecting... " + number);
    }
}

class mySmartPhone extends cellPhone implements Camera,wifi,Gps,media{
    public void takePhoto(){
        System.out.println("Taking Snap");
    }
    public void takeRecord(){
        System.out.println("Recording Video");
    }
    public void setNetwork(String network){
        System.out.println("Setting Network " + network );
    }
    public void getNetwork(){
        System.out.println("Getting networks");
    }
    public void setGps(String location){
        System.out.println("Setting up "+ location);
    }
    public void getGps(){
        System.out.println("Getting GPS");
    }
    public void playMusic(){
        System.out.println("Playing Music");

    }
    public void stopMusic(){
        System.out.println("Pausing Music");
    }
//    class demo3{
//        int demo;
//
//        public int getDemo() {
//            return demo;
//        }
//
//        public void setDemo(int demo) {
//            this.demo = demo;
//        }
//    }

}
public class NIR37_DEFAULT_METHODS_INTERFACES {
    public static void main(String[] args) {
        mySmartPhone n = new mySmartPhone();
        n.setNetwork("JIO");
        n.getNetwork();


    }
}
