package testPiratas;

import org.junit.Assert;
import org.junit.Test;

import piratas.Pirata;

/**
 * Test de pueba del funcionamiento de ataques con saludable, hipersaludable,y
 * con escorbuto ademas de susu combinaciones
 * 
 *
 */
public class TestPirata
{

	@Test
	public void instanciarPiratas()
	{
		Pirata jackSparrow = new Pirata();

		Assert.assertEquals(jackSparrow.getAtaque(), 5);
		Assert.assertEquals(jackSparrow.getDefensa(), 2);
		Assert.assertEquals(jackSparrow.getPuntos(), 0);
	}

	@Test
	public void hipersaludable()
	{
		Pirata jackSparrow = new Pirata();

		jackSparrow.beberJugo();
		Assert.assertEquals(jackSparrow.getAtaque(), 10);
		Assert.assertEquals(jackSparrow.getDefensa(), -2);

		jackSparrow.beberGrog();
		Assert.assertEquals(jackSparrow.getAtaque(), 5);
		Assert.assertEquals(jackSparrow.getDefensa(), 2);
	}

	@Test
	public void escorbuto()
	{
		Pirata jackSparrow = new Pirata();

		jackSparrow.beberGrog();
		jackSparrow.beberGrog();
		jackSparrow.beberGrog();
		Assert.assertEquals(jackSparrow.getAtaque(), 2);
		Assert.assertEquals(jackSparrow.getDefensa(), 0);

		jackSparrow.beberGrog();
		Assert.assertEquals(jackSparrow.getAtaque(), 2);
		Assert.assertEquals(jackSparrow.getDefensa(), 0);
	}

	@Test
	public void ataque()
	{
		Pirata jack = new Pirata();
		Pirata sparrow = new Pirata();

		jack.pirataAtaca(sparrow);
		Assert.assertEquals(jack.getPuntos(), 3);
	}

	@Test
	public void ataqueHiper()
	{
		Pirata jack = new Pirata();
		Pirata sparrow = new Pirata();

		jack.beberJugo();
		jack.pirataAtaca(sparrow);
		Assert.assertEquals(jack.getPuntos(), 8);
	}

	@Test
	public void ataqueEsco()
	{
		Pirata jack = new Pirata();
		Pirata sparrow = new Pirata();

		jack.beberGrog();
		jack.beberGrog();
		jack.beberGrog();
		jack.pirataAtaca(sparrow);
		Assert.assertEquals(jack.getPuntos(), 0);
	}

	@Test
	public void ataqueEscoDefHiper()
	{
		Pirata jack = new Pirata();
		Pirata sparrow = new Pirata();

		jack.beberGrog();
		jack.beberGrog();
		jack.beberGrog();
		sparrow.beberJugo();
		jack.pirataAtaca(sparrow);
		Assert.assertEquals(jack.getPuntos(), 4);
	}

	@Test
	public void escorNormal()
	{
		Pirata jackSparrow = new Pirata();

		jackSparrow.beberGrog();
		jackSparrow.beberGrog();
		jackSparrow.beberGrog();
		jackSparrow.beberJugo();

		Assert.assertEquals(jackSparrow.getAtaque(), 5);
		Assert.assertEquals(jackSparrow.getDefensa(), 2);
	}

	@Test
	public void hiperNormal()
	{
		Pirata jackSparrow = new Pirata();

		jackSparrow.beberJugo();
		jackSparrow.beberGrog();

		Assert.assertEquals(jackSparrow.getAtaque(), 5);
		Assert.assertEquals(jackSparrow.getDefensa(), 2);
	}

}
