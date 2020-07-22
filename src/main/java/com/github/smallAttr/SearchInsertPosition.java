package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2019-09-04 16:19
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int index = -1;
        for (int i = 0; i < length; i++) {
            if (target <= nums[i]) {
                index = i;
                break;

            }
        }
        return index == -1 ? length : index;
    }
}
