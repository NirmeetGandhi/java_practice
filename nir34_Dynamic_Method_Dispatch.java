package com.company;

class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class smartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on smart Phone...");;
    }
    public void welcome(){
        System.out.println("We welcomes You");
    }

}
public class nir34_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        one obj = new one();

        Phone obj = new smartPhone(); // --> VALID
//        smartPhone obj1 = new Phone(); --> Not VALID
        //reference is of super class m
        // means in this case super class is one , and the object is of sub Class means in
        // this case the subclass is two , so we can do that it is valid

        // so Eventually the rule is:
       // reference of super class = object of sub class
        // then and then it is only valid

        obj.on();
        obj.greet();
//        obj.welcome(); --> not allowed
//        obj.welcome(); ---> Not valid we can use all the functions of super class only means phone in this case but
        // if it overrides like in this case , here on is also in the phone as well as in the smartphone class ,so it will
        // run the on of sub class .

    }
}
