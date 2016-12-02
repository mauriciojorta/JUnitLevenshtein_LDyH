package LDyH.JUnitLevenshtein;

import static org.junit.Assert.*;

import org.junit.*;


/**
 * Unit test for simple App.
 */
public class AppTest
{
	private DistanciaLevenshtein dist;
	@Before
	public void inicializarCalculador() {
		dist = new  DistanciaLevenshtein();
	}

	@After
	public void cerrarCalculador()
	{
		dist = null;
	}

	@Test
	public void cadenasDiferentes()
	{
		assertEquals(6, dist.DistanciaEntrePalabras("Industry", "Interest"));
		assertEquals(3, dist.DistanciaEntrePalabras("horse", "ros"));
		assertEquals(2, dist.DistanciaEntrePalabras("Hola", "Cala"));
		assertEquals(5, dist.DistanciaEntrePalabras("c", "camino"));
		assertEquals(1, dist.DistanciaEntrePalabras("Minúscula", "minúscula"));
		assertEquals(11, dist.DistanciaEntrePalabras("Desaparecer", ""));
		assertEquals(5, dist.DistanciaEntrePalabras("", "crear"));
	}

    @Test
	public void cadenasEquivalentes()
	{
    	assertEquals(0, dist.DistanciaEntrePalabras("Tres", "Tres"));
    	assertEquals(0, dist.DistanciaEntrePalabras("Calle", "Calle"));
    	assertEquals(0, dist.DistanciaEntrePalabras("clon", "clon"));
    	assertEquals(0, dist.DistanciaEntrePalabras("", ""));

	}





}
