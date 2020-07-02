package algo.medium.prob_001_three_number_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * O(n^3) time: 3 loops -> O(n^3); sorting: O(n*logn) -> O(N^3)
 * O(n) space: store result in List<Integer[]> result
 */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(threeNumberSum(new int[]{12,3,1,2,-6,5,-8,6}, 0));
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == targetSum) {
                        Integer[] newArr = new Integer[]{array[i], array[j], array[k]};
                        result.add(newArr);
                    }
                }
            }
        }
        return result;
    }
}
