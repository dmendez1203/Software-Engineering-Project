import java.util.Scanner;


import java.util.concurrent.TimeUnit;

import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import protobuf.UserServiceGrpc;
import protobuf.UserServiceGrpc.UserServiceBlockingStub;

public class UserClient { 
    private final UserServiceBlockingStub blockingStub; 

    public UserClient(Channel channel) {
        blockingStub = UserServiceGrpc.newBlockingStub(channel);  // Boilerplate TODO: update to appropriate blocking stub
    }

    // Boilerplate TODO: replace this method with actual client call/response logic
    public void compute() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter your filename (Make sure it is 1 number per line): ");
        protobuf.User.ComputeRequest.Builder request = protobuf.User.ComputeRequest.newBuilder()
        		.setUserInput(protobuf.User.UserInput.newBuilder()
        		.setInputData(scanner.nextLine()));
  
        System.out.println("Enter the output filename: ");
        request.setUserOutput(protobuf.User.UserOutput.newBuilder()
        		.setOutputData(scanner.nextLine()));
        
        System.out.println("Enter a delimiter (default is comma): ");
        String delimiter = scanner.nextLine();
		if (delimiter.isEmpty()) {
			delimiter = ",";
		}
        	
        protobuf.User.ComputeResult result;
        try {
            result = blockingStub.compute(request.build());
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
            scanner.close();
             return;
        }
       switch(result.getStatus()) {
	case FAILURE:
		System.err.println("Error: " + result.getFailureMessage());
		break;
	case INVALID_REQUEST:
		System.err.println("Invalid Request: " + result.getFailureMessage());
		break;
	case SUCCESS:
		System.err.println("Success!");
		break;
	default:
		break;
   
       
       
       }
       scanner.close();
    }

    public static void main(String[] args) throws Exception {
        String target = "localhost:50051";  // Boilerplate TODO: make sure the server/port match the server/port you want to connect to

        ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
                .build();
        try {
            UserClient client = new UserClient(channel); // Boilerplate TODO: update to this class name
            client.compute();
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }

}
