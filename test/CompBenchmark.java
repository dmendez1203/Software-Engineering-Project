import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompBenchmark{
	

	
@Test
public void testcomputeDouble() {
	Interface1 interfaceAlpha = new Computation();
	Interface1 interfaceBeta = new Computation2(); 
	int totalTimeOriginal = timing(interfaceAlpha);
	int totalTimeNew = timing(interfaceBeta); 
	System.out.println("Original: " + totalTimeOriginal);
	System.out.println("New: " + totalTimeNew);
	
	Assertions.assertTrue( totalTimeNew/ ((double)totalTimeOriginal) <  0.5);
}

private int timing(Interface1 interfaceAlpha) {
	long startTime = System.currentTimeMillis();
	for (int i = 0; i < 10; i++) {
		interfaceAlpha.computeDouble(100_000_000);
		for(int j=100_000_000; j<100_000_100; j+=1) {
			interfaceAlpha.computeDouble(j);
		} 
	}
	long endTime = System.currentTimeMillis();
	return (int) (endTime - startTime)/10;
}	
}