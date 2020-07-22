package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-11-01 17:27
 */
public class MultiplyStrings {

    public static void main(String[] args) {

        String num1 = "999";
        String num2 = "123";
        System.out.println(multiply(num1, num2));

    }


    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int num1Length = num1.length();
        int num2Length = num2.length();
        char[] num1Char = num1.toCharArray();
        char[] num2Char = num2.toCharArray();
        int ten;
        int left;
        int k;
        int[] target = new int[num1Length + num2Length];
        int[] tmp = new int[num1Length + num2Length];
        int offset = 0;
        for (int i = num1Length - 1; i >= 0; i--) {
            int number1 = num1Char[i] - '0';
            ten = 0;
            k = 0;
            // 填充0
            for (int j = 0; j < offset; j++) {
                tmp[k++] = 0;
            }
            for (int j = num2Length - 1; j >= 0; j--) {
                int number2 = num2Char[j] - '0';
                left = (number1 * number2 + ten) % 10;
                ten = (number1 * number2 + ten) / 10;
                tmp[k++] = left;
            }
            // 进位
            if (ten != 0) {
                tmp[k++] = ten;
            }
            int length = tmp.length;
            if (offset == 0) {
                for (int j = 0; j < length; j++) {
                    target[j] = tmp[j];
                }
            } else {
                int ten1 = 0;
                int left1;
                int j;
                for (j = 0; j < length; j++) {
                    left1 = (target[j] + tmp[j] + ten1) % 10;
                    ten1 = (target[j] + tmp[j] + ten1) / 10;
                    target[j] = left1;
                }
                // 进位
                if (ten1 != 0) {
                    target[j++] = ten1;
                }
            }
            offset++;
        }
        return reverse(target);
    }

    private static String reverse(int[] target) {
        int length = target.length;
        String result = "";
        for (int i = 0; i < length; i++) {
            result = target[i] + result;
        }
        return result.replaceAll("^(0+)", "");
    }
}
