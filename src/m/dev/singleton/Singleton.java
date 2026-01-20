package m.dev.singleton;

public class Singleton {
    // Private static variable to hold the single instance
    private static Singleton instance;
    // Private constructor to prevent instantiation
    private Singleton() {}
    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) { // Check if instance is null
            instance = new Singleton(); // Create instance if it is
        }
        return instance; // Return the instance
    }
}
