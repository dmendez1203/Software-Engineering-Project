

import project.annotations.NetworkAPIPrototype;

public class UserClass {
	 @NetworkAPIPrototype
		public void prototype(UserInterface apiToCall) {
			
			UserInput userInput = new UserInput() {

				@Override
				public String getInputLocation() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public String getOutputLocation() {
					// TODO Auto-generated method stub
					return null;
				}
			};
			UserOutput userOutput = null;
			ComputeRequest request = new ComputeRequest(userInput, userOutput, ',');
			ComputeResult result = apiToCall.compute(request);
			if (result.getStatus().isSuccess()) {
				System.out.println("Good Job.");
			}
		}
}