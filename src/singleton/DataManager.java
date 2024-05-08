package singleton;

import java.util.HashMap;
import java.util.Map;

public class DataManager {
    private static DataManager instance;
    private Map<String, String> dataCache;

    private DataManager() {
        dataCache = new HashMap<>();
    }

    public static synchronized DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public void addToCache(String key, String value) {
        dataCache.put(key, value);
    }

    public String getFromCache(String key) {
        return dataCache.get(key);
    }
}
