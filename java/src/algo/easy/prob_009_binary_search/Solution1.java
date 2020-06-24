package algo.easy.prob_009_binary_search;

/**
 * O(logN) time: we divide the array by 2 each time
 * O(logN) time: we divide the array by 2 each time and use recursive call
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {0, 1, 3, 4, 5, 6, 7}, 3));
    }

    private static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length);
    }

    private static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (right - left) / 2;
        int potentialMatch = array[left + middle];
        if (target > potentialMatch) {
            return binarySearch(array, target, left + middle + 1, right);
        } else if (target < potentialMatch) {
            return binarySearch(array, target, left, left + middle - 1);
        } else {
            return left + middle;
        }
    }
}
