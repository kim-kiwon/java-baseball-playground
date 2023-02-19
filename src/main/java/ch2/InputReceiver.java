package ch2;

import java.util.Scanner;

public class InputReceiver {
    private InputValidator inputValidator;

    public InputReceiver(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public String receive() {
        printInputMessage();

        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();

        inputValidator.validate(inputNumber);

        return inputNumber;
    }

    private void printInputMessage() {
        System.out.print("숫자를 입력해 주세요 : ");
    }
}
