package NumberBaseball.controller;

public class InputGameReceiver {

    private String input;

    public InputGameReceiver() {
    }

    public void receiveGameEnd(String userInput) {
        input = gameValidate(userInput);
    }

    public String gameValidate(String userInput) {
        if (!userInput.equals("1") && !userInput.equals("2")) {
            throw new IllegalArgumentException("1 또는 2를 입력해주세요.");
        }
        return userInput;
    }

    public boolean gameEnd() {
        if (input == "2") {
            return true;
        }
        return false;
    }
}
