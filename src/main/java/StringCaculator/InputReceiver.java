package StringCaculator;

import java.util.Arrays;
import java.util.List;

public class InputReceiver {

    private List<String> inputList;

    public void receive(String inputString) {
        this.inputList = validate(getSplitList(inputString));
    }

    private List<String> getSplitList(String inputString) {
        return Arrays.asList(inputString.split(" "));
    }

    private List<String> validate(List<String> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            if (checkNonValidNum(inputList, i)) {
                throw new IllegalArgumentException("올바른 숫자가 입력되지 않았습니다.");
            }

            if (checkNonValidOperator(inputList, i)) {
                throw new IllegalArgumentException("올바른 연산자가 입력되지 않았습니다.");
            }
        }
        return inputList;
    }

    private boolean checkNonValidNum(List<String> inputList, int index) {
        return index % 2 == 0 && !inputList.get(index).matches("[0-9]+");
    }

    private boolean checkNonValidOperator(List<String> inputList, int index) {
        return index % 2 == 1 && !inputList.get(index).matches("^[+\\-/*%]{1}");
    }

    public List<String> getInputList() {
        return inputList;
    }
}
