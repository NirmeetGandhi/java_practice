package com.company;

public class varargs {
    public static int varArgs(int ...arr){
        int sum = 0;
        for (int a:arr){
            sum += a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is " + varArgs(4,5));
        System.out.println("The sum of 4 and 5  and 6 is " + varArgs(4,5,6));
        System.out.println("The sum of 4 and 5 , 6 and 7 is " + varArgs(4,5,6,7));
    }
}
