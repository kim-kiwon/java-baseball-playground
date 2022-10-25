package StringCaculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (a, b) -> a + b),
    MINUS("-", (a, b) -> a - b),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> a / b);

    private final String symbol;
    private final BiFunction expression;

    Operator(String symbol, BiFunction<Integer, Integer, Integer> expression) {
        this.symbol = symbol;
        this.expression = expression;
    }

    public static Operator getOperatorBySymbol(String symbol) {
        return Arrays.stream(values())
            .filter(o -> o.symbol.equals(symbol))
            .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }

    public String getSymbol() {
        return symbol;
    }

    public int operate(int a, int b) {
        return (int) expression.apply(a, b);
    }
}
