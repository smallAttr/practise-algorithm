package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-10-29 16:31
 */
public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','5','.','.','.','3'},
                {'4','6','.','1','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));

    }




    public static boolean isValidSudoku(char[][] board) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int rowIndex = (i / 3) * 3;
                int colIndex = (j / 3) * 3;
                set.clear();
                for (int k = rowIndex; k < rowIndex + 3; k++) {
                    for (int l = colIndex; l < colIndex + 3; l++) {
                        if (board[k][l] != '.') {
                            if (!set.add(board[k][l] - '0')) {
//                                System.out.println("aa：" + k);
//                                System.out.println("aa：" + l);
                                return false;
                            }
                        }
                    }
                }
            }
        }


        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!set.add(board[i][j] - '0')) {
//                        System.out.println("bb：" + i);
//                        System.out.println("bb：" + j);
                        return false;
                    }
                }
            }
            set.clear();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (!set.add(board[j][i] - '0')) {
//                        System.out.println("cc：" + j);
//                        System.out.println("cc：" + i);
                        return false;
                    }
                }
            }
            set.clear();
        }
        return true;
    }
}
