//import project.annotations.ConceptualAPIPrototype;
import java.util.List;

public class CoordinationEngine {

    private Storage dataStorage;
    private Interface1 computeEngine;

    public CoordinationEngine(Storage dataStorage, Interface1 computeEngine) {
        this.dataStorage = dataStorage;
        this.computeEngine = computeEngine;
    }
   
    public String startComputation(String inputLocation, String outputLocation) {
        try {
            // Read integers from the specified location
            List<Integer> integers = dataStorage.readIntegers(inputLocation);

            // Pass the integers to the compute component and compute the sum of multiples
            for (int x : integers) {
                double sum = computeEngine.computeDouble(x);
                System.out.println("Sum of multiples of " + x + ": " + sum);
            }

            // Write the results to the output location
            //dataStorage.writeResult(outputLocation, "Computation completed successfully.");

            return "Computation completed successfully.";
        } catch (Exception e) {
            return "Error during computation: " + e.getMessage();
        }
    }
}
