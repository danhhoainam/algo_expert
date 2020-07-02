package algo.medium.prob_002_smallest_diff;

import common.Printer;

import java.util.Arrays;

public class Solution2 {

    public static void main(String[] args) {
        Printer.printIntArr(smallestDifference(new int[] {-1,5,10,20,28,3},new int[]{26,134,135,15,17}));
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int[] smallestPair = new int[2];
        int idOne = 0;
        int idTwo = 0;

        int smallest = Integer.MAX_VALUE;
        int current;

        while(idOne < arrayOne.length && idTwo < arrayTwo.length) {
            int first = arrayOne[idOne];
            int second = arrayTwo[idTwo];
            if (first < second) {
                current = second - first;
                idOne++;
            } else if (first > second) {
                current = first - second;
                idTwo++;
            } else {
                return new int[] {first, second};
            }

            if (smallest > current) {
                smallest = current;
                smallestPair = new int[] { first, second };
            }
        }

        return smallestPair;
    }
}
