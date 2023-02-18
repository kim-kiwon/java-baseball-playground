package ch1.calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calculator = new Calculator(new InputSplitter(), new InputValidator());

    @Test
    @DisplayName("수식이 정상적일 경우 계산결과를 응답한다")
    void calculateSuccess() {
        String userInput = "2 + 3 * 4 / 2";
        Long result = calculator.calculate(userInput);
        assertThat(result).isEqualTo(10L);
    }

    @Test
    @DisplayName("0으로 나눌경우 오류가 발생한다")
    void calculateDivideByZero() {
        String userInput = "5 / 0";
        assertThatThrownBy(() -> {
            calculator.calculate(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}