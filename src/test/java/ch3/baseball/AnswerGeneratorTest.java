package ch3.baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AnswerGeneratorTest {
    private AnswerGenerator answerGenerator;

    @BeforeEach
    void setUp() {
        answerGenerator = new AnswerGenerator();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    void 일_십_사이의_랜덤_숫자_리스트를_생성한다(int index) {
        List<Integer> answer = answerGenerator.makeAnswer();

        assertThat(answer.get(index)).isBetween(1, 9);
    }
}
