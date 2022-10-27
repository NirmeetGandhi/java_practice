package com.company;

public class nextGreatestLetterLeetCode {
    static int ans(char [] letters , char target){
        int st = 0;
        int en = letters.length -1;
         while (st<=en){
             int mid  = st + (en-st)/2;

             if (target<letters[mid]){
                en = mid -1;
             }
             else{
                 st = mid +1;
             }
         }
         return st % letters.length;
    }
    public static void main(String[] args) {
        char [] ch = {'c','f','j'};
        System.out.println(ans(ch,'a'));
    }
}




