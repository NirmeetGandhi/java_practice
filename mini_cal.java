package com.company;

import java.util.Scanner;

public class mini_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        float a = sc.nextFloat();

        System.out.println("Enter second number");
        float b = sc.nextFloat();
        float c;

        int user;
         do{
             System.out.println("press 1 for Addition , 2 for subtraction , 3 for multiplication , 4 for division , 5 to get remainder , 6 to Exit");
             user = sc.nextInt();

             switch (user){
                 case 1:
                     c = a+b;
                     System.out.println("The addition is: "+c);
                     break;
                 case 2:
                     c= a-b;
                     System.out.println("The subtraction is: "+c);
                     break;
                 case 3:
                     c = a*b;
                     System.out.println("The multiplication is: "+c);
                     break;
                 case 4:
                     c = a/b;
                     System.out.println("The division is: "+c);
                     break;
                 case 5:
                     c = a%b;
                     System.out.println("The remainder is: "+c);
                     break;
                 case 6:
                     System.out.println("Thank you");
             }

         }while (user!=6);
    }
}
