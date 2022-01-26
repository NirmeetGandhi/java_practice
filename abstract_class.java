package com.company;

abstract class Base2{
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract void greet();
}
class Derived2 extends Base2{
    public void greet(){
        System.out.println("Good Morning");
    }
}
class Derived3 extends Base2{
    public void greet(){
        System.out.println("Guten Morgen");
    }
}
abstract class Derived4 extends Base2{
//    public void greet(){
//        System.out.println("Hallo");
//    }
    abstract void moveTo();
}
class Derived5 extends Derived4{
    public void moveTo(){
        System.out.println("HI");
    }
    @Override
    public void greet(){
        System.out.println("Nirmeet");
    }
}
public class abstract_class {
    public static void main(String[] args) {

    }
}
