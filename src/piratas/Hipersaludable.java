package piratas;

public class Hipersaludable extends PE
{
	public Hipersaludable ()
	{
		super(-2, 10);
	}
	
	@Override
	public PE beberJugo() 
	{
		return this;
	}

	@Override
	public PE beberGrog()
	{
		return new Saludable();
	}
}
