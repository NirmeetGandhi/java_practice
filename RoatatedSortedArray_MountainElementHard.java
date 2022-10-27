package com.company;

public class RoatatedSortedArray_MountainElementHard {
    static int peakInArr(int [] arr){
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
            if (arr[mid]==target){
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
                    en = mid -1;
                }
            }
            else {
                if (target > arr[mid]){
                    en = mid -1;
                }
                else {
                    st = mid +1;
                }
            }
        }
        return -1;
    }
    static int ans(int [] arr , int target){
        int peak = peakInArr(arr);
        if (arr[peak]==target){
            return peak;
        }
       int first = orderAgnosticBinarySearch(arr,target,0,peak);

        if (first!=-1){
            return first;
        }
        return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }
//4,5,6,7,0,1,2
    static int pivotInArray(int [] arr){
        int st = 0;
        int en = arr.length -1;
        while (st<=en){
            int mid = st + (en-st)/2;
            if (arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[st]>=arr[mid]){
                en = mid -1;
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
    static int ansOfRotatedSortedArray(int [] arr ,int target){
        int pivot = pivotInArray(arr);
        if (arr[pivot]==target){
            return pivot;
        }
        if (arr[0]>arr[pivot]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};

//        System.out.println(ans(arr,3));
//        System.out.println(pivotInArray(arr));
        System.out.println(ans(arr,0));
    }
}
