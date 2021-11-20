package com.company;

class A{
    public int Nir(){
        return 3;
    }
    public void meth2(){
        System.out.println("Hello i  am method 2 of class A");
    }

}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("Hello i  am method 2 of class B");
    }
    public void meth3(){
        System.out.println("Hello i  am method 3 of class B");
    }
}
public class nir33_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth2();
        b.meth2();
    }
}
