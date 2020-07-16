package algo.medium.prob_010_min_height_bst;

import java.util.List;

/**
 * O(n) time: just to add directly node to left and right
 * O(n) space: store n elements
 */
public class Solution2 {

    public static BST minHeightBst(List<Integer> array) {
        return buildTree(array, 0, array.size() - 1);
    }

    public static BST buildTree(List<Integer> array, Integer start, Integer end) {
        if (start > end) {
            return null;
        }

        Integer index = (start + end) / 2;
        Integer value = array.get(index);
        BST node = new BST(value);

        node.left = buildTree(array, start, index - 1);
        node.right = buildTree(array, index + 1, end);
        return node;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
