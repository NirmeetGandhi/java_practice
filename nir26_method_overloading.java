package com.company;
// Moral is that we can create two objects with the same name but it should have different parameters!java will automatically
// understand that which function to call according arguments

//we cannot do overloading by changing return type it should be void but we can do method overloading via changing the
//parameters only that is called the method overloading

//parameter gets the value
//argument has the value
public class nir26_method_overloading {
    static  void foo(){
        System.out.println("Good morning bro!");
    }
    // here a is parameter
    static void foo(String a){
        System.out.println("Good morning " + a + " bro");
    }
    static void foo(String a,String b){
        System.out.println("Good morning "+a+" Bro!!" );
        System.out.println("Good morning "+b+" Bro!!" );
    }

    // This is wrong we cannot change the return type with same function name:
//    static int foo(String a,String b){
//        System.out.println("Good morning");
//    }

//    static String foo(String a,String b,String c){
//        System.out.println("a");
//        System.out.println("b");
//        System.out.println("c");
//        return a;
// //       return b;
// //     return c;

//    }

    public static void main(String[] args) {
        foo();
        // this is argument
        foo("Nirmeet");
        foo("Nirmeet","Harry");
    }
}
