/*
* This problem was asked by Morgan Stanley.
*
* In Ancient Greece, it was common to write text with the first line going left to right, the second line going right to
* left, and continuing to go back and forth. This style was called "boustrophedon".
*
* Given a binary tree, write an algorithm to print the nodes in boustrophedon order.
*
* For example, given the following tree:

               1
            /     \
          2         3
         / \       / \
        4   5     6   7
*
* You should return [1, 3, 2, 4, 5, 6, 7].
*
* */

import utils.TreeNode;

import java.util.*;

public class BinaryTreeBoustrophedonOrder {
    public static List<Integer> getBoustrophedonOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        int dir = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();

            while (size-- > 0) {
                TreeNode popped = queue.remove();
                temp.add(popped.val);

                if (popped.left != null) {
                    queue.add(popped.left);
                }

                if (popped.right != null) {
                    queue.add(popped.right);
                }
            }

            if (dir % 2 != 0) {
                Collections.reverse(temp);
            }

            list.addAll(temp);
            dir++;
        }

        return list;
    }
}
