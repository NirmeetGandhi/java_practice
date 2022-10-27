package com.company;

public class recursion_basic_problems {

    static int reach(int src , int dest){
        if (src==dest){
            return 0;
        }
        System.out.println("src " + src + " Dest " + dest);
        return reach(src+1,dest);
    }
    static void printNormal(int n){
        if (n<2){
//            System.out.println(n);
            return;
        }
        printNormal(n-1);
        System.out.println(n);

    }
    static void printRev(int n){
        if (n==0){
//            System.out.println(n);
            return;
        }
        printRev(n-1);
        System.out.println(n);
    }
    static void printt1ton(int n){
        if (n==0){
            return;
        }
        printt1ton(n-1);
        System.out.println(n);
    }
    static int product(int n){
        if (n<2){
            return n;
        }
        return n * product(n-1);
    }
    static int sum(int n){
        if (n<2){
            return n;
        }
        return n + sum(n-1);
    }
    static int sumOfDigits(int n){
      if (n<2){
          return n;
      }
      int r = n %10;
      return r + sumOfDigits(n/10);
    }
    static int productOfDigits(int n){
        if (n<2){
            return n;
        }
        int r = n %10;
        return r * productOfDigits(n/10);
    }
    static void test(int n){
        int r;
        int sum=0;

        while (n>0){
            r = n %10;
            sum = sum +r;
            n = n/10;
        }
        System.out.println(sum);
    }
    //iterative approach
    static void pali(int n){
        int r;
        int s =0;
        int c=n;

        while (n>0){
            r = n %10;
            s = (s*10)+r;
            n = n /10;
        }
        System.out.println(s);
    }
    //recursive approach
    static  int sum =0;
    static void palindrome(int n){
        if (n <= 0){
            return;
        }
        int r = n %10;
        sum = (sum*10)+r;
        palindrome(n/10);
    }
    public static void main(String[] args) {
//        System.out.println( reach(0,10));
//        System.out.println(printNormal(5));
//        System.out.println();
//        printt1ton(5);
//        printRev(5);
//        System.out.println(product(4));
//        System.out.println(sum(5));
//        System.out.println(sumOfDigits(1234));
//        test(1234);
//        System.out.println(sumOfDigits(1234));
//        System.out.println(productOfDigits(1204));
//        pali(143);
        palindrome(1243);
        System.out.println(sum);
    }
}
