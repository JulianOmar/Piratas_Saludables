package piratas;

public class Pirata 
{
	private int puntos;
	private PE estado;
	
	public Pirata ()
	{
		estado = new Saludable();
		puntos = 0;
	}
	
	public void beberGrog()
	{
		this.estado = estado.beberGrog();
	}
	
	public void beberJugo()
	{
		this.estado = estado.beberJugo();
	}
	
	public void pirataAtaca(Pirata rival)
	{
		this.puntos = this.estado.atacar(rival);
	}
	
	public PE getEstado(){
		return this.estado;
	}
	
	public int getDefensa() {
		return estado.getDefensa();
	}

	public int getAtaque() {
		return estado.getAtaque();
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}
