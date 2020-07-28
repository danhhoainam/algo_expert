package algo.medium.prob_019_river_sizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Idea: We will use DFS to traverse through nearest elements
 *       for DFS, we should use stack (BFS: we will use Queue)
 * O(n) time: n = w x h -> because we traverse through all elements in array
 * O(n) space: we store visited positions in an array of (w, h) dimensions
 */
public class Solution {
    public static void main(String[] args) {

        int[][] data1 = new int[][] {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0}
        };
        System.out.println(riverSizes(data1));

        int[][] data2 = new int[][] {{0}};
        System.out.println(riverSizes(data2));

        int[][] data3 = new int[][] {{1}};
        System.out.println(riverSizes(data3));

        int[][] data4 = new int[][] {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0}};
        System.out.println(riverSizes(data4));
    }

    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> riverSizes = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (visited[i][j]) continue;
                traverse(i, j, matrix, visited, riverSizes); // find the rivers and their sizes
            }
        }

        return riverSizes;
    }

    public static void traverse(int i, int j, int[][] matrix, boolean[][] visited, List<Integer> riverSizes) {
        Stack<Integer[]> nodesToExplore = new Stack<>();
        nodesToExplore.push(new Integer[] { i, j });
        int currentRiverSize = 0;

        while (!nodesToExplore.isEmpty()) {
            Integer[] currentVisit = nodesToExplore.pop();
            i = currentVisit[0];
            j = currentVisit[1];
            if (visited[i][j]) {
                continue;
            }
            visited[i][j] = true;
            if (matrix[i][j] == 0) {
                continue;
            }

            currentRiverSize++;
            List<Integer[]> unvisitedNeighbors = getUnvisitedNeighbors(i, j, matrix, visited);
            for (Integer[] neighbor : unvisitedNeighbors) {
                nodesToExplore.push(neighbor);
            }
        }

        if (currentRiverSize > 0) {
            riverSizes.add(currentRiverSize);
        }
    }

    public static List<Integer[]> getUnvisitedNeighbors(int i, int j, int[][] matrix, boolean[][] visited) {
        List<Integer[]> unvisitedNeighbors = new ArrayList<>();
        if (i > 0 && !visited[i - 1][j]) {
            unvisitedNeighbors.add(new Integer[] { i - 1, j });
        }
        if (i < matrix.length - 1 && !visited[i + 1][j]) {
            unvisitedNeighbors.add(new Integer[] { i + 1, j });
        }
        if (j > 0 && !visited[i][j - 1]) {
            unvisitedNeighbors.add(new Integer[] { i, j - 1 });
        }
        if (j < matrix[0].length - 1 && !visited[i][j + 1]) {
            unvisitedNeighbors.add(new Integer[] { i, j + 1 });
        }

        return unvisitedNeighbors;
    }
}
