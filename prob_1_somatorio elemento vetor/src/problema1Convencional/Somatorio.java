package problema1Convencional;

public class Somatorio {

	int v[] = new int[1000000];

	public int somaTradicional() {
		int soma = 0;
		for (int i = 1; i < v.length; i++) {
			v[i] = i; 				// inicializar vetor
			soma += v[i]; 			// Soma dos elemantos
		}
		return soma;
	}

}
