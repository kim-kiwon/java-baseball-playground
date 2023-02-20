package ch3.baseball;

import java.util.List;

public class InputValidator {
    public InputValidator() {
    }

    public void validate(List<Integer> input) {
        validateInput(input);
    }

    private void validateInput(List<Integer> input) {
        if(input.size() == 0) {
            throw new IllegalArgumentException("Input의 길이가 0 입니다.");
        }

        if(input.size() > 3) {
            throw new IllegalArgumentException("3개가 넘는 단어가 입력되었습니다.");
        }

        if(!input.contains(0)) {
            throw new IllegalArgumentException("0은 포함할 수 없습니다.");
        }
    }
}
