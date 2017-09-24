package piratas;

public class Saludable extends PE
{
	int contadorGrog;
	
	public Saludable() 
	{
		super(2, 5);
	}
	
	@Override
	public PE beberJugo() 
	{
		return new Hipersaludable();
	}

	@Override
	public PE beberGrog() 
	{
		this.contadorGrog++;
		if (this.contadorGrog == 3)
		{
			return new Escorbuto();
		}
		
		return this;
	}

}
