package com.frank_uzoka.CodingBats;

public class makeLast {

    public int[] makeLast(int[] nums) {



        int len = nums.length*2; //* double the length of the existing array first
        int[] dubsArr = new int[len]; //* Name and assign the new array the size of the  doubled array
        dubsArr[len-1] = nums[nums.length-1]; //* use the new array
        return dubsArr;

    }

}
