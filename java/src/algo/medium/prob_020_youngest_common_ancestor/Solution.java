package algo.medium.prob_020_youngest_common_ancestor;

public class Solution {

    public static void main(String[] args) {

    }

    public static AncestralTree getYoungestCommonAncestor(
            AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
        int depthOne = findDepth(descendantOne, topAncestor);
        int depthTwo = findDepth(descendantTwo, topAncestor);

        if (depthOne >= depthTwo) {
            return backtrack(descendantOne, descendantTwo, depthOne - depthTwo);
        } else {
            return backtrack(descendantTwo, descendantOne, depthTwo - depthOne);
        }
    }

    private static AncestralTree backtrack(AncestralTree longerTree, AncestralTree shorterTree, int diff) {
        while (diff > 0) {
            diff--;
            longerTree = longerTree.ancestor;
        }

        while (longerTree != shorterTree) {
            longerTree = longerTree.ancestor;
            shorterTree = shorterTree.ancestor;
        }

        return longerTree;
    }

    private static int findDepth(AncestralTree tree, AncestralTree top) {
        int depth = 0;
        while (tree != top) {
            depth++;
            tree = tree.ancestor;
        }

        return depth;
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }
}
