import utils.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeTree {

    public static StringBuilder sb;
    public static String serializeBinaryTree(TreeNode root) {
        sb = new StringBuilder();
        serializeBinaryTreeHelper(root);

        return sb.toString();
    }

    private static void serializeBinaryTreeHelper(TreeNode root) {
        if (root == null) {
            sb.append("null").append(",");
            return;
        }

        sb.append(root.val).append(",");
        serializeBinaryTreeHelper(root.left);
        serializeBinaryTreeHelper(root.right);
    }

    public static TreeNode deserializeBinaryTree(String serialized) {
        if (serialized.length() == 0) {
            return null;
        }

        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(serialized.split(",")));

        return deserializeBinaryTreeHelper(queue);
    }

    private static TreeNode deserializeBinaryTreeHelper(Queue<String> queue) {
        String val = queue.remove();
        if (val.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeBinaryTreeHelper(queue);
        node.right = deserializeBinaryTreeHelper(queue);

        return node;
    }
}
