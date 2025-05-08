
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* public class CoordinationEngine implements UserInterface {

	private Storage dataStorage;
	private Interface1 computeEngine;

	public CoordinationEngine(Storage dataStorage, Interface1 computeEngine) {
		this.dataStorage = dataStorage;
		this.computeEngine = computeEngine;
	}

	public String startComputation(String inputLocation, String outputLocation) {
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		try {
			// Read integers from the specified location
			List<Integer> integers = dataStorage.readIntegers(inputLocation);

			// Create tasks for each computation
			List<Callable<String>> tasks = integers.stream().map(x -> (Callable<String>) () -> {
				double sum = computeEngine.computeDouble(x);
				return "Sum of multiples of " + x + ": " + sum;
			}).toList();

			// Execute tasks and collect results
			List<Future<String>> results = executor.invokeAll(tasks);

			// Write results to the output location
			StringBuilder output = new StringBuilder();
			for (Future<String> result : results) {
				output.append(result.get()).append("\n");
			}
			dataStorage.writeResult(outputLocation, output.toString());

			return "Computation completed successfully.";
		} catch (Exception e) {
			return "Error during computation: " + e.getMessage();
		} finally {
			executor.shutdown();
		}
	}
	@Override
	public ComputeResult compute(ComputeRequest request) {
		startComputation(request.getUserInput() , request.getUserOutput());
		return null;
	} 
}
*/