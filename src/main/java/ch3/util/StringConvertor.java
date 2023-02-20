package ch3.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConvertor {
    public static List<Integer> toIntegerList(String str) {
        return Arrays.asList(str.split("")).stream()
            .map(StringConvertor::convertStringToInt)
            .collect(Collectors.toList());
    }

    private static int convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 단어가 입력되었습니다.");
        }
    }
}
