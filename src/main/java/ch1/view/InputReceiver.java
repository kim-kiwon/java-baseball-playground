package ch1.view;

import java.util.Scanner;

public class InputReceiver {
    public InputReceiver() {
    }

    public String receiveUserInput() {
        System.out.println("계산을 수행하실 문자열을 입력해주세요");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        return userInput;
    }
}
