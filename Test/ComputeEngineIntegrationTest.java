
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions;

public class ComputeEngineIntegrationTest {

    private OutputConfigTestImpl outputConfig;
    private ComputeEngine computeEngine;

    @BeforeEach
    public void setUp() {
        outputConfig = new OutputConfigTestImpl();
        computeEngine = new ComputeEngine();
    }

    @Test
    public void testComputeEngineIntegration() {
        // Initial input
        int[] input = {1, 10, 25};

        // Simulate the compute engine processing the input
        for (int value : input) {
            outputConfig.writeOutput(String.valueOf(value));
        }

        // Validate the output
        List<String> expectedOutput = List.of("1", "10", "25");
        assertEquals(expectedOutput, outputConfig.getOutputData());
    }
}
