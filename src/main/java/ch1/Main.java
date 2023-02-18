package ch1;

import ch1.calculator.Calculator;
import ch1.calculator.InputSplitter;
import ch1.calculator.InputValidator;
import ch1.view.InputReceiver;
import ch1.view.OutputPrinter;

public class Main {

    public static void main(String[] args) {
        InputReceiver inputReceiver = new InputReceiver();
        String userInput = inputReceiver.receiveUserInput();

        Calculator calculator = new Calculator(new InputSplitter(), new InputValidator());
        Long result = calculator.calculate(userInput);

        OutputPrinter outputPrinter = new OutputPrinter();
        outputPrinter.printResult(result);
    }
}
