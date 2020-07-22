package com.github.smallAttr;

import java.util.*;
import java.util.function.*;

/**
 * @author smallAttr
 * @since 2019-08-23 10:26
 */
public class MergeKSortedLists {

    public static void main(String[] args) {

    }


    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            ListNode listNode = lists[i];
            while (listNode != null) {
                list.add(listNode.val);
                listNode = listNode.next;
            }
        }
        list.sort(Comparator.comparing(Function.identity()));
        ListNode head = null;
        ListNode target = null;
        int length = list.size();
        for (int i = 0; i < length; i++) {
            if (head == null) {
                head = new ListNode(list.get(i));
                target = head;
            } else {
                target.next = new ListNode(list.get(i));
                target = target.next;
            }
        }
        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
