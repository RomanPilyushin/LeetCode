/**
 * Created by User on 1/16/2017.
 */
public class Pow {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            if (x == 0) throw new IllegalArgumentException();
            return 1 / myPow(x, -n);
        } else {
            return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
        }
    }

    public double myPow2(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / myPow(x, -n);
        }
        else {
            double results = x * myPow2(x, n - 1);
            return results;
        }
    }
}
