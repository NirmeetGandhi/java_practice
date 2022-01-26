package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class sampleClass implements childSampleInterface{
   public void meth3(){
       System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
}
public class inheritance_interface {
    public static void main(String[] args) {
        sampleClass s = new sampleClass();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
}
