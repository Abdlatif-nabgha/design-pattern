package creation.singletonpattern;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    private static volatile AppConfig instance;
    private final Map<String, String> settings = new HashMap<>();

    private AppConfig() {
        settings.put("env", "prod");
        settings.put("port", "8080");
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig(); // 1. cree l'objet, 2. l'assigner a la variable instance, 3. executer le constructeur 
                }
            }
        }
        return instance;
    }

    public String get(String key) {
        return settings.get(key);
    }
}