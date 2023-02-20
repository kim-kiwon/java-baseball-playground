package ch3.baseball;

import ch3.util.StringConvertor;
import java.util.List;

public class Baseball {
    private AnswerGenerator answerGenerator;
    private InputValidator inputValidator;

    public Baseball(AnswerGenerator answerGenerator, InputValidator inputValidator) {
        this.answerGenerator = answerGenerator;
        this.inputValidator = inputValidator;
    }

    public List<Result> play(String inputStr) {
        List<Integer> input = StringConvertor.toIntegerList(inputStr);
        inputValidator.validate(input);

        List<Integer> answer = answerGenerator.makeAnswer();

        return null;
    }
}
