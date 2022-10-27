package com.company;
import com.sun.source.tree.BreakTree;

public class CellingProblemLeet {
    static int celling(int [] nums , int target){
            int start = 0;
            int end = nums.length -1;

            if (target > end){
                return -1;
            }
            while(start <= end)
            {
                int mid = start + (end - start )/2;
                if(nums[mid] == target )
                    return mid;
                else if(nums[mid] < target)
                    start = mid + 1;
                else
                    end = end-1;
            }
            return start ;
        }
    static int floor(int [] nums , int target){
        int start = 0;
        int end = nums.length -1;
        if (target < start){
            return -1;
        }
        while(start <= end)
        {
            int mid = start + (end - start )/2;
            if(nums[mid] == target )
                return mid;
            else if(nums[mid] < target)
                start = mid + 1;
            else
                end = end-1;
        }
        return end ;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        System.out.println(celling(arr,15));
        System.out.println(floor(arr,15));

//        System.out.println(celling(arr,19));
//        System.out.println(floor(arr,1));
        }
    }


