package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2019-08-26 14:41
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }


    public static String longestPalindrome(String s) {
            if (s == null || s.length() <= 1) {
                return s;
            }
            char symbol = '#';
            String wrapper = insertSymbol(s, symbol);
            int left = 0, right = 0;
            int length = wrapper.length();
            int j, k, maxLen = 0;
            char[] chars = wrapper.toCharArray();
            for (int i = 1; i < length - 1; i++) {
                j = i - 1;
                k = i + 1;
                while (j >= 0 && k < length && (chars[j] == chars[k])) {
                    j--;
                    k++;
                }
                if (maxLen < k - j - 1) {
                    maxLen = k - j - 1;
                    left = j + 1;
                    right = k;
                }
            }
            String substring = wrapper.substring(left, right);
            return removeSymbol(substring, symbol);
    }

    private static String removeSymbol(String source, char symbol) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = source.toCharArray();
        int len = source.length();
        for (int i = 0; i < len; i++) {
            if (chars[i] != symbol) {
                stringBuffer.append(chars[i]);
            }
        }
        return stringBuffer.toString();
    }

    private static String insertSymbol(String s, char symbol) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            stringBuffer.append(chars[i]).append(symbol);
        }
        return stringBuffer.toString();
    }
}
