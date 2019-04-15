import org.junit.Test;
import utils.LinkedListUtil;
import utils.LinkedNode;

import static junit.framework.TestCase.assertEquals;

public class GetAlternatingLinkedListOrderTest {

    LinkedNode head = LinkedListUtil.createLinkedList(new int[]{1, 2, 3, 4, 5});
    LinkedNode ans = LinkedListUtil.createLinkedList(new int[]{1, 3, 2, 4, 5});

    @Test
    public void test1() {
        assertEquals(
                LinkedListUtil.printLinkedList(GetAlternatingLinkedListOrder.getAlternatingOrder(head)),
                LinkedListUtil.printLinkedList(ans)
        );
    }
}
