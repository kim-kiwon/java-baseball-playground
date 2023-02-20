package ch2.baseball;

public class AnswerMatcher {
    private Score score;

    public AnswerMatcher(Score score) {
        this.score = score;
    }

    public int getGameScore(String answer, String input) {
        this.score = new Score();

        for(int i = 0; i < 3; i++) {
            setStrikeAndBall(answer, input, i);
        }

        score.printScore();

        return score.getStrike();
    }

    private void setStrikeAndBall(String answer, String input, int i) {
        if (isStrike(answer, input, i)) {
            score.addStrike();
            return;
        }

        if (isBall(answer, input, i)) {
            score.addBall();
        }
    }

    private boolean isStrike(String answer, String input, int i) {
        return answer.charAt(i) == input.charAt(i);
    }

    private boolean isBall(String answer, String input, int i) {
        String thisIndexInput = input.substring(i, i+1);

        return answer.contains(thisIndexInput);
    }
}
