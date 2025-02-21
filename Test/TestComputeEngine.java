import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
 

public class TestComputeEngine{
	
	@Test
	public void testComputation() {
		// Create a mock object of Interface1
		Interface1 mockInterface = Mockito.mock(Interface1.class);

		// Call the method to be tested
		ComputeEngine.Computation(mockInterface);

		// Verify that the computeDouble method was called with the correct argument
		verify(mockInterface).computeDouble(3);
	}
	
	
	@Test
	public test getStatus() {
		// Test method
		String expected = "";
		String actual = ComputeEngine.getStatus();
		assertEquals(expected, actual);
	}
	
	
	
	
	
	
}