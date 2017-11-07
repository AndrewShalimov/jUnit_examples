package example;

public class Utils {

    public static boolean isEmpty(String string) {
        return null == string || string.length() == 0;
    }

    public static boolean isStringNumeric(String inputData) {
        return !isEmpty(inputData) && inputData.matches("[-+]?\\d+(\\.\\d+)?");
    }
}
