package algo.medium.prob_001_three_number_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * O(n^2) time: we use 2 loops
 * O(n) space: we store in the list result
 */
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(threeNumberSum(new int[]{12,3,1,2,-6,5,-8,6}, 0));
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);

        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    result.add(new Integer[] {array[i], array[left], array[right]});
                    left++;
                    right--;
                } else if(currentSum > targetSum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}
