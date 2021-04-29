package contract;

public final class Platform {
    private Platform() {
        throw new IllegalStateException("Variable class");
    }

    public static final String WEB = "web";
    public static final String MOBILE = "mobile";
    public static final String DESKTOP = "desktop";
}
