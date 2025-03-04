public class UserAPI {
    private DataStoreAPI dataStoreAPI;

    public UserAPI(DataStoreAPI dataStoreAPI) {
        this.dataStoreAPI = dataStoreAPI;
    }

    public String getUserData() {
        return ""; 
    }

    public boolean saveUserData(String data) {
        return false; 
    }
}