package algo.medium.prob_005_spriral_traverse;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result = new ArrayList<>();
        if (array.length == 0) return result;

        int row = array.length;
        int column = array[0].length;

        int startCol = 0;
        int startRow = 0;
        int endCol = column - 1;
        int endRow = row - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                result.add(array[startRow][i]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(array[i][endCol]);
            }

            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) break;
                result.add(array[endRow][i]);
            }

            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) break;
                result.add(array[i][startCol]);
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        return result;
    }
}
