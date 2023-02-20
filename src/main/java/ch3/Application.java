package ch3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String input = getUserInput();
    }

    private static String getUserInput() {
        System.out.print("숫자를 입력해 주세요 : ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }
}
