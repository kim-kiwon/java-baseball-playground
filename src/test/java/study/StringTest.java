package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("String.split 테스트 수행.")
    void split() {
        String[] values = "1,2".split(",");
        assertThat(values).containsExactly("1", "2");

        values = "1".split(",");
        assertThat(values).contains("1");
    }

    @Test
    @DisplayName("String.substring 테스트 수행.")
    void substring() {
        String value = "(1,2)".substring(1, 4);
        assertThat(value).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 테스트 수행. 인덱스를 벗어나면 StringIndexOutOfBoundsException 에러를 던진다.")
    void charAt() {
        String value = "abc";
        int index = 1;
        char result = value.charAt(index);
        assertThat(result).isEqualTo('b');

        assertThatThrownBy(() -> "abc".charAt(10))
            .isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
