import java.util.Random;

public class BreakPassword extends Thread {
    Password password;
    Long current = 0L, max = 99999999L, passwd;
    Random r;

    public BreakPassword(Password password) {
        this.password = password;
        this.passwd = password.getLonPassword();
        r = new Random();
    }

    public BreakPassword(Password password, Long min, Long max) {
        this.password = password;
        this.passwd = password.getLonPassword();
        r = new Random();
        current = min;
        this.max = max;
    }

    public void run() {
//        try {
//            sleep(r.nextInt(5000));
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(ANSI.GREEN + "[" + getName() + "] " + ANSI.RESET + "start:  " + current + " | end: " + max);
        long start = System.currentTimeMillis();
        while (current < max && !Password.isBroken()) {
            if (current.equals(passwd)) {
                long finish = System.currentTimeMillis();
                long timeElapsed = finish - start;
                System.out.println(ANSI.RED + "[" + getName() + "] " + ANSI.RESET + "Broke the password");
                System.out.println(ANSI.CYAN + "[" + getName() + "] " + ANSI.RESET +"Execution time:" + timeElapsed);
                Password.setBroken();
                return;
            }
            current++;
        }
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
//        System.out.println(ANSI.CYAN + "[" + getName() + "] " + ANSI.RESET +"Execution time:" + timeElapsed);
    }
}
