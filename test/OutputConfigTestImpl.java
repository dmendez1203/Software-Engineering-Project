import java.util.ArrayList;
import java.util.List;
//this will implement the data store API 
public class OutputConfigTestImpl {
    private List<String> outputData;

    public OutputConfigTestImpl() {
        this.outputData = new ArrayList<>();
    }

    public void writeOutput(String data) {
        outputData.add(data);
    }

    public List<String> getOutputData() {
        return outputData;
    }
}