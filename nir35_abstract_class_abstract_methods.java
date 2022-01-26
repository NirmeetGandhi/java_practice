package com.company;

abstract class parent{
    void parent(){
        System.out.println("I ma the constructor of parent class");
    }
    int parent(int i){
        System.out.println("Hallo ich bin Nirmeet");
        return i;
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    // if we write atleast one method of abstract method we must have to make the whole class abstract in ehich that
    // abstract method id declared.
    // it is like
    // 1 gandi machli pure talab ko ganda kar deti hai
    // matlab ek abstract method pure class ko abstract bana deti hai
    // aur agar app puri class ko abstract nahi banana chahte to abstract method ko hata lo
    abstract public void greet();
    // uper hamne ek greet method bana diya hai aur aab ham is greet method ko alag alag class me jo usme greet kravana
    // chahe vo karva sakte hai jaise hamne niche child class me banaya
}

// to aab agar hum log parent class ko exten karte hai jo ek abstract class hai kuyki usme ek abstract method
// hai aur agar hum parent class ko extend karte hai to wo puri class yaa to abstarct honi chaliye ya to wo
// method compalsary honi chahiye jo abstract method ho.
class child extends parent{
    @Override
    public void greet(){
        System.out.println("Hello!! Good Morning");
    }

}
class child1 extends child{
    @Override
    public void greet(){
        System.out.println("Hola");
    }
}
 class child2 extends parent{
     @Override
    public void greet(){
        System.out.println("안녕하십니까");
    }
}
public class nir35_abstract_class_abstract_methods {
    public static void main(String[] args) {
        child2 c = new child2();
        c.greet();

        // it is possible to create a reference of an abstract class. --> Possible
        parent obj = new child(); //Possible
        // NOTE: BUT IT IS NOT POSSIBLE TO CREATE AN OBJECT OF AN ABSTRACT CLASS. --> Not Possible
//        parent obj1 = new parent();// Not Possible

    }
}
