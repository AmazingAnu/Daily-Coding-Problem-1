import org.junit.Test;
import utils.LinkedNode;

import static junit.framework.TestCase.assertEquals;
import static utils.LinkedListUtil.createLinkedList;
import static utils.LinkedListUtil.printLinkedList;

public class GetAlternatingLinkedListOrderTest {

    LinkedNode head;
    LinkedNode ans;

    @Test
    public void test1() {
        head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ans = createLinkedList(new int[]{1, 5, 2, 4, 3});

        assertEquals(
                printLinkedList(ans),
                printLinkedList(GetAlternatingLinkedListOrder.getAlternatingOrder(head))
        );
    }

    @Test
    public void test2() {
        head = createLinkedList(new int[]{1, 2, 3, 4});
        ans = createLinkedList(new int[]{1, 4, 2, 3});

        assertEquals(
                printLinkedList(ans),
                printLinkedList(GetAlternatingLinkedListOrder.getAlternatingOrder(head))
        );
    }

    @Test
    public void test3() {
        head = createLinkedList(new int[]{});
        ans = createLinkedList(new int[]{});

        assertEquals(
                printLinkedList(ans),
                printLinkedList(GetAlternatingLinkedListOrder.getAlternatingOrder(head))
        );
    }

    @Test
    public void test4() {
        head = createLinkedList(new int[]{1});
        ans = createLinkedList(new int[]{1});

        assertEquals(
                printLinkedList(ans),
                printLinkedList(GetAlternatingLinkedListOrder.getAlternatingOrder(head))
        );
    }

    @Test
    public void test5() {
        head = createLinkedList(new int[]{1, 2});
        ans = createLinkedList(new int[]{1, 2});

        assertEquals(
                printLinkedList(ans),
                printLinkedList(GetAlternatingLinkedListOrder.getAlternatingOrder(head))
        );
    }

    @Test
    public void test6() {
        head = createLinkedList(new int[]{1, 2, 3});
        ans = createLinkedList(new int[]{1, 3, 2});

        assertEquals(
                printLinkedList(ans),
                printLinkedList(GetAlternatingLinkedListOrder.getAlternatingOrder(head))
        );
    }
}
