/*
* This problem was asked by Fitbit.
*
* Given a linked list, rearrange the node values such that they appear in alternating
* low -> high -> low -> high ... form.
*
* For example, given 1 -> 2 -> 3 -> 4 -> 5, you should return 1 -> 5 -> 2 -> 4 -> 3.
* given 1 -> 2 -> 3 -> 4 you should return 1 -> 4 -> 2 -> 3
* */

import utils.LinkedNode;

public class GetAlternatingLinkedListOrder {

    public static LinkedNode getAlternatingOrder(LinkedNode head) {
        if (head == null) {
            return null;
        }

        LinkedNode slow = head;
        LinkedNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        LinkedNode firstHalfStart = head;
        LinkedNode secondHalfStart = reverseLinkedList(slow.next);
        slow.next = null;

        LinkedNode ans = new LinkedNode(-1);
        LinkedNode nextNode = ans;
        int count = 0;

        while (firstHalfStart != null && secondHalfStart != null) {
            if (count % 2 == 0) {
                nextNode.next = new LinkedNode(firstHalfStart.val);
                firstHalfStart = firstHalfStart.next;
            }
            else {
                nextNode.next = new LinkedNode(secondHalfStart.val);
                secondHalfStart = secondHalfStart.next;
            }

            nextNode = nextNode.next;
            count++;
        }

        while (firstHalfStart != null) {
            nextNode.next = new LinkedNode(firstHalfStart.val);
            firstHalfStart = firstHalfStart.next;
            nextNode = nextNode.next;
        }

        return ans.next;
    }

    private static LinkedNode reverseLinkedList(LinkedNode node) {
        LinkedNode curr = node;
        LinkedNode prev = null;
        LinkedNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
