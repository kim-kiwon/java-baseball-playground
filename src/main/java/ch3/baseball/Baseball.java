package ch3.baseball;

import ch3.util.StringConvertor;
import java.util.List;

public class Baseball {

    private InputValidator inputValidator;
    private AnswerComparer answerComparer;


    public Baseball(InputValidator inputValidator, AnswerComparer answerComparer) {
        this.inputValidator = inputValidator;
        this.answerComparer = answerComparer;
    }

    public List<Result> play(String inputStr, List<Integer> answer) {
        List<Integer> input = StringConvertor.toIntegerList(inputStr);
        inputValidator.validate(input);

        return answerComparer.compare(input, answer);
    }
}
