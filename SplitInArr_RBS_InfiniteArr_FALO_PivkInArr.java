package com.company;

import java.util.Arrays;

public class SplitInArr_RBS_InfiniteArr_FALO_PivkInArr {
    static int splitInArr(int [] arr , int m){
        int st = 0;
        int en = 0;

        for (int i = 0; i <arr.length ; i++) {
            st = Math.max(st,arr[i]);
            en += arr[i];
        }

        //apply binary search
        while (st<en){
            int mid = st + (en-st)/2;

            int sum = 0;
            int pieces = 1;

            for(int num:arr){
                if (num + sum > mid){
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            //we have pieces
            if (pieces <=m){
                en = mid;
            }
            else{
                st = mid +1;
            }

        }
        return st;
    }

    //(2)Rotated binary search
    static int pivot(int [] arr){
        int st = 0;
        int en = arr.length -1;

        while (st<en){
            int mid = st + (en-st)/2;
            if (arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[st]>arr[mid]){
                en = mid;
            }
            else {
                st = mid +1;
            }
        }
        return -1;
    }

    static int binarySearchForRBS(int [] arr,int target,int st,int en){
        while (st<=en){
            int mid = st +(en-st)/2;
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

    static int ansForRBS(int [] arr,int target){
        int pivot = pivot(arr);
        int firstPotentialAns = binarySearchForRBS(arr,target,0,pivot-1);
        if (firstPotentialAns!=-1){
            return firstPotentialAns;
        }
        return binarySearchForRBS(arr,target,pivot+1,arr.length-1);

    }

    //(3)Peak in Mountain Array

    static int peak(int [] arr){
        int st = 0;
        int en = arr.length -1;

        while (st<en){
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

    static int orderAgnosticBinarySearch(int [] arr,int target,int st,int en){
        boolean isAsc;
        while (st<=en){
            int mid = st + (en-st)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (arr[st]<arr[en]){
                isAsc = true;
            }
            else {
                isAsc = false;
            }
            if (isAsc){
                if (target > arr[mid]){
                    st = mid +1;
                }
                else{
                    en = mid-1;
                }

            }
            else{
                if (target > arr[mid]){
                    en = mid -1;
                }
                else{
                    st = mid +1;
                }
            }
        }
        return -1;
    }
    static int ansForMountainInArr(int [] arr,int target){
        int peak = peak(arr);

       int firstTry = orderAgnosticBinarySearch(arr,target,0,peak);
       if (firstTry!=-1){
           return firstTry;
       }
       return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }
    //(4)Infinite Array
    static int binarySearchForInfiniteArray(int [] arr,int target,int st,int en){
        while (st<=en){
            int mid = st + (en-st)/2;
            if (target >arr[mid]){
                st = mid +1;
            }
            else if(target < arr[mid]){
                en = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int ansForInfiniteArray(int [] arr,int target){
        int st = 0;
        int en = 1;

        while (target>arr[en]){
            int new_St = en+1;
            en = en + (en-st+1)*2;
            st = new_St;
        }
        return binarySearchForInfiniteArray(arr,target,st,en);
    }

    static int binarySearchForFirstAndLastInArray(int [] arr,int target,boolean isAns){
        int ans =-1;
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
            else{
                ans = mid;
                if (isAns){
                    en = mid -1;
                }
                else{
                    st = mid +1;
                }
            }
        }
        return ans;
    }
    static int[] ansForFALInArray(int [] arr,int target){
        int [] ans = {-1,-1};
        ans[0] = binarySearchForFirstAndLastInArray(arr,target,true);
        ans[1] = binarySearchForFirstAndLastInArray(arr,target,false);

        return ans;
    }
    public static void main(String[] args) {
        //(1)Split in array
        // int [] arr = {7,2,5,10,8};
        // System.out.println(splitInArr(arr,2));

        //(2) RBS
        int [] arr = {4,5,6,7,0,1,2};
//        System.out.println(pivot(arr));
//        System.out.println(ansForRBS(arr,2));

        //(3)
        int [] arr1 = {1,2,3,4,5,3,1};
//        System.out.println(peak(arr1));
//        System.out.println(ansForMountainInArr(arr1,3));

        //(4)
//        int [] arr2= {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(ansForInfiniteArray(arr2,5));

        //(5)
        int [] arr4 = {1,2,2,2,2,2,2,2,2,3,4,5};
        System.out.println(Arrays.toString(ansForFALInArray(arr4,2)));
    }
}
