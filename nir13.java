package com.company;
import java.util.Scanner;

public class nir13 {
    public static void main(String[] args) {
        System.out.println("Hello");
        String a = new String("Nirmeet");
        String b = "Gandhi";
//        System.out.println(a);
//        System.out.println(b);
        int i = 34;
        float f  = 4.567f;
        // System.out.printf("The name is %s and the surname is %s",a,b); // both printf and printformat are same
        // System.out.format("The name is %s and the surname is %s",a,b); // both printf and printformat are same

        // TAKING A STRING AS A INPUT FROM USER
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
