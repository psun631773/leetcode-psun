package tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTree {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getTreeLeaf(root1, list1);
        getTreeLeaf(root2, list2);
        return list1.equals(list2);
    }

    private void getTreeLeaf(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            list.add(root.val);
        } else {
            getTreeLeaf(root.left, list);
            getTreeLeaf(root.right, list);
        }

    }
}
