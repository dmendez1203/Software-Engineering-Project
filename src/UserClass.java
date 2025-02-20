

import project.annotations.NetworkAPIPrototype;

public class UserClass {
	 @NetworkAPIPrototype
		public void prototype(UserInterface apiToCall) {
			
			UserInput userInput = new UserInput() {
			};
			UserOutput userOutput = null;
			ComputeRequest request = new ComputeRequest(userInput, userOutput, ',');
			ComputeResult result = apiToCall.compute(request);
			if (result.getStatus().isSuccess()) {
				System.out.println("Good Job.");
			}
		}
}