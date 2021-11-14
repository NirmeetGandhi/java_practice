package com.company;

public class hollow_ractangle{
    public static void main(String[] args) {
//        n=row and m=column;
//        we want 4x5 matrics so 4rows and 5 columns
        int n = 4;
        int m=5;

        for (int i=1;i<=n;i++){
            for (int j=0;j<=m;j++){
                if (i == 1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
