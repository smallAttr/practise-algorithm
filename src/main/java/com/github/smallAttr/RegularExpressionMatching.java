package com.github.smallAttr;


/**
 * @author smallAttr
 * @since 2019-09-04 15:19
 */
public class RegularExpressionMatching {

    public static void main(String[] args) {
        String s = "aa";
        String p = "a*";
//        System.out.println(isMatch(s, p));
        System.out.println(isMatchDp(s, p));
    }


    public static boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() > 1 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static boolean isMatchDp(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        boolean[][] dp = new boolean[sLen + 1][pLen + 1];
        dp[sLen][pLen] = true;

        for (int i = sLen; i >= 0; i--) {
            for (int j = pLen; j >= 0; j--) {
                if (i == sLen && j == pLen) {
                    continue;
                }
                boolean firstMatch = (i < sLen && j < pLen) && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
                if (j + 1 < pLen && p.charAt(j + 1) == '*') {
                    dp[i][j] = dp[i][j + 2] || firstMatch && dp[i + 1][j];
                } else {
                    dp[i][j] = firstMatch && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }

}
