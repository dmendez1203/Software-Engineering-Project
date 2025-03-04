public class ComputeAPI {
    private UserAPI userAPI;
    private DataStoreAPI dataStoreAPI;

    public ComputeAPI(UserAPI userAPI, DataStoreAPI dataStoreAPI) {
        this.userAPI = userAPI;
        this.dataStoreAPI = dataStoreAPI;
    }

    public int calculateResult() {
        return 0; 
    }
}