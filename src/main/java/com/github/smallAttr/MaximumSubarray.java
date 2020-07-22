package com.github.smallAttr;


/**
 * @author smallAttr
 * @since 2020-07-17 17:52
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, -4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }


    public static int maxSubArray(int[] nums){
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int max_result = nums[0];
        int[] dp = new int[length];
        dp[0] = nums[0];
        for (int i = 1; i < length; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max_result = Math.max(max_result, dp[i]);
        }
        return max_result;
    }
}
