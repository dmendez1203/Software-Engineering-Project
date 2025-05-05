import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionHandlerTest {
	
	 @Test
	    public void testComputeDoubleWithMockedExceptionHandler() {
	       
	        ExceptionHandler mockHandler = Mockito.mock(ExceptionHandler.class);
	        
	        Computation2 computation = new Computation2(); 
	        
	        double result = computation.computeDouble(-1);
	        
	        Mockito.verify(mockHandler).handleException(Mockito.any(IllegalArgumentException.class));
	        assertEquals(-1, result);  
	    }
	}