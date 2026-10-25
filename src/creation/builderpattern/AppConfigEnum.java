package creation.builderpattern;

import java.util.HashMap;
import java.util.Map;

public enum AppConfigEnum {
    INSTANCE;

    private final Map<String, String> settings = new HashMap<>();

    AppConfigEnum() {
        settings.put("env", "prod");
        settings.put("debug", "false");
    }

    public String get(String key) {
        return settings.get(key);
    }
}