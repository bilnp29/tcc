package fatorial_Lambda;

import java.util.stream.LongStream;

public class FatorialLambda {
	public long fatLambda(int n) {
		return LongStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);
	}
}
