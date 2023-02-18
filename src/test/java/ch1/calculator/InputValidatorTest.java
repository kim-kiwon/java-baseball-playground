package ch1.calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class InputValidatorTest {
    private final InputValidator inputValidator = new InputValidator();

    @DisplayName("userInput 검증 실패 테스트")
    @ParameterizedTest(name = "message={0} 검증 실패")
    @MethodSource("nonValidStringArrayProvider")
    void validateNonValidUserInput(String[] userInputArr) {
        assertThatThrownBy(() -> inputValidator.validate(userInputArr))
            .isInstanceOf(IllegalArgumentException.class);
    }

    // ParameterizedTest 제공 소스에 String[] 가 없어 MethodSource로 구현
    public static Stream<Arguments> nonValidStringArrayProvider() {
        return Stream.of(
            Arguments.of((Object) new String[]{}),
            Arguments.of((Object) new String[]{"3", "+"}),
            Arguments.of((Object) new String[]{"3", "&"}),
            Arguments.of((Object) new String[]{"3", "+", "5", "5"})
        );
    }

    @DisplayName("userInput 검증 성공 테스트")
    @ParameterizedTest(name = "message={0} 검증 성공")
    @MethodSource("validStringArrayProvider")
    void validateValidUserInput(String[] userInputArr) {
        assertThat(inputValidator.validate(userInputArr)).isTrue();
    }

    public static Stream<Arguments> validStringArrayProvider() {
        return Stream.of(
            Arguments.of((Object) new String[]{"7"}),
            Arguments.of((Object) new String[]{"7", "*", "1"}),
            Arguments.of((Object) new String[]{"1", "-", "7"}),
            Arguments.of((Object) new String[]{"3", "/", "5", "+", "2"})
        );
    }


}