package com.company;

import java.util.Arrays;

public class RBS_EMA_FALIA_IA_SplitArray {

   // (1) Searching in mountain array
   //https://leetcode.com/problems/find-in-mountain-array/
   static int peakInArray(int [] arr){
      int st = 0;
      int en = arr.length -1;

      while (st<en){
         int mid = st +(en-st)/2;
         if (arr[mid]>arr[mid+1]){
            en = mid;

         }
         else{
            st = mid +1;
         }
      }
      return st;
   }

   static int orderAgnosticBinarySearch(int [] arr , int target , int st,int en){
      boolean isAsc;
      while (st<=en){
         int mid = st + (en-st)/2;

         if (target == arr[mid]){
            return mid;
         }
         if (arr[st]<arr[en]){
            isAsc = true;
         }
         else{
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
            if (target  > arr[mid]){
               en = mid -1;
            }
            else {
               st = mid +1;
            }
         }
      }
         return -1;
   }

   static int  ansHardMountainArray(int [] arr, int target){
      int peak = peakInArray(arr);

      int first = orderAgnosticBinarySearch(arr,target,0,peak);
      if (first!=-1){
         return first;
      }
      return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
   }

   //(2)Search in rotated sorted array
   //https://leetcode.com/problems/search-in-rotated-sorted-array/

   static int pivot(int [] arr){
      int st = 0;
      int en = arr.length-1;

      if (st<=en){
         int mid = st + (en-st)/2;
         if (arr[mid]>arr[mid+1]){
            return mid;
         }
         else if(arr[mid]<arr[mid-1]){
            return mid-1;
         }
         if (arr[st]>arr[mid]){
            en = mid -1;
         }
         else{
            st = mid +1;
         }
      }
      return -1;
   }
   static int binarySearch(int [] arr , int target,int st,int en){
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
   static  int ansOfRotatedSortedArray(int []arr,int target){
      int pivot = pivot(arr);
      int first = binarySearch(arr,target,0,pivot-1);

      if (first!=-1){
         return first;
      }
      return binarySearch(arr,target,pivot+1,arr.length-1);
   }

   //(3)Find First and Last Position of Element in Sorted Array
   //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

   static int binarySearchForFirstAndLastOccurrence(int [] arr, int target , boolean isTrue){
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
           if (isTrue){
              en = mid -1;
           }
           else {
              st = mid +1;
           }
         }
      }
      return ans;
   }

   static int[] ansForFirstAndLastOccurrence(int [] arr,int target){
      int [] ans = {-1,-1};
      ans[0] = binarySearchForFirstAndLastOccurrence(arr,target,true);
      ans[1] = binarySearchForFirstAndLastOccurrence(arr,target,false);

      return ans;
   }

   //(4)Find position of an element in a sorted array of infinite numbers
   //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

   static int binarySearchForInfiniteArray(int [] arr,int target,int st ,int en){
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

   static int ansForInfiniteArray(int [] arr,int target){
      int st = 0;
      int en = 1;

      while (target > arr[en]){
         int new_st = en +1;
         en = en + (en-st+1)*2;
         st = new_st;
      }
      return binarySearchForInfiniteArray(arr,target,st,en);
   }

   //(5)Rotation count in Rotated sorted array
   static void rotationCount(int []arr){
      int pivot = pivot(arr);
      System.out.println("Rotation count = " + (pivot+1));
   }

   //(1)Split Array Largest Sum
   //https://leetcode.com/problems/split-array-largest-sum/submissions/
   static int splitArray(int [] arr,int m){
      int st =0;
      int en =0;
      for (int i = 0; i <arr.length ; i++) {
         st = Math.max(st,arr[i]);
         en += arr[i];
      }
      while (st<en){
         int mid = st +(en-st)/2;
         int sum = 0;
         int pieces = 1;

         for(int num:arr){
            if (num + sum > mid){
               sum = num;
               pieces++;
            }
            else{
               sum += num;
            }
         }
         if (pieces <= m){
            en = mid;
         }
         else {
            st = mid +1;
         }
      }
      return st;
   }
   public static void main(String[] args) {
      // (1) Searching in mountain array
      //https://leetcode.com/problems/find-in-mountain-array/

      int [] arr = {1,2,3,4,5,3,1};
      System.out.println(ansHardMountainArray(arr,3));

      //(2)Search in rotated sorted array
      //https://leetcode.com/problems/search-in-rotated-sorted-array/

      int [] arr1 = {4,5,6,7,0,1,2};
//      int [] arr5 = {5,6,7,1,2,3,4};
//      System.out.println(pivot(arr1));
//      System.out.println(ansOfRotatedSortedArray(arr1,0));
//      rotationCount(arr1);


      //(3)Find First and Last Position of Element in Sorted Array
      //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

      int [] arr2 = {1,2,2,2,2,3,4,5};
//      System.out.println(Arrays.toString(ansForFirstAndLastOccurrence(arr2,2)));

      //(4)Find position of an element in a sorted array of infinite numbers
      //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
      int [] arr4 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
//      System.out.println(ansForInfiniteArray(arr4,13));

      //(5)Split Array Largest Sum
      //https://leetcode.com/problems/split-array-largest-sum/submissions/

//      int [] arr= {7,2,5,10,8};
//      System.out.println(splitArray(arr,2));


   }
}
