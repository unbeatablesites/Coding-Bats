package com.frank_uzoka.CodingBats;

public class maxEnd3 {

    public int[] maxEnd3(int[] nums)
    {
        int[] maxVal = new int[3];
        maxVal[0] = nums[0];
        if(nums[2] >= maxVal[0])
            maxVal[0] = nums[2];
        maxVal[1] = maxVal[0];
        maxVal[2] = maxVal[0];
        return maxVal;
    }

//
//        public int[] maxEnd3(int[] nums)
//        {
////            Create a new array that will hold the max value
//            int[] maxVal = new int[3];
////            Compare the new array to the number in the first position of the old array.
//            maxVal[0] = nums[0];
////            If the number in the third position of the array is greater than the newed up maxvalue make which should be 0.
//            if(nums[2] >= maxVal[0])
////            The number in the third position of the array now becomes the first and only number in the new array.
//                maxVal[0] = nums[2];
////
//            maxVal[1] = maxVal[0];
//            maxVal[2] = maxVal[0];
//            System.out.println(maxVal);
//        }
//    }
}
