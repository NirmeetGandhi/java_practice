package com.company;

public class check_zeros_recursion {
    //iterative approach

    static int ansIterative(int n,int target){
        int c = n;
        int r;
        int s =0;
        int count  =0;
        while (n > 0){
             r = n %10;
//             s = (s * 10) +r;
             n = n/10;
             if (r==target){
                 count++;
             }
        }
        return count;
    }
    //recursive approach
    static int count =0;
    static void ansRecursively(int n){
        if (n<1){
            return;
        }
        int r = n %10;
        int target = 0;
        if (r==target){
            count++;
        }
       ansRecursively(n/10);
//        System.out.println(count);
    }
    //recursive approach 2
    static int count(int n){
        return ans(n,0);
    }
    static int ans(int n,int counting){
        if (n==0){
            return counting;
        }
        int r = n % 10;
        if (r==0){
            return ans(n/10,counting+1);
        }
        return ans(n/10,counting);
    }
    public static void main(String[] args) {
        int n = 10101010;
//        System.out.println(ansIterative(n,0));
//        ansRecursively(n);
//        System.out.println(count);
        System.out.println(count(10101010 ));
    }
}
