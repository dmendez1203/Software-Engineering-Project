import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestDataCenter {
	
	@Test
	public void testStorage() {
		
				Storage mockInterface = Mockito.mock(Storage.class);
				
				DataCenter.datastorage(mockInterface);

				verify(mockInterface).storeData(StorageRequest);
				verify(mockInterface).retrieveData(key);
	}
}
