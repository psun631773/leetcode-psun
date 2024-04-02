package tree;



public class BinaryTreeTraversal {

    // 前序遍历
    public void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " "); // 访问根节点
            preorderTraversal(root.left); // 遍历左子树
            preorderTraversal(root.right); // 遍历右子树
        }
    }

    // 中序遍历
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left); // 遍历左子树
            System.out.print(root.val + " "); // 访问根节点
            inorderTraversal(root.right); // 遍历右子树
        }
    }

    // 后序遍历
    public void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left); // 遍历左子树
            postorderTraversal(root.right); // 遍历右子树
            System.out.print(root.val + " "); // 访问根节点
        }
    }

    public static void main(String[] args) {
        // 构建示例二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.left = new TreeNode(11);
        root.right.left.right = new TreeNode(12);
        root.right.right.left = new TreeNode(13);

        BinaryTreeTraversal tree = new BinaryTreeTraversal();

        System.out.print("Preorder traversal: ");
        tree.preorderTraversal(root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        tree.inorderTraversal(root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorderTraversal(root);
        System.out.println();
    }
}
