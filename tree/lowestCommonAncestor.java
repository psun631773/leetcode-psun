package tree;

/**
 *
 *
 * 基本思路： 从根节点开始，递归地往下搜索，如果当前节点是p或q中的一个，则返回当前节点。然后分别在左子树和右子树中递归查找。如果左子树和右子树都找到了结果，说明当前节点就是最低公共祖先。如果只有一边找到了结果，则返回找到的节点，表示这个节点向上反可以找到两个节点的最低公共祖先。
 *
 * 递归调用： 递归调用是这个算法的核心。每次递归时，传入当前节点的左子树和右子树，以及要查找的两个节点p和q。递归函数会返回找到的最低公共祖先节点。
 *
 * 记忆提示： 可以通过以下方法记忆这个算法：
 *
 * 当前节点为空时，返回空。
 * 当前节点等于p或q时，返回当前节点。
 * 分别在左子树和右子树中递归查找p和q，如果左右子树都找到了结果，则返回当前节点。
 * 如果只有一边找到了结果，则返回找到的节点。
 *
 *当前节点是空 返回空
 * 当前节点p 或者q 含有返回这个节点 因为找到了一个节点
 * 遍历左右子树
 * 左右子树 都有这个节点就是
 * 左子树有 返回左子树
 * 右子树有 返回右子树
 * 都没有返回空
 *
 *
 *
 */
public class lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 先检查当前节点

        // 没找到返回空 叶子节点了都
        if (root == null) {
            return null;
        }
        // 找到了返回他本身
        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        //当前节点找完了，找左右子树
        // 否则向下寻找 把下面的节点 反上来
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 左右子树找到了结果
        if (left != null && right != null) {
            return root;
        }
        // 左子树找到了结果 返回左子树节点向上反
        if (left != null) {
            return left;
        }
        // 右子树找到了 返回右子树节点向上反
        if (right != null) {
            return right;
        }
        //什么都没有找到 返回null
        return null;
    }
}
