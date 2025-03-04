//Consolidate this class with the ComputeEngine class, it seems redundant to have two classes that
// do the same thing. Talk to Professor at office hours. 
public class Computation implements Interface1 {

	@Override
	public double computeDouble(int x) {
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
