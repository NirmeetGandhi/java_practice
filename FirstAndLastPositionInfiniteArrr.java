package com.company;

import java.util.Arrays;

public class FirstAndLastPositionInfiniteArrr {
    static int search(int [] arr, int target , boolean check){
        int ans = -1;
        int st = 0;
        int en = arr.length -1;

        while (st<=en){
            int mid = st + (en-st)/2;
            if (target > arr[mid]){
                st = mid +1;
            }
            else if(target < arr[mid]){
                en = mid -1;
            }
            else {
                ans = mid;
                if (check){
                    en = mid -1;
                }
                else {
                    st = mid +1;
                }
            }
        }
        return ans;
    }

    static int[] ans(int [] arr , int target){
        int [] ans = {-1,-1};
        ans[0] = search(arr,target,true);
        ans[1] = search(arr,target,false);

        return ans;
    }


    static int binarySearch(int [] arr,int target,int st , int en){
        while (st<=en){
            int mid = st + (en-st)/2;
             if (target>arr[mid]){
                     st = mid +1;
            }
             else if(target < arr[mid]){
                 en = mid -1;
             }
             else {
                 return mid;
             }
        }
        return -1;
    }

    static int check(int [] arr , int target){
        int st = 0;
        int en = 1;

        while (target > arr[en]){
            int new_st = en +1;
            en = en + (en-st)*2;
            st = new_st;
        }
        return binarySearch(arr,target,st,en);
    }
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
//        System.out.println(Arrays.toString(ans(arr,8)));
        System.out.println(check(arr,10));
    }

}
