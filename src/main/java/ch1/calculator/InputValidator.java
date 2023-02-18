package ch1.calculator;

import java.util.List;

public class InputValidator {

    public InputValidator() {
    }

    public boolean validate(String[] userInput) {
        int inputLength = userInput.length;

        if(inputLength == 0) {
            throw new IllegalArgumentException("계산할 문자열이 null 입니다.");
        }

        if(inputLength % 2 == 0) {
            throw new IllegalArgumentException("정상적인 계산식 형태로 입력해주세요.");
        }

        for(int i = 0; i < inputLength; i+= 2) {
            if(!validateNumber(userInput[i])) {
                throw new IllegalArgumentException("짝수번째에는 숫자가 위치해야합니다.");
            }
        }

        for(int i = 1; i < inputLength; i+= 2) {
            if(!validateOperator(userInput[i])) {
                throw new IllegalArgumentException("홀수번째에는 연산자가 위치해야합니다.");
            }
        }

        return true;
    }

    private boolean validateNumber(String input) {
        try {
            Long.parseLong(input);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean validateOperator(String input) {
        List<String> symbols = Operator.getAllSymbols();

        if (symbols.contains(input)) {
            return true;
        }
        return false;
    }
}
