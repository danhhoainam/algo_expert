package algo.medium.prob_008_validate_bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void TestCase1() {
        var root = new Solution.BST(10);
        root.left = new Solution.BST(5);
        root.left.left = new Solution.BST(2);
        root.left.left.left = new Solution.BST(1);
        root.left.right = new Solution.BST(5);
        root.right = new Solution.BST(15);
        root.right.left = new Solution.BST(13);
        root.right.left.right = new Solution.BST(14);
        root.right.right = new Solution.BST(22);

        assertTrue(Solution.validateBst(root));
    }
}