package com.company;

public class linearSearchInRange {
    static boolean searchInRange(int arr[], int target , int st ,int en){
        if (arr.length==0){
            return false;
        }
        for (int i = st; i <=en ; i++) {
            int element = arr[i];
            if (element==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,8,9,0};
        System.out.println(searchInRange(arr,7,2,5));
        System.out.println(searchInRange(arr,7,0,2));
    }
}
