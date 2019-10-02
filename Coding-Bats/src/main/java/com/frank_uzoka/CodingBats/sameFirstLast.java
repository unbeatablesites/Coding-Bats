package com.frank_uzoka.CodingBats;

public class sameFirstLast {

    public static void main(String[] args) {

        int[] nums = new int[]{ 10,2,3,4,5,6,7,8,9,11,10 };

        if(nums[0] == nums[nums.length-1]){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
    public boolean sameFirstLast(int[] nums) {

        if(nums.length >= 1 && nums[0] == nums[nums.length-1] ){
            return true;
        }


        return false;
    }

}
