package org.lya.sesion06;

public class MatrizEnterosCuadrada {
	private int[][] matriz;

	public MatrizEnterosCuadrada(int numeroFilasCol){
		matriz = new int [numeroFilasCol][numeroFilasCol];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*51);
			}
		}
	}
	public MatrizEnterosCuadrada(int[][] m){
		matriz = new int [m.length][m[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				this.matriz[i][j] = m[i][j];
			}
		}
	}
	public void insercion(int[] array){
		for (int  i = 1; i <array.length;i++){
			int aux=array[i];
			int j;
			for(j=i-1;(j >= 0) && (aux < array[j]);j--){
				array[j + 1] = array[j];
			}
			array[j + 1] = aux;
		}
	}
	public int[][] matrizOrdenadaPorFilas(){
		for(int i = 0; i < matriz.length; i++){
			int[] p = new int[matriz[0].length];
			for(int j = 0; j < matriz[0].length; j++){
				p[j] = matriz[i][j];
			}
			insercion(p);
			for(int j = 0; j < matriz[0].length; j++){
				matriz[i][j] = p[j];
			}
		}
		return matriz;
	}
	public int[][] getMatriz() {
		return matriz;
	}
	public  String muestraMatriz() {
		String salida = "Matriz:\n";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j != matriz[i].length - 1)
					salida += matriz[i][j] + "\t";
				else
					salida += matriz[i][j];
			}
			if (i != matriz.length - 1)
				salida += "\n";
		}
		return salida;
	}


}
