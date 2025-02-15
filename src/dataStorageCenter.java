public class dataStorageCenter {

	public void DS(Storage storage) {
		@SuppressWarnings("unused")
		StorageKey result = storage.storeData(new StorageRequest());

		StorageKey key = null;
		@SuppressWarnings("unused")
		dataSearch data = storage.retrieveData(key);
		
	}

}