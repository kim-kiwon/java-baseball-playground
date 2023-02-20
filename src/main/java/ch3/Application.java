package ch3;

import ch3.baseball.AnswerComparer;
import ch3.baseball.AnswerGenerator;
import ch3.baseball.Baseball;
import ch3.baseball.InputValidator;
import java.util.Scanner;

public class Application {
    private Baseball baseball;

    public static void main(String[] args) {
        String inputStr = getUserInput();

        Baseball baseball = new Baseball(new AnswerGenerator(), new InputValidator(), new AnswerComparer());
        baseball.play(inputStr);
    }

    private static String getUserInput() {
        System.out.print("숫자를 입력해 주세요 : ");

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        return inputStr;
    }
}
