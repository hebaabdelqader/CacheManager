import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    // The single instance of the CacheManager
    private static CacheManager instance;
    private Map<String, Object> cache;

    // Private constructor to prevent instantiation
    private CacheManager() {
        cache = new HashMap<>();
    }

    // Synchronized method to control simultaneous access
    public static synchronized CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        }
        return instance;
    }

    // Method to add an item to the cache
    public void put(String key, Object value) {
        cache.put(key, value);
    }

    // Method to retrieve an item from the cache
    public Object get(String key) {
        return cache.get(key);
    }

    // Method to remove an item from the cache
    public void remove(String key) {
        cache.remove(key);
    }

    // Method to clear the entire cache
    public void clear() {
        cache.clear();
    }
}
