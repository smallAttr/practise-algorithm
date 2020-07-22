package com.github.smallAttr;

import java.util.*;
import java.util.stream.*;

/**
 * @author smallAttr
 * @since 2019-08-27 11:26
 */
public class NextPermutation {
    public static void main(String[] args) {

        int[] nums = new int[]{3,2,1};
        nextPermutation(nums);
        Stream.of(nums).forEach(System.out::print);
    }


    public static void nextPermutation(int[] nums) {
        if (nums == null) {
            return;
        }
        int len = nums.length;
        if (len <= 1) {
            return;
        }
        int first = -1;
        for (int i = len - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                first = i - 1;
                break;
            }
        }
        // 如果first=-1，说明当前数值是最大值，生序排列
        if (first == -1) {
            Arrays.sort(nums);
            return;
        }
        int nextMinIndex = -1;
        for (int i = len - 1; i > first; i--) {
            if (nums[i] > nums[first]) {
                nextMinIndex = i;
                break;
            }
        }
        swap(nums, first, nextMinIndex);
        Arrays.sort(nums, first + 1, len);
    }

    // exchange
    private static void swap(int[] nums, int i, int index) {
        int tmp = nums[i];
        nums[i] = nums[index];
        nums[index] = tmp;
    }
}
