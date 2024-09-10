package logica;

public abstract class Movimientos {
	protected int fila;
	protected int columna;
	private boolean respuesta;
	private int cantidadMovimientos;
	
	public double getColumna() {
		return fila;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	public double getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}
	public Movimientos (int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	
		
	}
	public abstract int cantidadMovimientos();
	
	public boolean enElLimite(int fila, int columna) {
		if (fila == 1  || fila == 8 || columna == 1 || columna == 8 ) {
			return false;
		}else {
			return true;}
		

	
	}
	
	

}
