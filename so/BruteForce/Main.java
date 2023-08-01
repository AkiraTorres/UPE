public class Main {
    public static void main(String[] args) {
        int T = 500;

        long start = 0L;
        long end = 9999999999L / T;
        long section = 9999999999L / T;

        for (int i = T; i > 0; i--) {
            new BreakPassword("9999999999", start, end).start();
            start = end + 1;
            if (end + section <= 9999999999L) {
                end += section;
            } else {
                end = 9999999999L;
            } if (i == 2) {
                end = 9999999999L;
            }
        }
    }
}