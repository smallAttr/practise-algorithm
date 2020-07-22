package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-09-04 16:28
 */
public class LongestValidParentheses {

    public static void main(String[] args) {

        String s = "(()(()))";
        System.out.println(longestValidParentheses(s));

    }

    public static int longestValidParentheses(String s) {
        if (s == null) {
            return 0;
        }
        int length = s.length();
        if (length <= 1) {
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        int count = 0;
        int max = 0;
        int step = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
                ++count;
                --step;
            } else {
                if (s.charAt(i) == ')') {
                    continue;
                }
                stack.push(s.charAt(i));
                if (max < count) {
                    max = count;
                    count = 0;
                }
                ++step;

            }
        }
        if (max < count) {
            max = count;
        }
        return max * 2;
    }
}
