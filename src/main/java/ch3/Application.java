package ch3;

import static ch3.baseball.Result.BALL;
import static ch3.baseball.Result.STRIKE;

import ch3.baseball.AnswerComparer;
import ch3.baseball.AnswerGenerator;
import ch3.baseball.Baseball;
import ch3.baseball.InputValidator;
import ch3.baseball.Result;
import java.util.List;
import java.util.Scanner;

public class Application {
    private Baseball baseball;

    public static void main(String[] args) {
        boolean exitFlag = false;

        while(!exitFlag) {
            // 정답 생성
            AnswerGenerator answerGenerator = new AnswerGenerator();
            List<Integer> answer = answerGenerator.makeAnswer();

            // 3개의 숫자 모두 맞혔는지
            boolean isThreeStrike = false;
            while(!isThreeStrike) {
                String inputStr = getUserInput();
                Baseball baseball = new Baseball(new InputValidator(), new AnswerComparer());
                List<Result> results = baseball.play(inputStr, answer);
                printResult(results);

                isThreeStrike = isThreeStrike(results);
            }

            String exitInput = getExitInput();
            exitFlag = isExit(exitInput);
        }

    }

    private static String getUserInput() {
        System.out.print("숫자를 입력해 주세요 : ");

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        return inputStr;
    }

    private static void printResult(List<Result> results) {
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < 3; i++) {
            Result result = results.get(i);

            if(result == STRIKE) {
                strikeCount++;
            }

            if(result == BALL) {
                ballCount++;
            }
        }

        if(strikeCount == 0 && ballCount == 0) {
            System.out.println("야웃");
            return;
        }

        if(strikeCount == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다 게임 종료");
            return;
        }

        System.out.println(strikeCount + "스트라이크 " + ballCount + "볼");
    }

    private static boolean isThreeStrike(List<Result> results) {
        return results.stream().allMatch((e) -> e.equals(STRIKE));
    }

    private static String getExitInput() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        return inputStr;
    }

    private static boolean isExit(String exitInput) {
        System.out.println(exitInput);
        if(exitInput.equals("1")) {
            return false;
        }

        if(exitInput.equals("2")) {
            return true;
        }

        throw new IllegalArgumentException("1 또는 2를 입력해주세요.");
    }
}
