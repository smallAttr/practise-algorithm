package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2019-08-23 16:50
 */
public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = new int[]{};
        int count = removeElement(nums, 1);
        for (int i = 0; i < count; i++) {
            System.out.println(nums[i]);
        }

    }


    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
