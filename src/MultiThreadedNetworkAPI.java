import project.annotations.NetworkAPI;

@NetworkAPI
public class MultiThreadedNetworkAPI extends AbstractNetworkAPI { 

    /**
     * Runs a ConceptualAPI call asynchronously using Threads.
     *
     * @param task The task to run
     */
    public void executeConceptualAPICall(Runnable task) {
        Thread thread = new Thread(task); // Create a new thread
        thread.start(); // Start the thread
    }
}