package ch2;

public class StrikeCounter {

    public StrikeCounter() {
    }


    public int compare(String answer, String input) {
        int count = 0;

        for(int i = 0; i < 3; i++) {
            count += getScore(answer.charAt(i), input.charAt(i));
        }

        return count;
    }

    private int getScore(char answerNum, char inputNum) {
        if (answerNum == inputNum) {
            return 1;
        }
        return 0;
    }
}
