package ch3;

import ch3.baseball.AnswerGenerator;
import ch3.baseball.Baseball;
import java.util.Scanner;

public class Application {
    private Baseball baseball;

    public static void main(String[] args) {
        String input = getUserInput();

        Baseball baseball = new Baseball(new AnswerGenerator());
        baseball.play(input);
    }

    private static String getUserInput() {
        System.out.print("숫자를 입력해 주세요 : ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }
}
