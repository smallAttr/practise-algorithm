package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2020-01-03 18:38
 */
public class RemoveLinkedListElements {

    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode newHead = dummyHead;
        while (newHead.next != null) {
            ListNode next = newHead.next;
            if (next.val == val) {
                newHead.next = next.next;
            } else {
                newHead = newHead.next;
            }
        }
        return dummyHead.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
