package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2019-12-16 18:20
 */
public class ReverseNodesInKGroup {

    public static void main(String[] args) {
        ListNode head = null;
        ListNode target = null;
        for (int i = 0; i < 9; i++) {
            if (head == null) {
                head = new ListNode(i + 1);
                target = head;
            } else {
                target.next = new ListNode(i + 1);
                target = target.next;
            }
        }
        reverseKGroup(head, 4);

    }


    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int count = 0;
        ListNode aa = head;
        while (aa != null) {
            count++;
            aa = aa.next;
        }
        ListNode currentNode, preNode;
        currentNode = preNode = head;
        ListNode nextNode = head.next;
        head.next = null;
        for(int i = 1; i < count; i++){
            if(nextNode != null){
                currentNode = nextNode;
                nextNode = nextNode.next;
                currentNode.next = preNode;
                preNode = currentNode;
            }
        }
        int left = count % k;
        return currentNode;

    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
