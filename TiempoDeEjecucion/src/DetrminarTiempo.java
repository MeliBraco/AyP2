
public class DetrminarTiempo {

	private long tiempoInicial = 0;
	private long tiempoFinal = 0;
	
	public void start(){
		this.tiempoInicial = System.currentTimeMillis();
	}

	public void end() {
		this.tiempoFinal  = System.currentTimeMillis();  
	}

	public long getTimepoInicial() {
		return this.tiempoInicial;
	}
	public long getTiempoFinal() {
		return this.tiempoFinal;
	}

	public long getTotalTime() {
		return this.tiempoFinal - this.tiempoInicial;
	}

}
