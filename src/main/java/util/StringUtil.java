package util;

import messages.ErrorMessages;

public class StringUtil {

    public static double parseDouble(String number){
        try{
            return Double.parseDouble(number);
        } catch (NumberFormatException ex){
            throw new IllegalArgumentException(ErrorMessages.INVALID_NUMBER_INPUT);
        }
    }
}
