package creation.singletonpattern;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    private static volatile AppConfig instance;
    private final Map<String, String> settings = new HashMap<>();

    private AppConfig() {
        settings.put("env", "prod");
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    public String get(String key) {
        return settings.get(key);
    }
}