package algo.easy.prob_009_binary_search;

/**
 * O(logN) time: we divide the array by 2 each time
 * O(1) time: we divide the array by 2 each time and use iterative solution
 */
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {0, 1, 3, 4, 5, 6, 7}, 3));
    }

    private static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length);
    }

    private static int binarySearch(int[] array, int target, int left, int right) {
        while (left <= right) {
            int middle = (right - left) / 2;
            int potentialMatch = array[left + middle];
            if (target > potentialMatch) {
                left = left + middle + 1;
            } else if (target < potentialMatch) {
                right = left + middle - 1;
            } else {
                return left + middle;
            }
        }
        return -1;
    }
}
