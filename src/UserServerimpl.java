/*
import io.grpc.stub.StreamObserver;
import protobuf.UserServiceGrpc.UserServiceImplBase;
import protobuf.User;

public class UserServerimpl extends UserServiceImplBase {
	private final UserInterface engine;

	public UserServerimpl(UserInterface engine) {
		this.engine = engine;
	}

	// Local implementation of UserInput
	private static class UserInputImpl implements UserInput {
		private final String inputLocation;
		private final String outputLocation;

		public UserInputImpl(String inputLocation, String outputLocation) {
			this.inputLocation = inputLocation;
			this.outputLocation = outputLocation;
		}

		@Override
		public String getInputLocation() {
			return inputLocation;
		}

		@Override
		public String getOutputLocation() {
			return outputLocation;
		}
	}

	@Override
	public void compute(User.ComputeRequest request, StreamObserver<User.ComputeResult> responseObserver) {
		try {
			UserInput userInput = new UserInputImpl(request.getUserInput(), request.getUserOutput());

			ComputeRequest localRequest = new ComputeRequest(userInput);
			ComputeResult result = engine.compute(localRequest);

			User.ComputeResult grpcResult = User.ComputeResult.newBuilder().setFailureMessage("Computation finished.").build();

			responseObserver.onNext(grpcResult);
			responseObserver.onCompleted();
		} catch (Exception e) {
			responseObserver.onError(e);
		}
	}
}
*/