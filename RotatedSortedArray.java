package com.company;

public class RotatedSortedArray {
    static int isPivot(int [] arr){
        int st = 0;
        int en = arr.length -1;
        while (st<=en){
            int mid = st + (en-st)/2;
            //let's say that the mid is last index in  a  case and while running this check mid +1 will be indexOutOfBound
            // mid should always be less than end while making this check
            if (mid<en && arr[mid]>arr[mid+1]){

                return mid;
            }
            else if(mid>st && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[st] >= arr[mid]){
                en = mid -1;
            }
            else{
                st = mid +1;
            }
        }
        return -1;
    }
    static int search(int[] arr, int target) {
        int pivot = isPivot(arr);
        if (pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if (target == arr[pivot]){
            return pivot;
        }
        if (target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
            return binarySearch(arr,target,pivot+1,arr.length-1);
    }

    static int binarySearch(int [] arr , int target , int st , int en){
        while (st<=en){
            int mid = st + (en-st)/2;
            if (target > arr[mid]){
                st = mid +1;
            }
            else if(target  <arr[mid]){
                en = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr =  {4,5,6,7,0,1,2};
//        System.out.println(isPivot(arr));
        System.out.println(search(arr,0));
    }
}
