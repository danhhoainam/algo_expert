package algo.medium.prob_014_min_number_of_changes;

import java.util.Arrays;

/**
 * O(n) space: store possibilities for each value
 * O(N*D) time: D = denomination, N = elements
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(minNumberOfCoinsForChange(7, new int[] {1,2,5}));
    }

    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] numbers = new int[n + 1];
        Arrays.fill(numbers, Integer.MAX_VALUE);
        numbers[0] = 0; // base case, 0 change = 0 coins

        for (int denom : denoms) {
            for (int amount = 0; amount < numbers.length; amount++) {
                if (denom <= amount) {
                    int current = numbers[amount];
                    int toCompareValue;
                    if (numbers[amount - denom] == Integer.MAX_VALUE) {
                        toCompareValue = Integer.MAX_VALUE;
                    } else {
                        toCompareValue = 1 + numbers[amount - denom];
                    }

                    int newAmount = Math.min(toCompareValue, current);
                    numbers[amount] = newAmount;
                }
            }
        }

        return numbers[n] == Integer.MAX_VALUE ? -1 : numbers[n];
    }
}
