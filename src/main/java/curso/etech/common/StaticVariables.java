package curso.etech.common;

public class StaticVariables {
    static String accessToken;
    static String email;
    static String id;
    static String device;

    public static String getAccessToken() {
        return accessToken;
    }

    public static void setAccessToken(String accessToken) {
        StaticVariables.accessToken = accessToken;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        StaticVariables.email = email;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        StaticVariables.id = id;
    }

    public static String getDevice() {
        return device;
    }

    public static void setDevice(String device) {
        StaticVariables.device = device;
    }
}
