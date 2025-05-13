/* 
public interface AsyncService {

    
    default void compute(protobuf.User.ComputeRequest request,
        io.grpc.stub.StreamObserver<protobuf.User.ComputeResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getComputeMethod(), responseObserver);
    }
  }

  
    Base class for the server implementation of the service UserService.
   
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }
*/

import protobuf.DataStoreAPIGrpc.DataStoreAPIImplBase;;

public class DataStoreServerimpl extends DataStoreAPIImplBase{

	@Override
	public void saveData(protobuf.DataStore.SaveDataRequest request,
			io.grpc.stub.StreamObserver<protobuf.DataStore.SaveDataResponse> responseObserver) {

	}

	public void fetchData(protobuf.DataStore.FetchDataRequest request,
			io.grpc.stub.StreamObserver<protobuf.DataStore.FetchDataResponse> responseObserver) {

	}
}


