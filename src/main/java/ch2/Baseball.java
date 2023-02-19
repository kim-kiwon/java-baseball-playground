package ch2;

public class Baseball {
    private AnswerGenerator answerGenerator;
    private InputReceiver inputReceiver;
    private StrikeCounter strikeCounter;

    public void start() {
        String answer = answerGenerator.createAnswer();

        int strikeCount = 0;

        while(strikeCount != 3) {
            String input = inputReceiver.receive(); // InputValidator는 InputReceiver가 의존
            strikeCount = strikeCounter.compare(answer, input);

            printStrikeCount(strikeCount);
        }
    }

    private void printStrikeCount(int strikeCount) {
        if(strikeCount != 3) {
            System.out.println(strikeCount + "스트라이크");
            return;
        }

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
