public class Password {
    private static Boolean broken = false;
    private final String password;

    public Password(String password) {
        this.password = password;
    }

    public synchronized static void setBroken() {
        broken = true;
    }

    public static Boolean isBroken() {
        return broken;
    }

    public String getPassword() {
        return password;
    }
}
