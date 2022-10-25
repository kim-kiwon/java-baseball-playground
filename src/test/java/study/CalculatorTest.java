package study;

import static org.assertj.core.api.Assertions.assertThat;

import StringCaculator.Calculator;
import StringCaculator.InputReceiver;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void calculateTest() {
        InputReceiver inputReceiver = new InputReceiver();
        inputReceiver.receive("100 * 50");

        Calculator calculator = new Calculator(inputReceiver);

        int result = calculator.calculate();

        assertThat(result).isEqualTo(5000);
    }
}
