package com.company;

public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target){
        int ans[] = {-1,-1};
        ans[0] = check(nums,target,true);

        if (ans[0] != -1){
        ans[1] = check(nums,target,false);
        }

//        ans[0] = st;
//        ans[1] = en;

        return ans;
    }
    //this function will return us the possible answer
    static int check(int [] nums,int target,boolean findStartIndex){
        int ans = -1;
        int st = 0;
        int en = nums.length -1;

        while (st<=en){
            int mid = st + (en-st)/2;
            if (target>nums[mid]){
                st = mid +1;
            }
            else if(target<nums[mid]){
                en = mid -1;
            }
            else {
                //potential ans is found
                ans = mid;
                if (findStartIndex){
                    en = mid -1;
                }
                else {
                    st = mid +1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
