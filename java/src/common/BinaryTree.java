package common;

public class BinaryTree {

    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree() {
    }

    public BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
