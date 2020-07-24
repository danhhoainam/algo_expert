package algo.medium.single_cycle_check;

/**
 * Ideas: for a single cycle, if we meet the first index then it's false
 *        after we finish the cycle, if we meet the first element then it's the perfect
 *  O(n) time: we have to traverse through all elements
 *  O(1) space: space always be the same
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(singleCycleCheck(new int[] {2, 3, 1, -4, -4, 2}));
        System.out.println(singleCycleCheck(new int[] {1, -1, 1, -1}));
    }

    private static boolean singleCycleCheck(int[] array) {
        int currentIndex = 0;
        int count = 0;

        while (count < array.length) {
            if (count > 0 && currentIndex == 0) return false;
            count++;
            currentIndex = getNextIndex(currentIndex, array);
        }

        return currentIndex == 0;
    }

    private static int getNextIndex(int currentIndex, int[] array) {
        int jump = array[currentIndex];
        int nextIndex = (currentIndex + jump) % array.length;
        return nextIndex >= 0 ? nextIndex : nextIndex + array.length;
    }
}
