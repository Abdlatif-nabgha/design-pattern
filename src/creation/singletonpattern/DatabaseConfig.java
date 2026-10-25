package creation.singletonpattern;

import java.util.HashMap;
import java.util.Map;

public class DatabaseConfig {

    private final Map<String, String> settings = new HashMap<>();

    private DatabaseConfig() {
        settings.put("port", "5432");
        settings.put("timeout", "30");
    }

    private static class Holder {
        private static final DatabaseConfig INSTANCE = new DatabaseConfig();
    }

    public static DatabaseConfig getInstance() {
        return Holder.INSTANCE;
    }

    public String get(String key) {
        return settings.get(key);
    }
}
