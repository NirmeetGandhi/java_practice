package com.company;

import java.util.Arrays;

public class searchInStrings {
    static boolean search(String str,char target){
        if (str.length()==0){
            return false;
        }
        char toArr[] = str.toCharArray();

        for (char ch:toArr) {
            if (ch==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
            String name = "Nirmeet";
            char ch = 'i';
        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(search(name,ch));
    }
}
