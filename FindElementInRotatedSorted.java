package com.company;

public class FindElementInRotatedSorted {
    static int pivot(int []arr){
        int st=0;
        int en = arr.length-1;

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
            else{
                st = mid +1;
            }
        }
        return -1;
    }

    static int binarySearch(int [] arr,int target,int st,int en){
        while (st<=en){
            int mid = st + (en-st)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (target > arr[mid]){
                st = mid +1;
            }
            else if(target < arr[mid]){
                en = mid -1;
            }
//            else{
//                return mid;
//            }
        }
        return -1;
    }

    static int ans(int [] arr, int target){
        int pivot = pivot(arr);
        int firstAttempt = binarySearch(arr,target,0,pivot-1);
        if (firstAttempt!=-1){
            return firstAttempt;
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
//        System.out.println(pivot(arr));
        System.out.println(ans(arr,7));
    }
}
