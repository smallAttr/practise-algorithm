package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2020-01-03 17:26
 */
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(112));

    }

    public static boolean isHappy(int n) {
        Map<String, Object> map = new HashMap<>();
        String s = String.valueOf(n);
        map.put(s, s);
        int length = s.length();
        boolean flag = false;
        while (true) {
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += (s.charAt(i) - '0') * (s.charAt(i) - '0');
            }
            if (sum == 1) {
                flag = true;
                break;
            }
            s = String.valueOf(sum);
            length = s.length();
            if (map.get(s) != null) {
                System.out.println(map.get(s));
                break;
            }
            map.put(s, s);
        }
        return flag;
    }
}
