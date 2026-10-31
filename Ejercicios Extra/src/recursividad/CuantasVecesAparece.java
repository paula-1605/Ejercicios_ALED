package recursividad;

public class CuantasVecesAparece {
	public int cuantasVeces(int[]lista, int numero) {
		return cuantasVeces(lista, numero, 0);
	}
	
	private int cuantasVeces(int[]lista, int numero, int indice) {
		if(indice==lista.length-1) {
			if(lista[indice]==numero)
				return 1;
			return 0;
		}
		else {
			if(lista[indice]==numero)
				return 1+cuantasVeces(lista,numero,indice++);
			return cuantasVeces(lista,numero,indice++);
		}
	}
}
