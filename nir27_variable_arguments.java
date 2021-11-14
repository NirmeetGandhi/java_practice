package com.company;

public class nir27_variable_arguments {
//    instead of writing all above functions we can write the function that is written below it makes the array of all the
//    arguments passed by the user abd then perform action on that


//    static int sum(int a,int b){
//        return  a+b;
//    }
//    static int sum(int a,int b,int c){
//        return  a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return  a+b+c+d;
//    }

//    instead of writing all above functions we can write the function that is written below it makes the array of all the
//    arguments passed by the user abd then perform action on that
    static int mul(int a,int ...arr){
        int result = a;
        for (int e:arr){
            result = result*e;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome");
        // we cann not do this because we have made onr argument comalsary we must have to give one argument
        System.out.println("The Multiplication of nothing is"+ mul(3));

        System.out.println("The Multiplication of 3 and 4 is "+ mul(3,4));
        System.out.println("The Multiplication of 3 ,4 and 5 is "+ mul(3,4,4));
        System.out.println("The Multiplication of 3 ,4 ,5 and 6 is "+ mul(3,4,5,6));
        System.out.println("The Multiplication of 3 ,4 ,5 , 6 and 7 is "+ mul(3,4,5,6,7));
    }
}
