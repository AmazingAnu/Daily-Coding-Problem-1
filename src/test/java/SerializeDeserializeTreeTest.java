import org.junit.Test;
import utils.BinaryTreeUtil;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SerializeDeserializeTreeTest {

    @Test
    public void test1() {
        TreeNode node = BinaryTreeUtil.constructBinaryTree(new int[]{1, 2, 3, 4, 5, 6});
        List<Integer> actualList =  flatten(BinaryTreeUtil.printLevelOrderTraversal(node));

        String serialized = SerializeDeserializeTree.serializeBinaryTree(node);
        TreeNode deserializedNode = SerializeDeserializeTree.deserializeBinaryTree(serialized);

        List<Integer> answerList = flatten(BinaryTreeUtil.printLevelOrderTraversal(deserializedNode));

        assertArrayEquals(actualList.toArray(), answerList.toArray());
    }

    private List<Integer> flatten(List<List<Integer>> printLevelOrderTraversal) {
        List<Integer> list = new ArrayList<>();

        printLevelOrderTraversal.forEach(e -> list.addAll(e));

        return list;
    }
}
