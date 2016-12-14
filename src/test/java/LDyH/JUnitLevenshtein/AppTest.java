package LDyH.JUnitLevenshtein;

import static org.junit.Assert.*;

import org.junit.*;


/**
 * Clase de pruebas unitarias para clase de algoritmo de Levenshtein
 */
public class AppTest
{
	private DistanciaLevenshtein dist;
	/**
	 * Inicialización de objeto de clase de algoritmo de Levenshtein antes de cada test
	 */
	@Before
	public void inicializarCalculador() {
		dist = new  DistanciaLevenshtein();
	}

	/**
	 * Terminación de objeto tras la ejecución de cada test
	 */
	@After
	public void cerrarCalculador()
	{
		dist = null;
	}

	/**
	 * Pruebas de cálculo y retorno correcto de distancia o semejanza entre cadenas diferentes
	 */
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

	/**
	 * Pruebas de retorno de distancia nula o semejanza perfecta entre cadenas equivalentes
	 */
    @Test
	public void cadenasEquivalentes()
	{
    	assertEquals(0, dist.DistanciaEntrePalabras("Tres", "Tres"));
    	assertEquals(0, dist.DistanciaEntrePalabras("Calle", "Calle"));
    	assertEquals(0, dist.DistanciaEntrePalabras("clon", "clon"));
    	assertEquals(0, dist.DistanciaEntrePalabras("", ""));

	}





}
