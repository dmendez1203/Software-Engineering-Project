import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class TestComputeEngine{
	
	@Test
	public void testComputation() {
		// Create a mock object of Interface1
		Interface1 mockInterface = new Computation2();
		
		
		assertEquals(4, mockInterface.computeDouble(3));
		
	}
	
	@Test
	public void zeroCase() {
		Interface1 mockInterface2 = new Computation2();
		assertEquals(-1, mockInterface2.computeDouble(0));
			
	}
	@Test
	public void squareCase() {
		Interface1 mockInterface3 = new Computation2();
		assertEquals(31, mockInterface3.computeDouble((int) Math.pow(2,4)));
	}
	
	@Test
	public void negativeCase() {
		Interface1 mockInterface4 = new Computation2();
        assertEquals(-1, mockInterface4.computeDouble(-1));
    }
	}