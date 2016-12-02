package LDyH.JUnitLevenshtein;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        DistanciaLevenshtein dist = new DistanciaLevenshtein();
        System.out.println(dist.DistanciaEntrePalabras("horse", "ros"));
        System.out.println(dist.DistanciaEntrePalabras("industry", "interest"));
    }
}
