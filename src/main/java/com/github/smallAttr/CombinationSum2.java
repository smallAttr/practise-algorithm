package com.github.smallAttr;

import java.util.*;
import java.util.stream.*;

/**
 * @author smallAttr
 * @since 2019-12-18 15:46
 */
public class CombinationSum2 {

    public static void main(String[] args) {

        int[] candidates = {2,5,2,1,2};
        combinationSum2(candidates, 5);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // 排序
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        combination(result, list, candidates, 0, 0, target);
        Set<List<Integer>> set = result.stream().collect(Collectors.toSet());
        return new ArrayList<>(set);
    }

    private static void combination(List<List<Integer>> result, List<Integer> list, int[] candidates, int sum, int index, int target) {
        int length = candidates.length;
        if (sum > target) {
            return;
        } else if (sum == target) {
            result.add(new LinkedList<>(list));
        } else {
            for (int i = index; i < length; i++) {
                int j = i;
                list.add(candidates[j]);
                combination(result, list, candidates, sum + candidates[j], ++j, target);
                list.remove(list.size() - 1);
            }
        }
    }
}
