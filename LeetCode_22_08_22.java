package com.company;

public class LeetCode_22_08_22 {
    static int binarySearch(int [] arr, int target){
        int st = 0;
        int en = arr.length -1 ;

        while (st<=en){
            int mid = st + (en-st)/2;
            if (target > arr[mid]){
                st = mid +1;
            }
            else if(target < arr[mid]){
                en= mid -1;
            }
            else {
                return  mid;
            }
        }
        return  -1;
    }

    static int orderAgnostic(int [] arr, int target){
        int st = 0;
        int en = arr.length -1 ;

        while (st<=en){
            boolean asac;
            int mid = st + (en-st)/2;
            if (arr[mid] == target){
                return  mid;
            }
            if (arr[st]<arr[en]){
                asac = true;
            }
            else {
                asac = false;
            }

            if (asac){
                if (target > arr[mid]){
                    st = mid +1;
                }
                else if(target < arr[mid]){
                    en= mid -1;
                }
                else {
                    return mid;
                }
            }
            else {
                if (target < arr[mid]){
                    st = mid +1;
                }
                else if(target > arr[mid]){
                    en= mid -1;
                }
                else {
                    return mid;
                }
            }

        }
        return  -1;
    }

    static int celling(int [] arr ,int target){
        int st = 0;
        int en = arr.length-1;

        while (st<=en){
            int mid =st + (en-st)/2;
            if (target == arr[mid]){
                return  mid;
            }
            if (target > arr[mid]){
                st = mid +1;
            }
            else if (target < arr[mid]){
                en = mid -1;
            }
        }
        return st;
    }

    public char nextGreatestLetter(char[] arr, char target){
        int st = 0;
        int en = arr.length-1;

        while (st<=en){
            int mid =st + (en-st)/2;
            if (target > arr[mid]){
                st = mid +1;
            }
            else if (target < arr[mid]){
                en = mid -1;
            }
        }
        return arr[st % arr.length];
    }
    public static void main(String[] args) {
        int [] arrr = {1,2,3,4,5,6,7,8,9,10,345};
        int [] arr1 = {10,9,8,7,6,5,4,3,2,1};
//        System.out.println(binarySearch(arrr,8));
        System.out.println(orderAgnostic(arrr,7));
        System.out.println(orderAgnostic(arr1,1));
    }
}
