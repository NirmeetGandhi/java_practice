package com.company;

public class practice_set6_pr02 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = 2;
        boolean isInArray = false;

        for (int e:arr){
            if (n==e){

                  isInArray = true;
                  break;
            }

        }
        if (isInArray){
            System.out.println("Number is present");
        }

        else{
            System.out.println("Number is not present");
        }


//        int [] num1 = {1,2,3,4,5,65,6};
//        int n1 = 3;
//        boolean check = false;
//        for (int e:num1){
//            if (n1==e){
//                check = true;
//                break;
//            }
//        }
//        if (check){
//            System.out.println("Yes the number is present in array");
//        }
//        else {
//            System.out.println("The number is not present in array");
//        }

    }
}
