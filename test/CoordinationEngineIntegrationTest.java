/*
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CoordinationEngineIntegrationTest {

	private Storage mockStorage;
	private ComputeEngine computeEngine;
	private CoordinationEngine coordinationEngine;

	@BeforeEach
	public void setUp() {
		// Mock the Storage dependency
		mockStorage = mock(Storage.class);

		// Use the real ComputeEngine
		computeEngine = new ComputeEngine();

		// Create the CoordinationEngine with mocked Storage and real ComputeEngine
		coordinationEngine = new CoordinationEngine(mockStorage, computeEngine);
	}

	@Test
	public void testCoordinationEngineIntegration() throws Exception {
		// Mock input data
		String inputLocation = "input.txt";
		String outputLocation = "output.txt";
		List<Integer> inputData = List.of(2, 3, 5);

		// Mock Storage behavior
		when(mockStorage.readIntegers(inputLocation)).thenReturn(inputData);

		// Expected output
		String expectedOutput = """
				Sum of multiples of 2: 2.0
				Sum of multiples of 3: 3.0
				Sum of multiples of 5: 5.0
				""";

		// Call the CoordinationEngine
		String result = coordinationEngine.startComputation(inputLocation, outputLocation);

		// Verify the output was written correctly
		verify(mockStorage).writeResult(outputLocation, expectedOutput);

		// Assert the result message
		assertEquals("Computation completed successfully.", result);
	}
}
*/