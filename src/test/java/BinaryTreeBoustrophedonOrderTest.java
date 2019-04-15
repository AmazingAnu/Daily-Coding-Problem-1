import org.junit.Test;
import utils.BinaryTreeUtil;
import utils.TreeNode;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinaryTreeBoustrophedonOrderTest {

    TreeNode node = BinaryTreeUtil.constructBinaryTree(new int[]{4, 2, 5 , 1, 6, 3, 7});

    @Test
    public void test1() {
        assertEquals(
                BinaryTreeBoustrophedonOrder.getBoustrophedonOrder(node).toString(),
                Arrays.asList(1, 3, 2, 4, 5, 6, 7).toString()
        );
    }
}
