package com.github.smallAttr;


/**
 * @author smallAttr
 * @since 2019-08-23 16:29
 */
public class RemoveDuplicates {


    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3, 3};
        int count = removeDuplicates(nums);
        for (int i = 0; i < count; i++) {
            System.out.println(nums[i]);
        }
    }


    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
