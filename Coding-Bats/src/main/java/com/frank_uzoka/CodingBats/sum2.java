package com.frank_uzoka.CodingBats;

public class sum2 {

    public int sum2(int[] nums) {

        if(nums.length >= 2)
            return (nums[0] + nums[1]);
        if(nums.length == 1)
            return nums[0];
        return 0;



    }


}
