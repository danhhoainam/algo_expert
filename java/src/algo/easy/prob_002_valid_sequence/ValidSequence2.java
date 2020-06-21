package algo.easy.prob_002_valid_sequence;

import java.util.List;

public class ValidSequence2 {

    public static void main(String[] args) {
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10, 9), List.of(1, 6, -1, 10)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10, 9), List.of(5, 1, 22, 25, 6, -1, 8, 10)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10, 9), List.of(5, 1, 22, 6, -1, 8, 10)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10, 9), List.of(22, 25, 6)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10, 9), List.of(1, 6, 10)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10, 9), List.of(5, 1, 22, 10)));
        System.out.println(solution(List.of(5, 1, 22, 25, 6, -1, 8, 10, 9), List.of(5, 1, 22, 777, 10)));
    }

    private static boolean solution(List<Integer> array, List<Integer> sequence) {
        int sequenceIndex = 0;
        for (Integer number : array) {
            if (sequenceIndex == sequence.size()) {
                break;
            }

            if (number.equals(sequence.get(sequenceIndex))) {
                sequenceIndex++;
            }
        }

        return sequenceIndex == sequence.size();
    }
}
