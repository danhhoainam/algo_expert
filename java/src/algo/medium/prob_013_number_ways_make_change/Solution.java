package algo.medium.prob_013_number_ways_make_change;

/**
 * O(n) space: we store N + 1 possibilities in an array
 * O(n*d) time: n is the size of possibilities, d is the size of denominations
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(numberOfWaysToMakeChange(14, new int[] {1, 5, 10, 25}));
        System.out.println(numberOfWaysToMakeChange(14, new int[] {1, 2, 5, 10, 25}));
    }

    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int [] ways = new int[n + 1];
        ways[0] = 1; // base case

        for (int denom : denoms) {
            for (int amount = 0; amount < ways.length; amount++) {
                if (denom <= amount) {
                    ways[amount] += ways[amount - denom];
                }
            }
        }

        return ways[ways.length - 1];
    }
}
