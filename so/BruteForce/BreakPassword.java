public class BreakPassword extends Thread {
    private final String password;
    private long current;
    private final long max, longPass;
    private static Boolean isBroken = false;

    public BreakPassword(String password, long min, long max) {
        this.password = password;
        current = min;
        this.max = max;
        this.longPass = Long.parseLong(password);
    }

    public void run() {
//        System.out.println(Utils.GREEN + "[" + getName() + "] " + current + " | " + max);
        long start = System.currentTimeMillis();
        while (current <= max && !isBroken) {
            if (current == longPass) {
                long finish = System.currentTimeMillis();
                long timeElapsed = finish - start;
                System.out.println(Utils.GREEN + "[" + getName() + "] " + Utils.RESET + "Broke the password -> " + Utils.CYAN + password);
                System.out.println(Utils.GREEN + "[" + getName() + "] " + Utils.RESET +"Execution time:" + timeElapsed);
                isBroken = true;
                return;
            }
            current++;
        }
    }
}
