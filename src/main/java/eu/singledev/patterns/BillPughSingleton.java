package eu.singledev.patterns;

/**
 * The {@code BillPughSingleton} class demonstrates the Singleton Design Pattern
 * using the Bill Pugh Singleton Implementation. This approach ensures lazy initialization
 * and thread safety without requiring synchronized blocks.
 *
 * <p>The Singleton is created only when the {@link #getInstance()} method is called for the first time,
 * utilizing a static nested helper class to hold the instance.</p>
 *
 * <p><b>Advantages:</b></p>
 * <ul>
 *   <li>Thread-safe without synchronization overhead.</li>
 *   <li>Lazy initialization: The instance is created only when needed.</li>
 * </ul>
 */
public class BillPughSingleton {

    /**
     * Private constructor to prevent instantiation of the {@code BillPughSingleton} class.
     */
    private BillPughSingleton() {
        // Prevent external instantiation
    }

    /**
     * Static nested helper class responsible for holding the Singleton instance.
     *
     * <p>This class will not be loaded into memory until it is referenced, ensuring lazy initialization.</p>
     */
    private static class SingletonHelper {
        /**
         * The Singleton instance of {@code BillPughSingleton}.
         */
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    /**
     * Provides access to the Singleton instance of {@code BillPughSingleton}.
     *
     * <p>The instance is created lazily when this method is first called, leveraging
     * the JVM's class loading mechanism to ensure thread safety.</p>
     *
     * @return The Singleton instance of {@code BillPughSingleton}.
     */
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
