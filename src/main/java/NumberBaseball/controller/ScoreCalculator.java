package NumberBaseball.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ScoreCalculator {

    private final InputNumberReceiver inputNumberReceiver;
    private Map<Integer, Boolean> answerMap;

    public ScoreCalculator(InputNumberReceiver inputNumberReceiver) {
        this.inputNumberReceiver = inputNumberReceiver;
    }

    public void initGame() {
        makeAnswerMap();
        initScore();
    }

    public void makeAnswerMap() {
        this.answerMap = new HashMap<>();
        while (answerMap.size() < 3) {
            putRandomNum();
        }
    }

    public void initScore() {
        Score.BALL.initCount();
        Score.STRIKE.initCount();
    }

    public void putRandomNum() {
        Random rand = new Random();
        int num = rand.nextInt(10);

        if (!answerMap.containsKey(num)) {
            answerMap.put(num, true);
        }
    }

    public void checkAnswer() {
        String input = inputNumberReceiver.getInput();
        List<String> inputList = Arrays.asList(input.split(""));
        for (String s : inputList) {
            addScore(input);
        }
    }

    public void addScore(String input) {
        if (answerMap.get(Integer.parseInt(input)) != null) {
            Score.STRIKE.addCount();
            return;
        }
        Score.BALL.addCount();
    }
}
