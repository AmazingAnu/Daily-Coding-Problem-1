package utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeUtil {

    public static TreeNode constructBinaryTree(int[] nodeValues) {
        return constructBinaryTreeHelper(nodeValues, 0, nodeValues.length - 1);
    }

    private static TreeNode constructBinaryTreeHelper(int[] nodeValues, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode node = new TreeNode(nodeValues[mid]);

        node.left = constructBinaryTreeHelper(nodeValues, start, mid - 1);
        node.right = constructBinaryTreeHelper(nodeValues, mid + 1, end);

        return node;
    }

    public static List<List<Integer>> printLevelOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> traversal = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            while (size-- > 0) {
                TreeNode popped = queue.remove();
                list.add(popped.val);

                if (popped.left != null) {
                    queue.add(popped.left);
                }

                if (popped.right != null) {
                    queue.add(popped.right);
                }
            }
            traversal.add(list);
        }

        return traversal;
    }
}
