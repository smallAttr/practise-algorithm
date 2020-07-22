package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2019-12-10 18:56
 */
public class TrappingRainWater {

    public static void main(String[] args) {
        int[] ints = {1, 0, 0, 0};
        System.out.println(trap(ints));

    }


    public static int trap(int[] height) {
        int target = 0;
        int length = height.length;
        int leftMax, rightMax;
        for (int i = 1; i < length; i++) {
            leftMax = 0;
            rightMax = 0;
            for (int j = 0; j < i; j++) {
                if (leftMax <= height[j]) {
                    leftMax = height[j];
                }
            }
            for (int j = i + 1; j < length; j++) {
                if (rightMax <= height[j]) {
                    rightMax = height[j];
                }
            }
            if (Math.min(leftMax, rightMax) < height[i]) {
                continue;
            }
            target = target + (Math.min(leftMax, rightMax) - height[i]);
        }
        return target;
    }
}
