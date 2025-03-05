import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
import org.mockito.Mockito;

public class TestUserAPI {
    private UserAPI userAPI;
    private DataStoreAPI mockDataStoreAPI;

    public void setUp() {
        mockDataStoreAPI = Mockito.mock(DataStoreAPI.class);
        userAPI = new UserAPI(mockDataStoreAPI);
    }

    @Test
    public void testGetUserDataReturnsEmptyString() {
        String result = userAPI.getUserData();
        assertEquals("", result, "getUserData() should return an empty string");
    }

    @Test
    public void testSaveUserDataReturnsFalse() {
        boolean result = userAPI.saveUserData("sample data");
        assertFalse(result, "saveUserData() should return false");
    }
}