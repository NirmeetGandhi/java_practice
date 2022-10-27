package com.company;
abstract class parent12{
    static void th(){
        System.out.println("Thanks");
    }
    abstract void greet();
}

abstract class child12 extends parent12{
    abstract void greet2();
}
class chilfofchild extends parent12{
    void greet2(){
        System.out.println("HIIIII");
    }
    void greet(){
        System.out.println("HI");
    }
}
public class abstract_class_mid {
//     parent12 p = new child12(); // throws an error
    parent12 p = new chilfofchild();

}
