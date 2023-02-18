package ch1.calculator;

public class Calculator {
    private InputSplitter inputSplitter;
    private InputValidator inputValidator;

    public Calculator(InputSplitter inputSplitter, InputValidator inputValidator) {
        this.inputSplitter = inputSplitter;
        this.inputValidator = inputValidator;
    }

    public Long calculate(String userInput) {
        String[] userInputArr = inputSplitter.split(userInput);
        inputValidator.validate(userInputArr);

        Long result = Long.parseLong(userInputArr[0]);

        for(int i = 1; i < userInputArr.length; i+=2) {
            Operator operator = Operator.getOperatorBySymbol(userInputArr[i]);
            Long operand = Long.parseLong(userInputArr[i + 1]);

            result = operator.getCalculation().applyAsLong(result, operand);
        }

        return result;
    }
}
