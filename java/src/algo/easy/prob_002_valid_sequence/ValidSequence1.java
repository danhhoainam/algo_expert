package algo.easy.prob_002_valid_sequence;

import java.util.List;

/**
 * O(n) time
 * O(1) space
 */
public class ValidSequence1 {

    public static void main(String[] args) {
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(1, 6, -1, 10)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(5, 1, 22, 25, 6, -1, 8, 10)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(5, 1, 22, 6, -1, 8, 10)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(22, 25, 6)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(1, 6, 10)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(5, 1, 22, 10)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(5, 1, 22, 777, 10)));
    }

    private static boolean solution(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;

        while(arrayIndex < array.size() && sequenceIndex < sequence.size()) {
            if (array.get(arrayIndex).equals(sequence.get(sequenceIndex))) {
                sequenceIndex++;
            }
            arrayIndex++;
        }

        return sequenceIndex == sequence.size();
    }
}
