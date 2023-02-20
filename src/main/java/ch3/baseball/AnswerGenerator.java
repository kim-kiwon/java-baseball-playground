package ch3.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerGenerator {

    public AnswerGenerator() {
    }


    public List<Integer> makeAnswer() {
        List<Integer> answer = new ArrayList<>();

        while(answer.size() < 3) {
            int randomNum = getOneToTenRandomNum();
            addIfNotContain(answer, randomNum);
        }

        return answer;
    }

    private int getOneToTenRandomNum() {
        return new Random().nextInt(9) + 1;
    }

    private void addIfNotContain(List<Integer> answer, int num) {
        if(!answer.contains(num)) {
            answer.add(num);
        }
    }
}
