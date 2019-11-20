package fatorial_Interativo_convencional;

public class FatorialInterativoConvencional {

	public Long fat(int n) {
		long f = 1;
		for (int i = 1; i <= n; i++)
			f *= i;
		return f;
	}
}
