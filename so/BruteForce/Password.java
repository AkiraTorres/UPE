public class Password {
    private static Boolean broken = false;
    private final String strPassword;
    private final Long lonPassword;

    public Password(String strPassword) {
        this.strPassword = strPassword;
        this.lonPassword = Long.parseLong(strPassword);
    }

    public synchronized static void setBroken() {
        broken = true;
    }

    public static Boolean isBroken() {
        return broken;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public Long getLonPassword() {
        return lonPassword;
    }
}
