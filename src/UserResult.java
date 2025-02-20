

public interface UserResult {
ResultStatus getStatus();
	
	public static enum ResultStatus {
		SUCCESS,
		FAILURE;
	}
}