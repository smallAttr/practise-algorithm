package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-12-18 16:24
 */
public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute(nums);
    }


    public static List<List<Integer>> permute(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permute(result, nums, length, 0, list);
        return result;
    }

    private static void permute(List<List<Integer>> result, int[] nums, int length, int index, List<Integer> list) {
        if (list.size() == length) {
            result.add(list);
            return;
        }
    }


}
