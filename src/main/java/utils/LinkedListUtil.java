package utils;

public class LinkedListUtil {

    public static LinkedNode createLinkedList(int[] array) {
        LinkedNode ans = new LinkedNode(-1);
        LinkedNode next = ans;

        for (int num : array) {
            next.next = new LinkedNode(num);
            next = next.next;
        }

        return ans.next;
    }

    public static String printLinkedList(LinkedNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val + "->");
            head = head.next;
        }

        return sb.toString();
    }
}
