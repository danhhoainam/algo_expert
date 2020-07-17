package algo.medium.prob_011_invert_binary_tree;

/**
 * O(n) time: we traverse through all nodes on the tree
 * O(d) space: d is the depth of the tree. why? we call a stack of recursive calls
 *             because this is Binary tree -> d = logN
 */
public class Solution {

    public static void invertBinaryTree(BinaryTree tree) {
        if (tree == null) {
            return;
        }
        swapNode(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    private static void swapNode(BinaryTree tree) {
        BinaryTree tempNode = tree.left;
        tree.left = tree.right;
        tree.right = tempNode;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
