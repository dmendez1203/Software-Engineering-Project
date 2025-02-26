import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


 

public class TestComputeEngine{
	
	@Test
	public void testComputation() {
		// Create a mock object of Interface1
		Interface1 mockInterface = new Computation();
		
		
		assertEquals(3, mockInterface.computeDouble(3));
		
		// Verify that the computeDouble method was called with the correct argument
		//verify(mockInterface).computeDouble(3);
	}
	
	
	
	
	
}