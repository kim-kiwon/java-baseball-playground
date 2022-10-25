package NumberBaseball.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    public void printNumberInsertMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printGameInsertMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public String receiveInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = br.readLine();
        return userInput;
    }
}
