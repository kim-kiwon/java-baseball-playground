package ch3.baseball;

import java.util.ArrayList;
import java.util.Arrays;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputValidatorTest {
    private InputValidator inputValidator;

    @BeforeEach
    void setUp() {
        this.inputValidator = new InputValidator();
    }

    @Test
    void 길이가_0이라면_예외가_던져진다() {
        Assertions.assertThatThrownBy(() -> {
            inputValidator.validate(new ArrayList<>());
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 길이가_3이상_이라면_예외가_던져진다() {
        Assertions.assertThatThrownBy(() -> {
            inputValidator.validate(Arrays.asList(1, 2, 3, 4));
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자_0이_포함되어있다면_예외가_던져진다() {
        Assertions.assertThatThrownBy(() -> {
            inputValidator.validate(Arrays.asList(0, 1, 2));
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
