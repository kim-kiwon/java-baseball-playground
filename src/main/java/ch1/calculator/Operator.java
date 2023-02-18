package ch1.calculator;

import java.util.Arrays;
import java.util.List;
import java.util.function.LongBinaryOperator;
import java.util.stream.Collectors;

public enum Operator {
    PLUS("+", (a, b) -> a + b),
    MINUS("-", (a, b) -> a - b),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> {
        if(b == 0) {
            throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
        }
        return a / b;
    });

    private String symbol;
    private LongBinaryOperator calculation;

    Operator(String symbol, LongBinaryOperator calculation) {
        this.symbol = symbol;
        this.calculation = calculation;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public LongBinaryOperator getCalculation() {
        return this.calculation;
    }

    public static Operator getOperatorBySymbol(String symbol) {
        return Arrays.stream(values())
            .filter(op -> op.symbol.equals(symbol))
            .findAny()
            .get();
    }

    public static List<String> getAllSymbols() {
        return Arrays.stream(values())
            .map(op -> op.getSymbol())
            .collect(Collectors.toList());
    }
}
