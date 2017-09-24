package piratas;

public abstract class PE 
{
	protected int defensa, ataque;
	
	abstract PE beberJugo();
	abstract PE beberGrog();
	
	public PE (int defensa, int ataque)
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
