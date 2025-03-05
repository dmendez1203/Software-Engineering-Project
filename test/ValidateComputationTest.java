
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateComputationTest {

	@Test
	public void testComputeDoubleWithValidInput() {
		Computation computation = new Computation();
		double result = computation.computeDouble(6);
		assertEquals(12, result, "The sum of multiples of 6 should be 12.");
	}

	@Test
	public void testComputeDoubleWithZeroInput() {
		Computation computation = new Computation();
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			computation.computeDouble(0);
		});
		assertEquals("Input must be a positive integer.", exception.getMessage());
	}

	@Test
	public void testComputeDoubleWithNegativeInput() {
		Computation computation = new Computation();
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			computation.computeDouble(-5);
		});
		assertEquals("Input must be a positive integer.", exception.getMessage());
	}
}
