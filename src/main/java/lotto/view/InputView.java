package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static int inputMoney() {
        System.out.println();
        String money = Console.readLine();
        validateMoney(money);
        return Integer.parseInt(money);
    }

    public static void validateMoney(String money) {

    }
}
