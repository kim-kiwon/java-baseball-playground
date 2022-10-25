package NumberBaseball.view;

import NumberBaseball.controller.InputGameReceiver;
import NumberBaseball.controller.InputNumberReceiver;
import NumberBaseball.controller.Score;
import NumberBaseball.controller.ScoreCalculator;
import java.io.IOException;

public class MainExecutor {

    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        InputNumberReceiver inputNumberReceiver = new InputNumberReceiver();
        ScoreCalculator scoreCalculator = new ScoreCalculator(inputNumberReceiver);
        InputGameReceiver inputGameReceiver = new InputGameReceiver();

        boolean gameEnd = false;
        while (!gameEnd) {
            scoreCalculator.initGame();
            while (Score.STRIKE.getCount() != 3) {
                scoreCalculator.initScore();
                inputView.printNumberInsertMessage();
                String userInput = inputView.receiveInput();
                inputNumberReceiver.receiveNumber(userInput);

                scoreCalculator.checkAnswer();
                System.out.println(Score.BALL.getCount() + "볼 " + Score.STRIKE.getCount() + "스트라이크");
            }
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

            inputView.printGameInsertMessage();
            String userInput = inputView.receiveInput();
            inputGameReceiver.receiveGameEnd(userInput);
            gameEnd = inputGameReceiver.gameEnd();
            System.out.println(inputGameReceiver.gameEnd());
            gameEnd = true;
        }
    }
}
