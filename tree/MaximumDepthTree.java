package tree;


/**
 * time complexity  O(N)
 * space complexity 0(N) normal situation is O(lgN)
 */
public class MaximumDepthTree {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
