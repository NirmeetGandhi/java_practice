package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class palindrome{
    static void int_input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int s = 0;
        int c = n;

        while (n>0){
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
        if (s==c){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    static void String_input(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String org_Str;
        org_Str = str;
        String rev_Str = "";
        int len = str.length();

        for (int i = len-1; i >=0 ; i--) {
            rev_Str = rev_Str + str.charAt(i);
        }
        if (rev_Str.equals(org_Str)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}

class arr{
    static void oned_Arr(){
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5};
        int b[] = new int[4];
        System.out.print(Arrays.toString(a));
        System.out.println();

        for (int w:a) {
            System.out.print(w + " ");
        }
        for (int i = 0; i <b.length ; i++) {
            b[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(b));
    }

    static void twod_Arr(){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][3];
        int b[][] = new int[4][];
        b[0] = new int[1];
        b[1] = new int[2];
        b[2] = new int[3];
        b[3] = new int[4];

//        for (int i = 0; i <b.length ; i++) {
//            for (int j = 0; j <b[i].length ; j++) {
//                b[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i <b.length ; i++) {
//            for (int j = 0; j <b[i].length ; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println();
//        }

        int c[][];
        c = new int[2][3];
        c[0][0] = 1;
        c[0][1] = 2;
        c[0][2] = 3;

        c[1][0] = 4;
        c[1][1] = 5;
        c[1][2] = 6;
//        for (int i = 0; i <c.length ; i++) {
//            for (int j = 0; j <c[i].length ; j++) {
//                c[i][j] = sc.nextInt();
//            }
//        }
        for (int i = 0; i <c.length ; i++) {
            System.out.println(Arrays.toString(c[i]));
        }
        System.out.println();




        int d[][] = {
                {1},
                {2,3},
                {4,5,6},
                {7,8,9,10}
        };

        for (int e[]: d) {
            System.out.println(Arrays.toString(e));
        }

//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

}

class array_lists{
    static void onedAL(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <6 ; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

    }

    static void twod_AL(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i <4 ; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <5 ; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }

    static void threed_AL(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<ArrayList<Integer>>> list = new ArrayList<>();
    }
}
public class super_super_rev {

    static void swap(int a[], int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        for (int e:a) {
            System.out.print(e + " ");
        }
    }

    static int  max(int a[]){
        int max = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    static int maxrange(int [] arr , int st , int en){
        int max = arr[st];
        for (int i = st; i <=en ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void reverse(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int s = 0;

        while (n>0){
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
        System.out.println(s);
    }

    static boolean checkArmstrong(int n){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int org = n;
        int sum = 0;
        int cub = 1;
        int r;
        while (n>0){
            r = n%10;
            cub = r*r*r;
            sum = sum + cub;
            n = n/10;
        }
        if (org==sum){
            return true;
        }
        else{
//            System.out.println("NO");
            return false;
        }
    }

    static void printArmstrong(){
        for (int i = 100; i <=999 ; i++) {
            if (checkArmstrong(i)==true){
                System.out.print(i + " ");
            }
        }
    }
    static void occurrences(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        System.out.println("Enter occurrence");
        int ch = sc.nextInt();
        int r;
        int count = 0;

        while (n>0){
            r = n%10;
            if (r==ch){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
    static void fibooo(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int s1 = 0;
        int s2 = 1;
        int temp;

        while (count<n){
            if (count==0){
                System.out.print(s1 + " ");
            }
            else if (count == 1){
                System.out.print(s2 + " ");
            }
            else if(count>1){
                temp = s1+s2;
                s1 = s2;
                s2 = temp;
                System.out.print(temp + " ");
            }
            count++;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palindrome pd =new palindrome();
//        pd.int_input();
//        pd.String_input();
//        fibooo();

        arr a = new arr();
//        a.oned_Arr();
//        a.twod_Arr();
        array_lists ls = new array_lists();
//        ls.onedAL();
//        ls.twod_AL();
//        ls.threed_AL();
        int arr[] = {11,2,3,4,6};
//        swap(arr,2,3);
//        System.out.println(max(arr));
//        System.out.println(maxrange(arr,1,4));
//        reverse();
//        checkArmstrong();
//        printArmstrong();
        occurrences();
    }
}
