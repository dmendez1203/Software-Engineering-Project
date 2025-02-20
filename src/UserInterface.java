

import project.annotations.NetworkAPI;

@NetworkAPI
public interface UserInterface {
	ComputeResult compute(ComputeRequest request);
}