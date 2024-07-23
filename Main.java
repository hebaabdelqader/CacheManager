public class Main {
    public static void main(String[] args) {
        // Get the single instance of CacheManager
        CacheManager cacheManager1 = CacheManager.getInstance();
        CacheManager cacheManager2 = CacheManager.getInstance();
        
        // Verify that both instances are actually the same
        System.out.println("cacheManager1 hashcode: " + cacheManager1.hashCode());
        System.out.println("cacheManager2 hashcode: " + cacheManager2.hashCode());
        
        // Use the cache manager
        cacheManager1.put("key1", "value1");
        System.out.println("Cached value for 'key1': " + cacheManager2.get("key1"));
        
        cacheManager1.remove("key1");
        System.out.println("Cached value for 'key1' after removal: " + cacheManager2.get("key1"));
        
        // Clear the cache
        cacheManager1.clear();
    }
}
