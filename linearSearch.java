package com.company;

public class linearSearch {
    static int search(int arr[],int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,567,867,-34,-56,98};
        int target = 867;
        int ans = search(a,target);
        System.out.println("Inedx no: " + ans);
    }
}
