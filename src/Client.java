import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// Set up gRPC channel
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		// Create a stub for the ComputeService
		

		Scanner scanner = new Scanner(System.in);

		try {
			// Prompt user for input type
			System.out.println("Enter 1 to upload a file or 2 to type a list of numbers:");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			String inputData = "";
			if (choice == 1) {
				// File upload
				System.out.println("Enter the file path:");
				String filePath = scanner.nextLine();
				File file = new File(filePath);
				if (!file.exists()) {
					System.out.println("File not found. Exiting.");
					return;
				}
				inputData = new String(Files.readAllBytes(file.toPath()));
			} else if (choice == 2) {
				// Typed-in list of numbers
				System.out.println("Enter a comma-separated list of numbers:");
				inputData = scanner.nextLine();
			} else {
				System.out.println("Invalid choice. Exiting.");
				return;
			}

			// Prompt for output file
			System.out.println("Enter the output file path:");
			String outputFilePath = scanner.nextLine();

			// Optional: Prompt for delimiter
			System.out.println("Enter a delimiter for the output file (default is comma):");
			String delimiter = scanner.nextLine();
			if (delimiter.isEmpty()) {
				delimiter = ",";
			}

			// Create a request
			
			// Call the compute service
			

			// Write the result to the output file
		

			// Notify the user of success
			System.out.println("Task completed successfully. Output written to " + outputFilePath);

		} catch (Exception e) {
			// Notify the user of failure
			System.err.println("An error occurred: " + e.getMessage());
		} finally {
			// Clean up resources
			channel.shutdown();
			scanner.close();
		}
	}
}
