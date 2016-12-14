package LDyH.JUnitLevenshtein;

/**
 * Clase con el método para el cálculo de la distancia de Levenshtein
 * @author Mauricio
 *
 */
public class DistanciaLevenshtein {

	/**
	 * Método que retorna la distacia de Levenshtein entre dos cadenas. Esto es, su grado de
	 * semejanza al representar el número de transformaciones a caracteres que una cadena1 tendría
	 * que hacer para convertirse en una cadena2. Mientras menor sea el valor (siendo 0 el mínimo),
	 * mayor es la semejanza.
	 * @param str1 - cadena1 a comparar
	 * @param str2 - cadena2 a comparar
	 * @return distancia o grado de semejanza entre ambas cadenas
	 */
	public int DistanciaEntrePalabras(String str1, String str2)
	{
		int d[][] = new int[str1.length()+1][str2.length()+1];
		for(int i = 0; i<=str1.length(); i++)
		d[i][0] = i;
		for (int j = 0; j<=str2.length(); j++)
		d[0][j] = j;
		int cost = 0;
		for (int i = 1; i<=str1.length(); i++)
		for (int j =1; j<=str2.length(); j++)
		{
			if (str1.charAt(i-1) == str2.charAt(j-1))
				cost = 0;
			else
				cost = 1;
			d[i][j] = min_value(d[i-1][j]+1, d[i][j-1]+1, d[i-1][j-1]+cost);

		}

		return d[str1.length()][str2.length()];

	}

	/**
	 * Retorna el mínimo número entre tres enteros n1, n2 y n3
	 * @param n1 - Entero1
	 * @param n2 - Entero2
	 * @param n3 - Entero3
	 * @return mínimo de los tres enteros
	 */
	private int min_value(int n1, int n2, int n3)
	{
		return Math.min(Math.min(n1, n2), n3);
	}

}
