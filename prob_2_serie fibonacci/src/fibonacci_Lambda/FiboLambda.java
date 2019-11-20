package fibonacci_Lambda;

import java.util.function.IntPredicate;

public class FiboLambda {

	public long fibonacciLambda(int i) {
		IntPredicate predicado = value -> value <= 2;
		if (predicado.test(i)) {
			return 1;
		}
		return fibonacciLambda(i - 1) + fibonacciLambda(i - 2);
	}
}
