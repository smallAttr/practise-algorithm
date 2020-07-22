package com.github.smallAttr;


/**
 * @author smallAttr
 * @since 2019-08-27 11:58
 * 查询两个数组中第m个小的数（两数组元素不重复，有序递增）
 */
public class FindNum {

    public static void main(String[] args) {

        int[] a = new int[]{1, 5, 10, 20, 50, 65, 70};
        int[] b = new int[]{2, 6, 12, 15, 18, 49, 80, 100};
        System.out.println(findMinK(a, b, 13));

    }

    private static int findMinK(int[] a, int[] b, int m) {
        int lena = a.length;
        int lenb = b.length;
        int totalLen = lena + lenb;
        // can not find
        if (totalLen < m) {
            return 0;
        }
        if (lena == 0) {
            return b[m - 1];
        }
        if (lenb == 0) {
            return a[m - 1];
        }
        int result = 0, i = 0, j = 0;
        int count = 1;
        boolean flag = false;
        while (i < lena && j < lenb) {
            if (a[i] < b[j]) {
                if (count == m) {
                    result = a[i];
                    flag = true;
                    break;
                }
                i++;
            } else {
                if (count == m) {
                    result = b[j];
                    flag = true;
                    break;
                }
                j++;
            }
            count++;

        }
        if (!flag) {
            // 遍历b数组
            if (i == lena) {
                while (j < lenb) {
                    if (count == m) {
                        result = b[j];
                        break;
                    }
                    j++;
                    count++;
                }
            } else {
                while (i < lena) {
                    if (count == m) {
                        result = a[i];
                        break;
                    }
                    i++;
                    count++;
                }
            }
        }
        return result;
    }

}
