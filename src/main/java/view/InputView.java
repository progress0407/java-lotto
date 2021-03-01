package view;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String RECEIVE_PRICE_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String RECEIVE_WINNING_NUMBERS_MESSAGE = "지난 당첨 번호를 입력해 주세요.";
    private static final String RECEIVE_BONUS_NUMBER_MESSAGE = "보너스 볼을 입력해 주세요.";
    private static final String RECEIVE_MANUAL_TICKET_MESSAGE = "수동으로 구매할 로또 수를 입력해 주세요.";
    private static final String RECEIVE_MANUAL_TICKET_NUMBER_MESSAGE = "수동으로 구매할 번호를 입력해 주세요.";
    private static final String NULL_ERROR = "null 이 입력되었습니다.";
    private static final String NOT_INT_ERROR = "올바른 입력이 아닙니다.";

    public static int receiveMoney() {
        return receiveNumber(RECEIVE_PRICE_MESSAGE);
    }

    public static List<String> receiveManualTickets() {
        int numberOfTickets = receiveNumber(RECEIVE_MANUAL_TICKET_MESSAGE);
        System.out.println(RECEIVE_MANUAL_TICKET_NUMBER_MESSAGE);
        return Stream.generate(InputView::receiveInputNotNull)
            .limit(numberOfTickets)
            .collect(Collectors.toList());
    }

    public static String receiveWinningNumbers() {
        System.out.println(RECEIVE_WINNING_NUMBERS_MESSAGE);
        return receiveInputNotNull();
    }

    public static int receiveBonusNumber() {
        return receiveNumber(RECEIVE_BONUS_NUMBER_MESSAGE);
    }

    private static int receiveNumber(final String message) {
        try {
            System.out.println(message);
            return Integer.parseInt(SCANNER.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException(NOT_INT_ERROR);
        }
    }

    private static String receiveInputNotNull() {
        String userInput = SCANNER.nextLine().trim();
        validateNull(userInput);
        return userInput;
    }

    private static void validateNull(final String userInput) {
        if (userInput == null) {
            throw new IllegalArgumentException(NULL_ERROR);
        }
    }
}