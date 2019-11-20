package problema1Lambdas;

import java.util.stream.IntStream;

public class SomatorioLambda {
	int v[] = new int[1000000];
	
	public int somarElementosLambdas() {
		for (int i = 1; i < v.length; i++) {
			v[i] = i;
		}		
		return IntStream.of(v).reduce(0, (x,y) -> x + y);		
	}
}
