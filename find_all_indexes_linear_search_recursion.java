package com.company;

import java.sql.Array;
import java.util.ArrayList;

public class find_all_indexes_linear_search_recursion {
    static ArrayList<Integer> list = new ArrayList<>();
    static void ans(int[]arr,int target,int i){
        if (i==arr.length){
            return;
        }
        if (arr[i]==target){
            list.add(i);
        }
        ans(arr,target,i+1);
    }
    static ArrayList<Integer> ans(int [] arr,int target,int i,ArrayList<Integer> list){
        if (i==arr.length){
            return list;
        }
        if (arr[i]==target){
            list.add(i);
        }
        return ans(arr,target,i+1,list);

    }
    static ArrayList<Integer> ans1(int[]arr,int target,int i){
        ArrayList<Integer> list = new ArrayList<>();
        if (i==arr.length){
            return list;
        }
        if (arr[i]==target){
            list.add(i);
        }

        ArrayList<Integer> answerFromBelowCalls = ans1(arr,target,i+1);
        list.addAll(answerFromBelowCalls);

        return list;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,3,4,2,5};
//        ans(arr,2,0);
//        System.out.println(list);
//        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println(ans(arr,2,0,ans));
        System.out.println(ans1(arr,2,0));

    }
}
