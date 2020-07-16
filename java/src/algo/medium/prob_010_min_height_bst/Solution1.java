package algo.medium.prob_010_min_height_bst;

import java.util.List;

/**
 * O(nlogn) time: we have to loop through each of elements, then implement insert operation with logN time
 * O(n) space: to store the elements of the tree
 */
public class Solution1 {

    public static BST minHeightBst(List<Integer> array) {
        return buildTree(array, null, 0, array.size() - 1);
    }

    public static BST buildTree(List<Integer> array, BST node, Integer start, Integer end) {
        if (start > end) {
            return null;
        }

        Integer index = (start + end) / 2;
        Integer value = array.get(index);
        if (node == null) {
            node = new BST(value);
        } else {
            node.insert(value); // always call on root node -> logN time
        }

        buildTree(array, node, start, index - 1);
        buildTree(array, node, index + 1, end);
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
