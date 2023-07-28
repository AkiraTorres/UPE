public class BreakPassword extends Thread {
    String password, maxRange;
    Long currentPass;

    public BreakPassword() { }

    public BreakPassword(String min, String max, String password) {
        currentPass = Long.parseLong(min);
        maxRange = max;
        this.password = password;
    }

    public void run() {
        while (currentPass <= Long.parseLong(maxRange)) {
            System.out.println("Testando senha [" + currentPass + "]");
            if (currentPass == Long.parseLong(password)) {
                break;
            }

            currentPass += 1;
        }
        
        System.out.println("Senha Quebrada [" + password + "]");
    }
}
