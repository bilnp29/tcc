package fibonnaci_convencional;

public class FiboConvencional {

	public long fibonacci(int i) {
		if (i <= 2) {
			return 1;
		}
		return fibonacci(i - 1) + fibonacci(i - 2);
	}
}
