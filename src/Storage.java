import java.util.List;

public interface Storage {

	StorageKey storeData(StorageRequest storeageRequest);
	
	DataSearch retrieveData(StorageKey key);
	
	List<Integer> readIntegers(String inputLocation);
	
	void writeResult(String outputLocation, String result);
}
