package algo.medium.prob_006_longest_peak;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestPeak(new int[] {1,2,3,3,4,0,10,6,5,-1,-3,2,3}));
    }

    public static int longestPeak(int[] array) {
        if (array.length < 3) return 0;

        int longestPeakLength = 0;
        int i = 1;
        while (i < array.length - 1) {
            boolean isPeak = array[i-1] < array[i] && array[i] > array[i+1];
            if (!isPeak) {
                i++;
                continue;
            }

            int leftIndex = i - 2;
            while (leftIndex >= 0 && array[leftIndex] < array[leftIndex + 1]) {
                leftIndex--;
            }

            int rightIndex = i + 2;
            while (rightIndex < array.length && array[rightIndex - 1] > array[rightIndex]) {
                rightIndex++;
            }

            int currentLongestPeak = rightIndex - leftIndex - 1;
            if (currentLongestPeak > longestPeakLength) {
                longestPeakLength = currentLongestPeak;
            }

            i = rightIndex;
        }
        return longestPeakLength;
    }
}
