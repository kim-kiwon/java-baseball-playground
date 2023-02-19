package ch2;

import java.util.LinkedHashSet;
import java.util.Set;

public class AnswerGenerator {
    public String createAnswer() {
        Set<String> answerSet = new LinkedHashSet<>(); // 순서 보장 위해 LinkedHashSet 사용

        while(answerSet.size() < 3) {
            int randomNum = getOneToTenRandomNum();
            answerSet.add(String.valueOf(randomNum));
        }

        return String.join("", answerSet);
    }

    private int getOneToTenRandomNum() {
        return (int)(Math.random() * 9) + 1;
    }
}
