package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2019-08-23 17:10
 */
public class StrStr {

    public static void main(String[] args) {

        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack, needle));
    }


    public static int strStr(String haystack, String needle) {
        char[] chars = haystack.toCharArray();
        char[] chars1 = needle.toCharArray();
        int len1 = chars.length;
        int len2 = chars1.length;
        if (len2 == 0) {
            return 0;
        }
        if (len1 < len2) {
            return -1;
        }
        int j = 0;
        int index = -1;
        int flag = 0;
        for (int i = 0; i < len1; i++) {
            if (chars[i] == chars1[j]) {
                if (j == 0) {
                    index = i;
                }
                j++;
            } else {
                if (index >= 0) {
                    i = index;
                    index = -1;
                }
                j = 0;
            }
            if (j == len2) {
                flag = 1;
                break;
            }
        }
        return flag == 0 ? -1 : index;
    }
}
