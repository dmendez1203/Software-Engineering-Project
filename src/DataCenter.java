public class DataCenter {

	public void datastorage(Storage storage) {
		@SuppressWarnings("unused")
		StorageKey result = storage.storeData(new StorageRequest());

		StorageKey key = null;
		@SuppressWarnings("unused")
		DataSearch data = storage.retrieveData(key);
		
	}

}
//Should be fixed