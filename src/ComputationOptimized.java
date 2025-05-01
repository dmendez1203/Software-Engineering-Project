public class ComputationOptimized implements Interface1 {

    @Override
    public double computeDouble(int x) {
        try {
            if (x <= 0) {
                return -1;
            }

            int sum = 0;
            int sqrt = (int) Math.sqrt(x);

            for (int i = 1; i <= sqrt; i++) {
                if (x % i == 0) {
                    int pair = x / i;
                    if (i == pair) {
                        sum += i;
                    } else {
                        sum += i + pair;
                    }
                }
            }

            return sum;
        } catch (Exception e) {
            ExceptionHandler.handleException(e);
            return -1;
        }
    }
}