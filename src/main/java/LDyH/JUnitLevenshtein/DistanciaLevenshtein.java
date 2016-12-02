package LDyH.JUnitLevenshtein;

public class DistanciaLevenshtein {

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

	private int min_value(int n1, int n2, int n3)
	{
		return Math.min(Math.min(n1, n2), n3);
	}

}
