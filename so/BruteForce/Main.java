import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int T = 350;
        Password password = new Password("8888888888");
        List<BreakPassword> breakers = new ArrayList<>();

        long start = 0L;
        long end = 9999999999L / T;
        long section = 9999999999L / T;
        for (int i = T; i > 0; i--) {
            breakers.add(new BreakPassword(password, Utils.padLeftZeros(start), Utils.padLeftZeros(end)));
            start = end + 1;
            if (end + section <= 9999999999L) {
                end += section;
            } else {
                end = 9999999999L;
            }
        }

        for (BreakPassword breaker : breakers) {
            breaker.start();
        }
    }
}