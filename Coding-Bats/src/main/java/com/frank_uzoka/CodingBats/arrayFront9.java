package com.frank_uzoka.CodingBats;

public class arrayFront9 {

    public boolean arrayFront9(int[] nums) {
        int size = nums.length;
        if (size > 4) size = 4;

        for (int i = 0; i < size; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }

}
