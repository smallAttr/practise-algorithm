package com.github.smallAttr;


/**
 * @author smallAttr
 * @since 2019-08-22 14:38
 * 比较常见的链表操作。下面看一下典型情况，如要交换链表中A->B->C->D中的B和C需要做如下操作：
 *
 * 将A指向C
 * 将B指向D
 * 将C指向B
 */
public class SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head) {
        ListNode target = new ListNode(0);
        target.next = head;
        ListNode temp = target;
        ListNode first, second;
        while (temp.next != null && temp.next.next != null) {
            first = temp.next;
            second = temp.next.next;
            temp.next = second;
            first.next = second.next;
            second.next = first;
            temp = temp.next.next;
        }
        return target.next;
    }

    public static void main(String[] args) {
        int first = 9;
        int count = 4;
        ListNode head = new ListNode(first);
        ListNode current = head;
        while (count-- > 0) {
            head.next = new ListNode(--first);
            head = head.next;
        }
        ListNode node = swapPairs(current);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
