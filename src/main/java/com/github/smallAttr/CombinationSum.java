package com.github.smallAttr;

import java.util.*;


/**
 * @author smallAttr
 * @since 2019-10-31 18:57
 */
public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        combinationSum(candidates, 8);
    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        // 排序
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        combination(result, list, candidates, 0, 0, target);
        return result;
    }

    private static void combination(List<List<Integer>> result, List<Integer> list, int[] candidates, int sum, int index, int target) {
        int length = candidates.length;
        if (sum > target) {
            return;
        } else if (sum == target) {
            result.add(new LinkedList<>(list));
        } else {
            for (int i = index; i < length; i++) {
                list.add(candidates[i]);
                combination(result, list, candidates, sum + candidates[i], i, target);
                list.remove(list.size() - 1);
            }
        }
    }
}
