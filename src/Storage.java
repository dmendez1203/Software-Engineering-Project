public interface Storage {

	StorageKey storeData(StorageRequest storeageRequest);
	
	DataSearch retrieveData(StorageKey key);

}
