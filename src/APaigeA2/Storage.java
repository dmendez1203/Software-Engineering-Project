package A2;


public interface Storage {

	StorageKey storeData(StorageRequest storeageRequest);
	
	dataSearch retrieveData(Object key);

}
