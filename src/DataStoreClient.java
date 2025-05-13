import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import protobuf.DataStoreAPIGrpc;
import protobuf.DataStoreAPIGrpc.DataStoreAPIBlockingStub;


public class DataStoreClient implements Storage { 
	
    private final DataStoreAPIBlockingStub blockingStub; 

    public DataStoreClient() {
        String target = "localhost:50052"; 

        ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
                .build();
        blockingStub = DataStoreAPIGrpc.newBlockingStub(channel);
        
   
    }
    

	@Override
	public StorageKey storeData(StorageRequest storageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataSearch retrieveData(StorageKey key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> readIntegers(String inputLocation) {
		// TODO Auto-generated method stub
		List<Integer> integers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputLocation))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String s : line.split("\\s+")) {
                    integers.add(Integer.parseInt(s));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Failed to read integers: " + e.getMessage());
        }
        return integers;
	
	}

	@Override
	public void writeResult(String outputLocation, String result) {
		// TODO Auto-generated method stub
		 try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputLocation))) {
	            writer.write(result);
	        } catch (IOException e) {
	            System.err.println("Failed to write result: " + e.getMessage());
	        }
		
	}

}

