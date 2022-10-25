package NumberBaseball.controller;

import java.util.Arrays;
import java.util.HashSet;

public class InputNumberReceiver {

    private String input;

    public InputNumberReceiver() {
    }

    public void receiveNumber(String userInput) {
        this.input = validate(userInput);
    }


    public String getInput() {
        return input;
    }

    public String validate(String userInput) {
        if (!isNumeric(userInput)) {
            throw new IllegalArgumentException("숫자 세개를 입력해주세요.");
        }

        if (!isNonDuplicated(userInput)) {
            throw new IllegalArgumentException("중복되지 않는 세 수를 입력해주세요.");
        }

        return userInput;
    }


    public boolean isNumeric(String userInput) {
        return userInput.matches("^\\d{3}");
    }

    public boolean isNonDuplicated(String userInput) {
        return (new HashSet<>(Arrays.asList(userInput.split(""))).size() == 3);
    }
}