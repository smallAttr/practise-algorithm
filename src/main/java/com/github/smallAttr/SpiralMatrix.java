package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2020-07-20 11:20
 */
public class SpiralMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralOrder(matrix);

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> target = new ArrayList<>();
        return target;
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        int sum = rows * cols;
//        boolean[][] flag = new boolean[rows + 1][cols + 1];
//        for (int i = 0; i < rows + 1; i++) {
//            for (int j = 0; j < cols + 1; j++) {
//                if (i == 0 || i == rows || j == 0 || j == cols) {
//                    flag[i][j] = true;
//                } else {
//                    flag[i][j] = false;
//                }
//            }
//        }
//        int x = 0, y = 0;
//        // 向左->向下->向右->向上
//        while (target.size() < sum) {
//            if ()
//            int width = cols;
//            int height = rows;
//
//        }
        // 终止条件 都不能移动了



    }

}
