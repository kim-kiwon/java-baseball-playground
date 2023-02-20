package ch2;

import ch2.baseball.AnswerGenerator;
import ch2.baseball.AnswerMatcher;
import ch2.baseball.Baseball;
import ch2.baseball.InputReceiver;
import ch2.baseball.InputValidator;
import ch2.baseball.Score;
import java.util.Scanner;

public class Main {
    private static Baseball baseball = new Baseball(new AnswerGenerator(), new InputReceiver(new InputValidator()), new AnswerMatcher(new Score()));

    public static void main(String[] args) {
        int gameButton = 1;

        while(gameButton != 2) {
            baseball.start();
            gameButton = receiveGameButton();
        }
    }

    private static int receiveGameButton() {
        Scanner scanner = new Scanner(System.in);
        String buttonInput = scanner.nextLine();

        validateGameButton(buttonInput);

        return Integer.parseInt(buttonInput);
    }

    private static void validateGameButton(String buttonInput) {
        if(buttonInput != "1" && buttonInput != "2") {
            throw new IllegalArgumentException("1 또는 2를 입력해주세요");
        }
    }
}
