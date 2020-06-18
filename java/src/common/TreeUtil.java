package common;

import java.util.List;

public class TreeUtil {

    public static BinaryTree initTree(List<Integer> seeds) {
        return insertNode(seeds, null, 0);
    }

    public static BinaryTree insertNode(List<Integer> seeds, BinaryTree root, Integer index) {
        if (index < seeds.size()) {
            BinaryTree node = new BinaryTree(seeds.get(index));
            root = node;

            root.left = insertNode(seeds, root.left, index * 2 + 1);
            root.right = insertNode(seeds, root.right, index * 2 + 2);
        }

        return root;
    }

    public static void inOrderTraversal(BinaryTree root)
    {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }
}
