package ch1.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputSplitterTest {
    private final InputSplitter inputSplitter = new InputSplitter();

    @DisplayName("문자열 2 + 3 * 4 / 2 를 배열 변환")
    @ParameterizedTest(name = "${index} {displayName} message={0} 존재 검사")
    @ValueSource(strings = {"2", "+", "3", "*", "4", "/", "2"})
    void convertUserInputToArray(String input) {
        String[] userInputArr = inputSplitter.split("2 + 3 * 4 / 2");

        assertThat(userInputArr).contains(input);
    }
}