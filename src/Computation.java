public class Computation implements Interface1 {

	@Override
	public double computeDouble(int x) {
		//Validate that the input is a positive integer
		if (x < 0) {
			 throw new IllegalArgumentException("Input must be a positive integer.");
		}
		int sum = 0;
		System.out.print("Multiples of " + x + ": ");
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		return sum;
	}
}
