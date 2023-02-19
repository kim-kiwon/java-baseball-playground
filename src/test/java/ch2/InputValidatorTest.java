package ch2;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputValidatorTest {
    private static InputValidator inputValidator = new InputValidator();

    @Test
    @DisplayName("사용자에게 빈 문자열을 입력받으면 에러를 던진다.")
    void throwErrorWhenEmptyInput() {
        assertThatThrownBy(() -> {
            inputValidator.validate("");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("사용자에게 길이가 3이 넘는 문자열을 입력받으면 에러를 던진다.")
    void throwErrorWhenOverThreeLenghtInput() {
        assertThatThrownBy(() -> {
            inputValidator.validate("1233");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("사용자에게 숫자가 아닌 문자가 포함된 문자열을 입력받으면 에러를 던진다.")
    void throwErrorWhenNotNumericInput() {
        assertThatThrownBy(() -> {
            inputValidator.validate("12a");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("사용자에게 유니크하지 않은 숫자로 이루어진 문자열을 입력받는다면 에러를 던진다.")
    void throwErrorWhenNotUniqueNumericInput() {
        assertThatThrownBy(() -> {
            inputValidator.validate("113");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("사용자에게 1과 10 사이의 숫자가 아닌 입력을 받는다면 에러를 던진다.")
    void throwErrorWhenOneToTenNumericInput() {
        assertThatThrownBy(() -> {
            inputValidator.validate("012");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("사용자에게 정상 입력을 받는다면 통과된다.")
    void returnTrueWhenValidInput() {
        Assertions.assertThat(inputValidator.validate("129")).isTrue();
    }

}