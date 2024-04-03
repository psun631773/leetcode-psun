package tree;


/**
 *
 *
 * 思路 遍历左子树 遍历右子树  左子树 遍历左右， 左左相同 重置， 右子树 右右相同 重置
 *
 *
 *
 */
public class LongestZigZag {

    public int longestZigZag(TreeNode root) {

        if (root == null)
            return 0;
        int leftPath = helper(root.left, 1, true);
        int rightPath = helper(root.right, 1, false);

        return Math.max(leftPath, rightPath);
    }

    private int helper(TreeNode node, int currCount, boolean isLeft) {
        if (node == null)
            return currCount - 1;   //因为是加1了 所以要减1
        int leftPath = 0;
        int rightPath = 0;
        if (isLeft) {
            leftPath = helper(node.left, 1, true);//左侧 相同 重置长度
            rightPath = helper(node.right, currCount + 1, false);
        } else {
            leftPath = helper(node.left, currCount + 1, true);
            rightPath = helper(node.right, 1, false);//右侧 相同 重置长度
        }
        return Math.max(leftPath, rightPath);
    }


}
