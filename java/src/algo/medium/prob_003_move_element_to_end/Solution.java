package algo.medium.prob_003_move_element_to_end;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(moveElementToEnd(Arrays.asList(1,2,3,2,2,4,5,6), 2));
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int left = 0;
        int right = array.size() - 1;
        while (left < right) {
            while (left < right && array.get(right) == toMove) right--;
            if (array.get(left) == toMove) swap(array, left, right);
            left++;
        }
        return array;
    }

    public static void swap(List<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}
