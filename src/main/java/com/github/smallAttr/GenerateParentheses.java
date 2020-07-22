package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-10-31 16:32
 */
public class GenerateParentheses {

    public static void main(String[] args) {
        List<String> list = generateParenthesis(4);
        list.stream().forEach(System.out::println);

    }


    public static List<String> generateParenthesis(int n) {

        List<String> target = new ArrayList<>();

        generate(target, "", 0, 0, n);
        return target;
    }

    private static void generate(List<String> target, String s, int left, int right, int max) {
        if (s.length() == max * 2) {
            target.add(s);
            return;
        }
        if (left < max) {
            generate(target, s + "(", left + 1, right, max);
        }
        if (right < left) {
            generate(target, s + ")", left, right + 1, max);
        }
    }
}
