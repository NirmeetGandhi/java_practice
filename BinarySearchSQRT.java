package com.company;

public class BinarySearchSQRT {
    static double sqrt(int n,int p){
        int st = 0;
        int en = n;
        double root = 0.0;
        while (st<=en){
            int mid = st + (en-st)/2;
            if (mid*mid==n){
                //if ans is perfect square root then return it
                return mid;
            }
            else if(mid*mid>n){
                en = mid -1;
            }
            else{
                st = mid +1;
            }
        }
        double increment = 0.1;
        for (int i = 0; i<=p;i++){
//            root = root + p;
            while (root*root<=n){
                root += increment;

            }
            //once this condition breaks we know that we need to decrement so subtract increment from root
            root = root - increment;
            //cause first it will be 0.1 then 0.01 then 0.001 ...
            increment = increment/10;

            }
        return root;
        }
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(40));
        int n = 40;
        int p = 10;

//        System.out.printf("%.2f" , sqrt(n,p));
        System.out.println(sqrt(n,p));
        System.out.println(Math.sqrt(n));
//        System.out.println("नमस्ते");
    }
}
