package tree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 *
 * Approach
 * Use DFS.  深度优先搜索
 *
 * Complexity
 * Time complexity:
 * O(n)
 *
 * Space complexity:
 * O(n)
 */
public class GoodNodeTree {
    public int goodNodes(TreeNode root) {

        return findGoodNodes(root, Integer.MIN_VALUE);

    }

    private int findGoodNodes(TreeNode node, int max) {
        int count = 0;
        if (node.val >= max) {
            count++;
        }
        if (node.left != null) {
            count += findGoodNodes(node.left, Math.max(max, node.val));
        }
        if (node.right != null) {
            count += findGoodNodes(node.right, Math.max(max, node.val));
        }
        return count;
    }
}
