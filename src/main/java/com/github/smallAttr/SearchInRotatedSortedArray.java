package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-12-11 18:19
 */
public class SearchInRotatedSortedArray {


    public static void main(String[] args) {
        int[] ints = {5, 6, 7, 0, 1, 2, 4};
        search(ints, 0);
    }


    public static int search(int[] nums, int target) {
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        Map<String, Integer> map = new HashMap<>();
        binarySearch(nums, target, start, end, map);
        if (map.isEmpty()) {
            return -1;
        }
        return map.get("index");
    }

    private static void binarySearch(int[] nums, int target, int start, int end, Map<String, Integer> map) {
        if (start > end) {
            return;
        }
        int middle = (end + start) / 2;
        if (nums[middle] == target) {
            map.put("index", middle);
        } else {
            binarySearch(nums, target, middle + 1, end, map);
            binarySearch(nums, target, start, middle - 1, map);
        }
    }


}
