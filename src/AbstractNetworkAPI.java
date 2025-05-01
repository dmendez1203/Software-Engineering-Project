import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Provides shared logic for thread handling in NetworkAPI implementations.
 */
public abstract class AbstractNetworkAPI {
    protected static final int MAX_THREADS = 4; // Upper bound for threads
    protected final ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

    public void shutdown() {
        executor.shutdown();
    }
}