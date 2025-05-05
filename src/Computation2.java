
public class Computation2 implements Interface1 {

	@Override
	public double computeDouble(int x) {
		try {
			// Validate that the input is a positive integer
			if (x <= 0) {
				return -1;
			}

			int sum = 0;
			System.out.print("Multiples of " + x + ": ");
			for (int i = 1; i <= Math.sqrt(x); i++) {
				if (x % i == 0) {
					System.out.print(i + " ");
					sum += i;
					if (i != x / i) { // Avoid adding the square root twice
						System.out.print(x / i + " ");
						sum += x / i;
					}
				}
			}
			System.out.println();
			return sum;
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
			return -1; // Return a default value or handle it as needed
		}
	}
}
