package tree;

/**
 * 285 - Inorder Successor in BST
 * <p>
 * Given the root of a binary search tree and a node p in it, return the in-order successor of that node in the BST. If the given node has no in-order successor in the tree, return null.
 * <p>
 * The successor of a node p is the node with the smallest key greater than p.val.
 * <p>
 * 5
 * / \
 * 3   7
 * / \ / \
 * 2  4 6  8
 * <p>
 * 左回溯 右
 * <p>
 * 中序  最左 回溯 右
 */


public class InorderSuccessorBST {
    //二叉树的遍历 有个特点是从小到大
    //back one step
    // have right tree   most left
    // not have right tree    go up father //
    // 遍历系欸但匹配 知道根节点一直右移动==p节点。 root的左节点 刚好小一个节点
    // none null
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        //右节点的最左节点
        if (p.right != null) {
            TreeNode successor = p.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            return successor;
        }

        TreeNode successor=null;
        while(root!=null){
            if(p.val<root.val){
                successor=root;//刚好小等于
                root=root.left;//小于的话根节点往左移动
            }else{
                root=root.right;//大于的话根节点往右移动
            }
        }

        return successor;


    }

    public static void main(String[] args) {
        // 构建示例二叉搜索树
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        InorderSuccessorBST solution = new InorderSuccessorBST();

        // 查找节点 5 的中序后继
        TreeNode successor = solution.inorderSuccessor(root, new TreeNode(5));
        System.out.println("The inorder successor of 5 is: " + (successor != null ? successor.val : "null"));

        // 查找节点 4 的中序后继
        successor = solution.inorderSuccessor(root, new TreeNode(4));
        System.out.println("The inorder successor of 4 is: " + (successor != null ? successor.val : "null"));

    }
}
