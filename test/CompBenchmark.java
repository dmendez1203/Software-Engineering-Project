import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompBenchmark{
	

	
@Test
public void testcomputeDouble() {
	Interface1 InterfaceAlpha = new Computation();
	Interface1 InterfaceBeta = new Computation2(); 
	int totalTimeOriginal = timing(InterfaceAlpha);
	int totalTimeNew = timing(InterfaceBeta); 
	System.out.println("Original: " + totalTimeOriginal);
	System.out.println("New: " + totalTimeNew);
	
	Assertions.assertTrue( totalTimeNew/ ((double)totalTimeOriginal) <  0.5);
}

private int timing(Interface1 InterfaceAlpha) {
	long startTime = System.currentTimeMillis();
	for (int i = 0; i < 10; i++) {
		InterfaceAlpha.computeDouble(100_000_000);
		for(int j=100_000_000; j<100_000_100; j+=1) {
			InterfaceAlpha.computeDouble(j);
		} 
	}
	long endTime = System.currentTimeMillis();
	return (int) (endTime - startTime)/10;
}	
}