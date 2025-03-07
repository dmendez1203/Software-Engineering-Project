import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CoordinationEngineTest {

    private Storage dataStorage;
    private Interface1 computeEngine;
    private CoordinationEngine coordinationEngine;

    void setUp() {
        MockitoAnnotations.openMocks(this);
        coordinationEngine = new CoordinationEngine(dataStorage, computeEngine);
    }
    void testStartComputation() throws Exception {
        when(dataStorage.readIntegers("input.txt")).thenReturn(Arrays.asList(2, 3));
        when(computeEngine.computeDouble(anyInt())).thenReturn(4.0);
        
        String result = coordinationEngine.startComputation("input.txt", "output.txt");
        
        assertEquals("Computation completed successfully.", result);
    }
}