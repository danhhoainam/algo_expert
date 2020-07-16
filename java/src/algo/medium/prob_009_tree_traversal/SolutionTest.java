package algo.medium.prob_009_tree_traversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionTest {
    @Test
    public void TestCase1() {
        var root = new Solution.BST(10);
        root.left = new Solution.BST(5);
        root.left.left = new Solution.BST(2);
        root.left.left.left = new Solution.BST(1);
        root.left.right = new Solution.BST(5);
        root.right = new Solution.BST(15);
        root.right.right = new Solution.BST(22);

        List<Integer> inOrder = Arrays.asList(new Integer[] {1, 2, 5, 5, 10, 15, 22});
        List<Integer> preOrder = Arrays.asList(new Integer[] {10, 5, 2, 1, 5, 15, 22});
        List<Integer> postOrder = Arrays.asList(new Integer[] {1, 2, 5, 5, 22, 15, 10});

        Assertions.assertTrue(Solution.inOrderTraverse(root, new ArrayList<>()).equals(inOrder));
        Assertions.assertTrue(Solution.preOrderTraverse(root, new ArrayList<>()).equals(preOrder));
        Assertions.assertTrue(Solution.postOrderTraverse(root, new ArrayList<>()).equals(postOrder));
    }
}