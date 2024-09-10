package logica;

public class Alfil extends Movimientos {
	
		private int cantidadMovimientos;

		public Alfil(int fila, int columna) {
			super(fila, columna);}
	

		public int cantidadMovimientos() {
			if (enElLimite(this.fila, this.columna)) {
				int cantidadMovimientos = 4;}
				else {
					if (fila == 1 &&  columna == 1 || fila == 8 && columna == 8 || fila == 1 && columna == 8 || fila == 8 && columna == 1) {
						cantidadMovimientos = 1;}
					else {
						cantidadMovimientos = 2;}
					
			
				}return cantidadMovimientos;	}}		