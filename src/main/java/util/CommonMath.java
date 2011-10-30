package util;

public class CommonMath {
	public static int factorial(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * CommonMath.factorial(n-1);
		}
	}
}
