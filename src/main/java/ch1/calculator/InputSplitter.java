package ch1.calculator;

public class InputSplitter {

    public InputSplitter() {
    }

    private final String SPLIT_REGEX = " ";

    public String[] split(String userInput) {
        return userInput.split(SPLIT_REGEX);
    }
}
