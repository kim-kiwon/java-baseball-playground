package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splittedStringContainElements() {
        String[] split = "1,2".split(",");
        assertThat(split).contains("1");
        assertThat(split).contains("2");
    }

    @Test
    void splittedStringContainSingleElement() {
        String[] split = "1".split(",");
        assertThat(split).containsExactly("1");
    }

    @Test
    void substringForGetInnerElement() {
        String substring = "(1,2)".substring(1, 4);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    void charAtForGetCharInString() {
        char charAt = "abc".charAt(0);
        assertThat(charAt).isEqualTo('a');
    }

    @Test
    void charAtThrowStringIndexOutOfBoundsException() {
        assertThatThrownBy(() -> {
            "abc".charAt(100);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
