public class Utils {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static String padLeftZeros(long pass, int length) {
        String inputString = Long.toString(pass);

        if (inputString.length() >= length) {
            return inputString;
        }

        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }

    public static String padLeftZeros(long pass) {
        String inputString = Long.toString(pass);

        if (inputString.length() >= 10) {
            return inputString;
        }

        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10 - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }
}