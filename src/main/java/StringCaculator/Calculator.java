package StringCaculator;

import java.util.List;

public class Calculator {

    private final InputReceiver inputReceiver;

    public Calculator(InputReceiver inputReceiver) {
        this.inputReceiver = inputReceiver;
    }

    public int calculate() {
        List<String> inputList = inputReceiver.getInputList();

        int result = getNum(inputList, 0);
        for (int i = 1; i < inputList.size(); i += 2) {
            Operator operator = getOperator(inputList, i);
            int operand = getNum(inputList, i + 1);
            result = operator.operate(result, operand);
        }

        return result;
    }

    public int getNum(List<String> inputList, int index) {
        return Integer.parseInt(inputList.get(index));
    }

    public Operator getOperator(List<String> inputList, int index) {
        return Operator.getOperatorBySymbol(inputList.get(index));
    }
}
