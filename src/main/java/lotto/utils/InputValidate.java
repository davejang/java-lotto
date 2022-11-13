package lotto.utils;

import java.util.regex.Pattern;

public class InputValidate {
    private static final String DIGIT_REGEX = "\\d+";

    public static void validateMoney(String money) {
        isDigit(money);
        isThousandUnit(Integer.parseInt(money));
    }

    public static void isDigit(String money) {
        if(Pattern.matches(DIGIT_REGEX,money) == false) {
            throw new IllegalArgumentException();
        }
    }

    public static void isThousandUnit(int money) {
        if(money % 1000 != 0) {
            throw new IllegalArgumentException();
        }
    }

}