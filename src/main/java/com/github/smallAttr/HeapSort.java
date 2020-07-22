package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-12-20 15:03
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] ints = {8, 9, 7, 6, 5, 4, 3, 2, 1};
        bigHeapSort(ints);
        System.out.println(Arrays.toString(ints));
        smallHeapSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 大顶堆（升序排列）
     * @param ints
     */
    public static void bigHeapSort(int[] ints) {
        int length = ints.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            bigAdjustHeap(ints, i, length);
        }
        for (int i = length - 1; i > 0; i--) {
            swap(ints, 0, i);
            bigAdjustHeap(ints, 0, i);
        }
    }

    private static void bigAdjustHeap(int[] ints, int i, int length) {
        int current = ints[i];
        for (int j = i * 2 + 1; j < length; j = j * 2 + 1) {
            if (j + 1 < length && ints[j] > ints[j + 1]) {
                j++;
            }
            if (current > ints[j]) {
                ints[i] = ints[j];
                i = j;
            } else {
                break;
            }
        }
        ints[i] = current;
    }

    public static void smallHeapSort(int[] ints) {
        int length = ints.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            smallAdjustHeap(ints, i, length);
        }
        for (int i = length - 1; i > 0; i--) {
            swap(ints, 0, i);
            smallAdjustHeap(ints, 0, i);
        }
    }

    private static void smallAdjustHeap(int[] ints, int i, int length) {
        int current = ints[i];
        for (int j = i * 2 + 1; j < length; j = j * 2 + 1) {
            if (j + 1 < length && ints[j] < ints[j + 1]) {
                j++;
            }
            if (current < ints[j]) {
                ints[i] = ints[j];
                i = j;
            } else {
                break;
            }
        }
        ints[i] = current;
    }

    private static void swap(int[] ints, int i, int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }
}
