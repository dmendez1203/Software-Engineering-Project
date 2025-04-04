import static org.junit.jupiter.api.Assertions.;

public class TestDataStoreAPI {
    private DataStoreAPI dataStoreAPI;

    public void setUp() {
        dataStoreAPI = new DataStoreAPI();
    }

    @Test
    public void testSaveDataReturnsFalse() {
        boolean result = dataStoreAPI.saveData("sample data");
        assertFalse(result, "saveData() should return false");
    }

    @Test
    public void testFetchDataReturnsEmptyString() {
        String result = dataStoreAPI.fetchData("key");
        assertEquals("", result, "fetchData() should return an empty string");
    }
}