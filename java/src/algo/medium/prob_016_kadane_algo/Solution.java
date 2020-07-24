package algo.medium.prob_016_kadane_algo;

public class Solution {

    public static void main(String[] args) {
        System.out.println(kadaneAlgo(new int[] {1,2,3,-5,2,3,4}));
        System.out.println(kadaneAlgo(new int[] {1,2,3,-15,2,3,4}));
    }

    private static int kadaneAlgo(int[] array) {
        int length = array.length;
        int local_max = array[0];
        int global_max = array[0];

        for (int i = 1; i < length; i++) {
            local_max = Math.max(array[i], local_max + array[i]);
            global_max = Math.max(local_max, global_max);
        }

        return global_max;
    }
}
