package com.company;

public class FirstMissingPositive {
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int firstMissingPositive(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;

            if (arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for(int j=0; j<arr.length;j++){
            if (arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length +1;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
}
