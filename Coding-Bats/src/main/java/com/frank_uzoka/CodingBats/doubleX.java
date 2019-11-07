package com.frank_uzoka.CodingBats;

public class doubleX {

    boolean doubleX(String str) {
        int xIndex = str.indexOf("x");
        if (xIndex == -1) return false;

        String xString = str.substring(xIndex);
        return xString.startsWith("xx");
    }

}
