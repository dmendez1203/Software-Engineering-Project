public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    
    @Override
    public void compute(UserProto.ComputeRequest request, StreamObserver<UserProto.ComputeResult> responseObserver) {
        try {
            // Extract input
            String input = request.getUserInput().getInputData();
            String delimiter = request.hasDelimiter() ? request.getDelimiter() : ";";

            // Do your processing logic here
            // Placeholder logic:
            boolean valid = !input.isEmpty();

            if (!valid) {
                responseObserver.onNext(UserProto.ComputeResult.newBuilder()
                    .setStatus(UserProto.ComputeResult.Status.INVALID_REQUEST)
                    .setFailureMessage("Input was empty")
                    .build());
                responseObserver.onCompleted();
                return;
            }

            // Assume success
            responseObserver.onNext(UserProto.ComputeResult.newBuilder()
                .setStatus(UserProto.ComputeResult.Status.SUCCESS)
                .build());
            responseObserver.onCompleted();

        } catch (Exception e) {
            responseObserver.onNext(UserProto.ComputeResult.newBuilder()
                .setStatus(UserProto.ComputeResult.Status.FAILURE)
                .setFailureMessage("Exception: " + e.getMessage())
                .build());
            responseObserver.onCompleted();
        }
    }
}