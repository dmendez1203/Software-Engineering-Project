package A2;

public class dataStorageCenter {
	
	public void DS(Storage storage ) {
		StorageKey result = storage.storeData(new StorageRequest());
		
		Object key;
		dataSearch data = storage.retrieveData(key);
		
	}

}
//should be fixed