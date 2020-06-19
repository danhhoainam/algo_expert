package algo.prob01.easy.node_depths;

import common.BinaryTree;
import common.TreeUtil;

import java.util.List;

public class NodeDepths {
    public static void main(String[] args) {
        BinaryTree tree = TreeUtil.initTree(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println(nodeDepths(tree));
    }

    public static int nodeDepths(BinaryTree root) {
        return sum(root, 0);
    }

    private static int sum(BinaryTree node, int depth) {
        if (node == null) {
            return 0;
        }

        int sumLeft = sum(node.left, depth + 1);
        int sumRight = sum(node.right, depth + 1);
        return depth + sumLeft + sumRight;
    }
}
