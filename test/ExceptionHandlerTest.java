import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionHandlerTest {
	
	 @Test
	    public void testComputeDoubleWithMockedExceptionHandler() {
	       
	        ExceptionHandler mockHandler = Mockito.mock(ExceptionHandler.class);
	        
	        Computation computation = new Computation() {
	        	
	            @Override
	            public double computeDouble(int x) {
	            	
	                try {
	                    if (x <= 0) {
	                        throw new IllegalArgumentException("Input must be a positive integer.");
	                    }
	                    return super.computeDouble(x);
	                    
	                } catch (Exception e) {
	                    mockHandler.handleException(e);  
	                    return -1;
	                }
	            }
	        };
	        
	        double result = computation.computeDouble(-1);
	        
	        Mockito.verify(mockHandler).handleException(Mockito.any(IllegalArgumentException.class));
	        assertEquals(-1, result);  
	    }
	}