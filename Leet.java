package com.company;

import java.util.Arrays;

public class Leet {
    static int binarySearch(int [] arr , int target , boolean isFirstOccurrence){
        int ans = -1;
        int st= 0;
        int en = arr.length -1;

        while (st<=en){
            int mid = st + (en-st)/2;
            if (target > arr[mid]){
                st = mid +1;
            }
            else if(target < arr[mid]){
                en = mid -1;
            }
            else{
                ans = mid;
                if (isFirstOccurrence){
                    en = mid -1;
                }
                else{
                    st = mid +1;
                }
            }
        }
        return ans;
    }

    static int[] ans(int [] arr , int target){
        int [] ans = {-1,-1};

        ans[0] = binarySearch(arr,target,true);
        ans[1] = binarySearch(arr,target,false);

        return ans;
    }

    static int binary(int [] arr,int target,int st , int en){
        while (st<=en){
            int mid = st + (en-st)/2;

            if (target > arr[mid]){
                st = mid +1;
            }
            else if(target < arr[mid]){
                en = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int ans1(int [] arr , int target){
        int st = 0;
        int en = 1;

        while (target > arr[en]){
            int new_St = en +1;
            en = en + (en-st+1)*2;
            st = new_St;
        }
        return binary(arr,target,st,en);
    }

    static int peakInAMountainArray(int [] arr){
        int st = 0;
        int en = arr.length -1;

        while (st < en){
            int mid = st + (en-st)/2;
            if (arr[mid]>arr[mid+1]){
                en = mid;
            }
            else{
                st = mid +1;
            }
        }
        return st;
    }

    static int orderAgnostic(int [] arr ,int target){
        int st = 0;
        int en = arr.length -1;
        boolean isCheck;
        while (st<=en){
            int mid = st + (en-st)/2;
            if (arr[mid]==target){
                return mid;
            }
            if(arr[st]<arr[en]){
                isCheck = true;
            }
            else{
                isCheck = false;
            }
            if (isCheck){
                if (target > arr[mid]){
                    st = mid +1;
                }
                else{
                    en = mid -1;
                }
            }
            else{
                if (target < arr[mid]){
                    en = mid -1;
                }
                else {
                    st = mid +1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int [] arr = {1,2,3,3,3,4,4,4,5,5,5,6};
//        int [] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        int [] arr2 = {1,2,3,1};
        int [] arr = {1,2,3,4,5,6};
        int [] arr1 = {6,5,4,3,2,1};

        System.out.println(orderAgnostic(arr,4));
        System.out.println(orderAgnostic(arr1,4));

//        System.out.println(ans1(arr1,6));
//        System.out.println(Arrays.toString(ans(arr,4)));
//        System.out.println(peakInAMountainArray(arr2));
    }
}
