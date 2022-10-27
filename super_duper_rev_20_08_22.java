package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class super_duper_rev_20_08_22 {
    static boolean palindrome_num(int num){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int r;
        int s  =0;
        int c = num;

        while (num>0){
            r = num%10;
            s = (s*10) + r;
            num = num/10;
        }
        if (s==c){
            return true;
        }
        return false;
    }
    static void palindrome_num(){
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
//        int n = sc.nextInt();
        int r;
        int s  =0;
        int c = num;

        while (num>0){
            r = num%10;
            s = (s*10) + r;
            num = num/10;
        }
        if (s==c){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    static void palindrome_String(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String org_str = str;
        String rev_str = "";
        int len = str.length();

        for (int i = len-1; i >=0 ; i--) {
            rev_str = rev_str + str.charAt(i);
        }
        if (rev_str.equals(org_str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    static boolean palindrome_String(String str){
        Scanner sc = new Scanner(System.in);
//         str = sc.next();
        String org_str = str;
        String rev_str = "";
        int len = str.length();

        for (int i = len-1; i >=0 ; i--) {
            rev_str = rev_str + str.charAt(i);
        }
        if (rev_str.equals(org_str)){
            return true;
        }
       return false;
    }

    static void fib(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s1 = 0;
        int s2 = 1;
        int temp;
        int count = 0;
        while (count<n){
            if (count==0){
                System.out.print(s1 + " ");
            }
            else if(count==1){
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

    static void oned(){
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5};
        int b[];
        b = new int[4];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;

         int c[] = new int[5];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;
        c[3] = 4;

        int d[] = new int[4];

//        for (int i = 0; i <d.length ; i++) {
//            d[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(d));
//
//        for (int i = 0; i <c.length ; i++) {
//            System.out.print(c[i] + " ");
//        }
//        System.out.println();
        for (int element: b) {
            System.out.print(element + " ");
        }

    }

    static void twod(){
        Scanner sc = new Scanner(System.in);
        int a[][] = {
                {1},
                {2,3},
                {4,5,6},
                {7,8,9,10}
        };
        int b[][] = new int[3][];
        b[0] = new int[1];
        b[1] = new int[2];
        b[2] = new int[3];

//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(Arrays.toString(a[i]));
//        }
//        for (int e[]:a) {
//            System.out.println(Arrays.toString(e));
//        }

        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void arrayLS(){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }

    static void twodAL(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i <4 ; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(Arrays.toString(arr));
    }

    static int max(int arr[]){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static  void reverse(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int s = 0;

        while (n>0){
            r = n%10;
            s= (s*10) +r;
            n = n/10;
        }
        System.out.println(s);
    }

    static int maxRange(int arr[] , int st , int en){
        int max = arr[st];
        for (int i = st; i <=en ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static boolean armstrong(int n){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int cub = 1;
        int sum = 0;
        int r;
        int org = n;
        while (n>0){
            r = n%10;
            cub = r*r*r;
            sum = sum +  cub;
            n = n/10;
        }
        if (sum==org){
            return true;
        }
        return false;
    }

    static void printArm(){
        for (int i = 100; i <=999 ; i++) {
            if (armstrong(i)){
                System.out.println(i);
            }
        }
    }

    static int occurrences(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Occurrence number ");
        int ch = sc.nextInt();
        int count = 0;
        int r;
        int s = 0;

        while (n>0){
            r = n % 10;
            n = n/10;

            if (r==ch){
               count++;
            }
        }
        return count;
    }

    static int linear_searching(int arr[] , int target){
        if (arr.length==0){
            return -1;
        }

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    static int lsearch(int arr[],int target){
        if (arr.length==0){
            return -1;
        }
        for (int element:arr) {
            int ans = element;
            if (ans==target){
                return ans;
            }
        }
        return Integer.MIN_VALUE;
    }

    static boolean llsearch(int arr[],int target){
        if (arr.length==0){
            return false;
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

    static boolean searchCharOfString(String str , char target){
        if (str.length()==0){
            return false;
        }
//        char [] ch = str.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    static boolean charInString(String name,char target){
        char ch[] = name.toCharArray();
        for (char element:ch) {
            if (element==target){
                return true;
            }
        }
        return false;
    }

    static int maxInArray(int arr[]){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int minInArray(int arr[]){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    static int searchElementInRange(int arr[] , int target , int st , int en){
        if(arr.length == 0){
            return -1;
        }
        for (int i = st; i <=en ; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int[] linearSearchIn2DArray(int arr[][],int target){
        if (arr.length == 0){
            return new int[]{};
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                int element = arr[i][j];
                if (element==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int[] maxIn2DArray(int arr[][]){
        if (arr.length == 0){
            return new int[]{};
        }

        int max = arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return new int[]{max};
    }


    static int count(int num){
        int count = 0;
        int r;
        int s = 0;
        if (num<0){
            num = num * (-1);
        }
        if (num ==0 ){
            return 1;
        }
//        return (int)Math.log10(num) +1;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }

    static boolean checkEven(int nums){
        int evenNum = count(nums);
        if (evenNum % 2 == 0){
            return true;
        }
        return false;
    }
    static int evenNumbers(int arr[]){
        int count = 0;
        for (int element:arr) {
            if (checkEven(element)){
                count++;
            }
        }
        return count;
    }

    static int wealth(int arr[][]){
        int row_sum;
        int max = 0;
        for (int i = 0; i <arr.length ; i++) {
            row_sum = 0;
            for (int j = 0; j <arr[i].length ; j++) {
                row_sum += arr[i][j];
                if (row_sum>max){
                    max = row_sum;
                }
            }
        }
        return max;
    }

    static int[] addTwoNumber(int arr[] , int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+ arr[j] == target){
                    return  new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
//        System.out.println(palindrome_num(121));
//       palindrome_num();
//        System.out.println(palindrome_String("NiN"));
//        palindrome_String();
//        fib();
//        oned();
//        twod();
//        arrayLS();
//        twodAL();
        int arr[] = {11,3,2,4,5,6,-1};
//        swap(arr,1,2);
//        System.out.println(max(arr));
//        System.out.println(maxRange(arr,0,2));
//        reverse();
//        System.out.println(armstrong(153));
//        printArm();
//        System.out.println(occurrences());
//        System.out.println(linear_searching(arr,-1));
//        System.out.println(lsearch(arr,-123));
//        System.out.println(llsearch(arr,67));
        String name = "Nirmeet";
        char target = 'g';

//        System.out.println(searchCharOfString(name,target));
//        System.out.println(charInString(name,'i'));

//        System.out.println(maxInArray(arr));
//        System.out.println(minInArray(arr));
//        System.out.println(searchElementInRange(arr,20,0,4));
        int a[][] = {
                {1},
                {2,3},
                {4,5,6},
                {7,8,9,10}
        };

//        System.out.println(Arrays.toString(linearSearchIn2DArray(a,7)));
//        System.out.println(Arrays.toString(maxIn2DArray(a)));
//        System.out.println(count(1234));
        int arrr[] = {1234,12,23,45,67,1};
//        System.out.println(evenNumbers(arrr));
//        int twod[][] = {{1,2,3} , {4,5,6,10}};
//        System.out.println(wealth(twod));
        System.out.println(Arrays.toString(addTwoNumber(arrr,13)));
    }
}
