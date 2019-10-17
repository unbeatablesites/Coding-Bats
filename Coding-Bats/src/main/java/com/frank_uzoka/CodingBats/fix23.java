package com.frank_uzoka.CodingBats;

public class fix23 {

    public int[] fix23(int[] nums) {

        int[] newArray = {nums[0], nums[1], nums[2]};

        if(nums[0] == 2 && nums[1] == 3){
            newArray[1] = 0;
        }

        if(nums[1] == 2 && nums[2] == 3){
            newArray[2] = 0;
        }
        return newArray;
    }


}
