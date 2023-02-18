package ch1.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class OperatorTest {

    @DisplayName("Symbol로 Operator 가져오기 테스트")
    @ParameterizedTest(name = "symbol={0} 일때 검증 성공")
    @MethodSource("symbolOperatorPairProvider")
    void getOperatorBySymbol(String symbol, Operator op) {
        assertThat(Operator.getOperatorBySymbol(symbol)).isEqualTo(op);
    }

    public static Stream<Arguments> symbolOperatorPairProvider() {
        return Stream.of(
            Arguments.of("+", Operator.PLUS),
            Arguments.of("-", Operator.MINUS),
            Arguments.of("*", Operator.MULTIPLY),
            Arguments.of("/", Operator.DIVIDE)
        );
    }


    @Test
    @DisplayName("모든 Symbol 가져오기 테스트")
    void getAllSymbols() {
        assertThat(Operator.getAllSymbols()).isEqualTo(Arrays.asList("+", "-", "*", "/"));
    }
}