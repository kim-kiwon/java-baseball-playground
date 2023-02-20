package ch3.baseball;

import java.util.List;

public class Baseball {
    private AnswerGenerator answerGenerator;

    public Baseball(AnswerGenerator answerGenerator) {
        this.answerGenerator = answerGenerator;
    }

    public List<Result> play(String input) {
        List<Integer> answer = answerGenerator.makeAnswer();
        System.out.println(answer);

        return null;
    }
}
