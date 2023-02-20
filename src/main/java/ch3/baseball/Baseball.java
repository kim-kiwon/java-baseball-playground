package ch3.baseball;

import ch3.util.StringConvertor;
import java.util.List;

public class Baseball {

    private AnswerGenerator answerGenerator;
    private InputValidator inputValidator;
    private AnswerComparer answerComparer;


    public Baseball(AnswerGenerator answerGenerator, InputValidator inputValidator, AnswerComparer answerComparer) {
        this.answerGenerator = answerGenerator;
        this.inputValidator = inputValidator;
        this.answerComparer = answerComparer;
    }

    public List<Result> play(String inputStr) {
        List<Integer> input = StringConvertor.toIntegerList(inputStr);
        inputValidator.validate(input);

        List<Integer> answer = answerGenerator.makeAnswer();

        List<Result> results = answerComparer.compare(input, answer);
        return null;
    }
}
