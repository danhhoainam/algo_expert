package algo.medium.prob_004_monotonic_arraty;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[] {1,2,3,4,4,5,6,7,8}));
        System.out.println(isMonotonic(new int[] {1,2,3,4,4,5,6,3,8}));
    }

    private static boolean isMonotonic(int[] array) {
        if (array.length <= 2) return true;

        int current = 0;
        int remember = 0;
        for (int i = 1; i < array.length; i++) {
            current = array[i] - array[i-1];
            if (current == 0) continue;
            if (remember == 0 && current != 0) remember = current;
            if ((remember > 0 && current < 0) || (remember < 0 && current > 0)) {
                return false;
            }
        }
        return true;
    }
}
