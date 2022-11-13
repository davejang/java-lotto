package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import static lotto.utils.InputValidate.validateMoney;

public class InputView {
    public static int inputMoney() {
        System.out.println();
        String money = Console.readLine();
        validateMoney(money);
        return Integer.parseInt(money);
    }
}
