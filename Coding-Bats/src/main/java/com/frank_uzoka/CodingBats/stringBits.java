package com.frank_uzoka.CodingBats;

public class stringBits {

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.substring(i, i + 1);
        }

        return result;
    }
}
