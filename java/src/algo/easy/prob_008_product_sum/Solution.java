package algo.easy.prob_008_product_sum;

import java.util.ArrayList;
import java.util.List;

/**
 * O(N) time: we have to travel all of elements and sub-elements in the list
 * O(D) space: this is the maximum recursive call follow by the depth of the sub arrays
 */
public class Solution {
    public static void main(String[] args) {
        List<Object> test = new ArrayList<>();
        List<Object> test1= new ArrayList<>();
        test.add(1);
        test.add(3);
        test.add(5);
        test.add(2);

        test1.add(9);
        test1.add(-20);
        test.add(test1);
        System.out.println(productSum(test, 1));
    }

    private static Integer productSum(List<Object> array, Integer level) {
        Integer sum = 0;
        for (Object item : array) {
            if (item instanceof ArrayList) {
                sum += productSum((ArrayList<Object>) item, level + 1);
            } else {
                sum += (Integer) item;
            }
        }
        return sum * level;
    }
}
