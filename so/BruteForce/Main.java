import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int T = 5;
        Password password = new Password("8888888888");
        List<BreakPassword> breakers = new ArrayList<>();

        if (T > 1) {
            long start = 0L;
            long end = 9999999999L / T;
            long section = 9999999999L / T;
            for (int i = T; i > 0; i--) {
                breakers.add(new BreakPassword(password, start, end));
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

            try {
                for (BreakPassword breaker : breakers) {
                    breaker.join();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}