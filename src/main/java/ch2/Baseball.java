package ch2;

public class Baseball {
    private AnswerGenerator answerGenerator;
    private InputReceiver inputReceiver;
    private AnswerMatcher answerMatcher;

    public Baseball(AnswerGenerator answerGenerator, InputReceiver inputReceiver,
        AnswerMatcher answerMatcher) {
        this.answerGenerator = answerGenerator;
        this.inputReceiver = inputReceiver;
        this.answerMatcher = answerMatcher;
    }

    public void start() {
        String answer = answerGenerator.createAnswer();

        int strikeCount = 0;

        while(strikeCount != 3) {
            String input = inputReceiver.receive(); // InputValidator는 InputReceiver가 의존
            strikeCount = answerMatcher.getGameScore(answer, input);
        }
    }
}
