package com.github.smallAttr.data_structure.chapter_I.section_I;

/**
 * @author smallAttr
 * @since 2020-04-04 23:21
 * FixedCapacityStackOfStrings
 */
public class Problem_I {

    private String[] a;

    private int N;


    public Problem_I(int capacity) {
        a = new String[capacity];
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public boolean isFull() {
        return a.length == N;
    }

}
