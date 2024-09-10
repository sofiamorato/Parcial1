package logica;

public class Rey extends Movimientos{
	private int cantidadMovimientos;

	public Rey(int fila, int columna) {
		super(fila, columna);
		
		
	}

	@Override
	public int cantidadMovimientos() {
		if (enElLimite(this.fila, this.columna)) {
			int cantidadMovimientos = 8;}
			else {
				if (fila == 1 &&  columna == 1 || fila == 8 && columna == 8 || fila == 1 && columna == 8 || fila == 8 && columna == 1) {
					cantidadMovimientos = 6;}
				else {
					cantidadMovimientos = 7;}}
				
				
						
		return cantidadMovimientos;
		

	}

}
