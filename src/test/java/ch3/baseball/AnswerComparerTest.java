package ch3.baseball;

import static ch3.baseball.Result.BALL;
import static ch3.baseball.Result.NOTHING;
import static ch3.baseball.Result.STRIKE;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnswerComparerTest {
    private AnswerComparer answerComparer;

    @BeforeEach
    void setUp() {
        this.answerComparer = new AnswerComparer();
    }

    @Test
    void XXX는_NOTHING_세개_반환한다() {
        List<Result> results = answerComparer.compare(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));

        Assertions.assertThat(results).isEqualTo(Arrays.asList(NOTHING, NOTHING, NOTHING));
    }

    @Test
    void SXX_는_1STRIKE_2NOTHING을_반환한다() {
        List<Result> results = answerComparer.compare(Arrays.asList(1, 2, 3), Arrays.asList(1, 5, 6));

        Assertions.assertThat(results).isEqualTo(Arrays.asList(STRIKE, NOTHING, NOTHING));
    }

    @Test
    void SBX_는_1STRIKE_1BALL_1NOTHING을_반환한다() {
        List<Result> results = answerComparer.compare(Arrays.asList(1, 2, 3), Arrays.asList(1, 9, 2));

        Assertions.assertThat(results).isEqualTo(Arrays.asList(STRIKE, BALL, NOTHING));
    }
}