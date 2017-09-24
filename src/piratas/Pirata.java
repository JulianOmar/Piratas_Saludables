package piratas;



/**
 * 
 * Implementaci�n de beber grog y jugo. Implementaci�n de atacar.
 *
 */
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
	
	
	/**
	 * 
	 * @param rival Rival a ser atacado
	 */
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
