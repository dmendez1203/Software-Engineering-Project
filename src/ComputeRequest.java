

public class ComputeRequest {
	private static final char DEFAULT_DELIMITER = ';';
	private final UserInput userInput;
	private final UserOutput userOutput;
	private final char delimiter;
	
	public ComputeRequest(UserInput userInput, UserOutput userOutput) {
		this(userInput, userOutput, DEFAULT_DELIMITER); // default delimiter: ;
	}
	
	public ComputeRequest(UserInput userInput, UserOutput userOutput, char delimiter) {
		this.userInput = userInput;
		this.userOutput = userOutput;
		this.delimiter = delimiter;
	}
	
	public char getDelimiter() {
		return delimiter;
	}

	public UserInput getUserInput() {
		return userInput;
	}

	public UserOutput getUserOutput() {
		return userOutput;
	}

    @Override
    public String toString() {
        return "ComputeRequest [userInput=" + userInput + ", userOutput=" + userOutput + ", delimiter="
                + delimiter + "]";
    }
}
