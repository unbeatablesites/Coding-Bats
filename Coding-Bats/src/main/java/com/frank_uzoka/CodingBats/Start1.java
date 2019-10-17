package com.frank_uzoka.CodingBats;

public class Start1 {

    public static void main(String[] args) {

        int[] nums = new int[]{ 55,2,3,4,5,6,7,8,9,11,90 };

        int sum = 0;
        int i = 0;

        for(i =0; i<nums.length; i++){

            sum += nums[i];
        }
        System.out.println(sum);
    }

}
