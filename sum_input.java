package com.company;
import java.util.Scanner;
class s1{

}
public class sum_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user;
        do {
            System.out.println("press 1 to Enter number, 2 to exit");
            user = sc.nextInt();
            switch (user){
                case 1:
                    System.out.println("Enter number");
                    int inp = sc.nextInt();
                    int r, sum = 0;
                    while (inp > 0) {
                        r = inp % 10;
                        sum = sum + r;
                        inp = inp / 10;
                    }
                    System.out.println("The sum is:" + sum);

                case 2:
                    System.out.println("Thank You");
            }
//            System.out.println("Enter number");
//            int inp = sc.nextInt();
//            int r, sum = 0;
//            while (inp > 0) {
//                r = inp % 10;
//                sum = sum + r;
//                inp = inp / 10;
//            }
//            System.out.println("The sum of " + inp + "is " + sum);

        }while (user!=2);
    }
}
