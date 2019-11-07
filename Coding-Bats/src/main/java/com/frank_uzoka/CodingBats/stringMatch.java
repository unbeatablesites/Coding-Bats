package com.frank_uzoka.CodingBats;

public class stringMatch {

    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String astr = a.substring(i, i + 2);
            String bstr = b.substring(i, i + 2);
            if (astr.equals(bstr)) count++;
        }

        return count;
    }

}
