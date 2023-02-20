package ch3.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringConvertorTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void 문자열을_정수_리스트로_변경한다(int num) {
        List<Integer> integers = StringConvertor.toIntegerList("123");

        assertThat(integers.contains(num));
    }

    @Test
    void 문자열에_정수가_아닌값이_있다면_에러를던진다() {
        Assertions.assertThatThrownBy(() -> {
            StringConvertor.toIntegerList("12a");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}