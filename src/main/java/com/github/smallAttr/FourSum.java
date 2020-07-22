package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-08-22 18:12
 */
public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        int len = nums.length;
        int left,right,sum;

        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 1; j < len - 2; j++) {
                left = j + 1;
                right = len - 1;
                sum = target - nums[i] - nums[j];
                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < sum) {
                        left++;
                    } else {
                        right--;
                    }
                }

            }
        }
        ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>(set);
        lists.forEach(item -> {
            System.out.println("--------");
            item.forEach(System.out::print);
            System.out.println("********");
        });
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        fourSum(nums, 0);
    }
}
