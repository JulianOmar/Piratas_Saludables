package piratas;

public class Escorbuto extends PE
{
	public Escorbuto()
	{
		super(0, 2);
	}

	@Override
	public PE beberJugo()
	{
		return new Saludable();
	}

	@Override
	public PE beberGrog()
	{
		return this;
	}
}
