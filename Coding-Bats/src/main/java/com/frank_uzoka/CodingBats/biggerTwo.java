package com.frank_uzoka.CodingBats;

public class biggerTwo {

    public int[] biggerTwo(int[] a, int[] b) {
        if(a[0] + a[1] == b[0] + b[1]){
            return a;
        }

        if(b[0] + b[1] > a[0] + a[1]){
            return b;
        }
        return a;

    }



}
