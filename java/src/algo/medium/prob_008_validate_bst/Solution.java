package algo.medium.prob_008_validate_bst;

public class Solution {

    public static boolean validateBst(BST tree) {
        return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validateBst(BST tree, Integer minValue, Integer maxValue) {
        if (tree.value < minValue || tree.value >= maxValue) {
            return false;
        }

        if (tree.left != null && !validateBst(tree.left, minValue, tree.value)) {
            return false;
        }

        if (tree.right != null && !validateBst(tree.right, tree.value, maxValue)) {
            return false;
        }

        return true;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
