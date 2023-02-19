package ch2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AnswerGeneratorTest {
    private final AnswerGenerator answerGenerator = new AnswerGenerator();

    @Test
    void createAnswer() {
        String answer = answerGenerator.createAnswer();

        String[] answerNums = answer.split("");
        int firstNum = Integer.parseInt(answerNums[0]);
        int secondNum = Integer.parseInt(answerNums[1]);
        int thirdNum = Integer.parseInt(answerNums[2]);

        assertThat(answer).isInstanceOf(String.class);
        assertThat(answerNums.length).isEqualTo(3);
        assertThat(firstNum).isBetween(1, 9);
        assertThat(secondNum).isBetween(1, 9);
        assertThat(thirdNum).isBetween(1, 9);
    }
}