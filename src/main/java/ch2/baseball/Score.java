package ch2.baseball;

public class Score {
    private int ball = 0;
    private int strike = 0;

    public void addStrike() {
        this.strike += 1;
    }

    public void addBall() {
        this.ball += 1;
    }

    public int getStrike() {
        return strike;
    }

    public void printScore() {
        if(ball == 0 && strike == 0) {
            System.out.println("낫싱");
        }

        if(strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(strike + "스트라이크 ");
        sb.append(ball + "볼");

        System.out.println(sb);
    }
}
