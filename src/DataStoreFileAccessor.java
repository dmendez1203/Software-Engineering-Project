import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataStoreFileAccessor {

	public static void main(String[] args){

		try {

			FileReader fr = new FileReader("Input.txt");
			FileWriter fw = new FileWriter("Output.txt");

			String str = "";
			int i;

			while ((i = fr.read()) != -1) {
				str += (char)i;
			}

			System.out.println(str);
			fw.write(str);
			fr.close();
			fw.close();

			System.out.println(
				"File reading and writing both done");
		} catch (IOException e) {
			ExceptionHandler.handleException(e);
			System.out.println("There are some IOException");
		}
	}
}
