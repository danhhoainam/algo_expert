package algo.easy.prob_004_branch_sums;

import common.BinaryTree;

import java.util.ArrayList;
import java.util.List;

import static common.TreeUtil.inOrderTraversal;
import static common.TreeUtil.initTree;

public class BranchSums {

    public static void main(String[] args) {
        BinaryTree tree = initTree(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        inOrderTraversal(tree);
        System.out.println(branchSums(tree));
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> result = new ArrayList<>();
        sum(root, result, 0);

        return result;
    }

    public static void sum(BinaryTree node,
                           List<Integer> result,
                           Integer runningSum) {
        if (node == null) {
            return;
        }

        Integer newRuningSum = runningSum + node.value;
        if (node.left == null && node.right == null) {
            result.add(newRuningSum);
            return;
        }

        sum(node.left, result, newRuningSum);
        sum(node.right, result, newRuningSum);
    }
}
