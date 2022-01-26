package com.company;

interface TVRemote{
    public void VolumeUP();
    public void VolumeDown();
    public void ChannelUP();
    public void ChannelDown();
}
interface smartTvRemote extends TVRemote{
    public void TurnOTT();
}
class TV implements smartTvRemote{
    public void TurnOTT(){
        System.out.println("Turning on OTT");
    }
    public void VolumeUP(){
        System.out.println("Raising Volume");
    }
    public void VolumeDown(){
        System.out.println("Reducing Volume");
    }
    public void ChannelUP(){
        System.out.println("Raising channel");
    }
    public void ChannelDown(){
        System.out.println("Reducing Channel");
    }
}
public class chap11_pr06 {
    public static void main(String[] args) {

    }
}
