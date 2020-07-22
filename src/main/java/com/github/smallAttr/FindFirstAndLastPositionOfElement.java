package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-12-17 10:25
 */
public class FindFirstAndLastPositionOfElement {

    public static void main(String[] args) {
        int[] ints = {5, 7, 7, 8, 8, 10};
        searchRange(ints, 8);
    }


    public static int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        boolean flag = true;
        Map<String, Integer> map = new HashMap<>();
        binarySearch(nums, target, start, end, flag, map);
        if (map.isEmpty()) {
            return new int[]{-1, -1};
        }
        return new int[]{map.get("left"), map.get("right")};
    }

    private static void binarySearch(int[] nums, int target, int start, int end, boolean flag, Map<String, Integer> map) {
        if (start > end) {
            return;
        }
        int middle = (end + start) / 2;
        if (nums[middle] < target) {
            binarySearch(nums, target, middle + 1, end, flag, map);
        } else if (nums[middle] == target) {
            if (flag) {
                map.put("left", middle);
                map.put("right", middle);
                flag = false;
            }
            if (map.get("left") > middle) {
                map.put("left", middle);
            }
            if (map.get("right") < middle) {
                map.put("right", middle);
            }
            binarySearch(nums, target, start, middle - 1, flag, map);
            binarySearch(nums, target, middle + 1, end, flag, map);
        } else {
            binarySearch(nums, target, start, middle - 1, flag, map);

        }
    }
}
