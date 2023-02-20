package ch3.baseball;

import java.util.ArrayList;
import java.util.List;

public class AnswerComparer {

    public AnswerComparer() {
    }

    public List<Result> compare(List<Integer> input, List<Integer> answer) {
        List<Result> results = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            if(isStrike(input, answer, i)) {
                results.add(Result.STRIKE);
                continue;
            }

            if(isBall(input, answer, i)) {
                results.add(Result.BALL);
                continue;
            }

            results.add(Result.NOTHING);
        }

        return results;
    }

    private boolean isStrike(List<Integer> input, List<Integer> answer, int i) {
        return input.get(i) == answer.get(i);
    }

    private boolean isBall(List<Integer> input, List<Integer> answer, int i) {
        return answer.contains(input.get(i));
    }
}
