public class BreakPassword extends Thread {
    Password password;
    String current, max;
    long currentLong;

    public BreakPassword(Password password, String min, String max) {
        this.password = password;
        current = min;
        this.max = max;
    }

    public void run() {
        long start = System.currentTimeMillis();
        while (!current.equals(max) && !Password.isBroken()) {
            if (current.equals(password.getPassword())) {
                long finish = System.currentTimeMillis();
                long timeElapsed = finish - start;
                System.out.println(Utils.GREEN + "[" + getName() + "] " + Utils.RESET + "Broke the password -> " + Utils.CYAN + current);
                System.out.println(Utils.GREEN + "[" + getName() + "] " + Utils.RESET +"Execution time:" + timeElapsed);
                Password.setBroken();
                return;
            }
            long currentLong = Long.parseLong(current);
            currentLong++;
            current = Utils.padLeftZeros(currentLong);
        }
    }
}
