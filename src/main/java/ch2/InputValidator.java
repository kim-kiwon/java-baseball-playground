package ch2;

import java.util.LinkedHashSet;
import java.util.Set;

public class InputValidator {

    public InputValidator() {
    }

    public boolean validate(String userInput) {
        String[] inputArr = userInput.split("");

        validateLength(inputArr);
        validateElements(inputArr);

        return true;
    }

    private void validateLength(String[] inputArr) {
        if(inputArr.length == 0) {
            throw new IllegalArgumentException("사용자 입력이 null 입니다.");
        }

        if(inputArr.length != 3) {
            throw new IllegalArgumentException("3개의 숫자를 입력해주세요");
        }
    }

    private void validateElements(String[] inputArr) {
        Set set = new LinkedHashSet();

        for (String input : inputArr) {
            int num = convertStringToInt(input);
            checkOneToTenNumber(num);

            set.add(num);
        }

        if(set.size() != 3) {
            throw new IllegalArgumentException("서로 유니크한 3개의 숫자를 입력해주세요");
        }
    }

    private int convertStringToInt(String num) {
        try {
            return Integer.parseInt(num);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 값이 입력되었습니다.");
        }
    }

    private void checkOneToTenNumber(int num) {
        if(num < 1 || num >= 10) {
            throw new IllegalArgumentException("입력 숫자는 1과 10 사이어야 합니다.");
        }
    }
}
