package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-12-10 18:39
 */
public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] ints = {7,8,9,11,12};
        System.out.println(firstMissingPositive(ints));

    }


    public static int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int max = 0;
        Map<Integer, Object> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            if (nums[i] > max) {
                max = nums[i];
            }
            map.put(nums[i], 1);
        }
        for (int i = 1; i <= max; i++) {
            if (map.get(i) == null) {
                return i;
            }
        }
        return max < Integer.MAX_VALUE ? max + 1 : max;
    }
}
