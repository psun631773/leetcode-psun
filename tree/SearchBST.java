package tree;

/**
 *     public TreeNode searchBST(TreeNode root, int val) {
 *
 *         if (root == null || root.val == val) {
 *             return root;
 *         } else if (root.val < val) {
 *             return searchBST(root.right, val);
 *         } else {
 *             return searchBST(root.left, val);
 *         }
 *
 *     }
 *     充分利用二叉树的性质 从小到大排列
 *     time complexity  O logN  2分递归
 *     Space Complexity O(logN)
 */
public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null || root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }

    }
}
