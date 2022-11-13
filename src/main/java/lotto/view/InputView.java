package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.HashSet;

import static lotto.utils.InputValidate.validateMoney;

public class InputView {
    public static int inputMoney() {
        System.out.println();
        String money = Console.readLine();
        validateMoney(money);
        return Integer.parseInt(money);
    }

    public static int inputWinNumber() {
        String winNumber = Console.readLine();
        validateNumber(winNumber);
    }

    public static int inputBonusNumber() {
        String bonusNumber = Console.readLine();
        validateBonus(bonusNumber);
        return Integer.parseInt(bonusNumber);
    }
}
