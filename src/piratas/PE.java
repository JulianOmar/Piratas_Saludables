package piratas;

/**
 * Clase padres para beber jugo y grog. Uso de patrones de diseño .
 * Uso de "State" (Estado): Permite que un objeto modifique su comportamiento cada vez que cambie su estado interno.
 * 
 *
 */
public abstract class PE
{
	protected int defensa, ataque;

	abstract PE beberJugo();

	abstract PE beberGrog();

	public PE(int defensa, int ataque)
	{
		this.defensa = defensa;
		this.ataque = ataque;
	}

	public int atacar(Pirata rival)
	{
		return this.ataque - rival.getEstado().getDefensa();
	}

	public int getDefensa()
	{
		return defensa;
	}

	public int getAtaque()
	{
		return ataque;
	}

}
