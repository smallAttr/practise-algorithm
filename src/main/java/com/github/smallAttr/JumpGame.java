package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2020-04-28 17:35
 */
public class JumpGame {

    public static void main(String[] args) {

        int[] nums = {3, 0, 8, 2, 0, 0, 1};
        System.out.println(canJump(nums));

    }


    public static boolean canJump(int[] nums) {
        if (nums == null) {
            return false;
        }
        int length = nums.length;
        return canJump(nums, 0, length);
    }

    private static boolean canJump(int[] nums, int start, int length) {
        if (nums[start] >= (length - 1) - start) {
            return true;
        }
        if (nums[start] == 0) {
            return false;
        }
        for (int i = 1; i <= nums[start]; i++) {
            boolean b = canJump(nums, start + i, length);
            if (b) {
                return true;
            }
        }
        return false;
    }
}
