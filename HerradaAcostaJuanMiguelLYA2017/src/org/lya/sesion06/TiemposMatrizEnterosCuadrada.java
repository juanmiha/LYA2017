package org.lya.sesion06;

public class TiemposMatrizEnterosCuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9000;
		long[] arrayTiempos = new long[10];
		long media;
		long temp= 0;
		for(int i = 0; i<10;i++){
			MatrizEnterosCuadrada matriz = new MatrizEnterosCuadrada(n);
			long startTime = System.nanoTime();
			matriz.matrizOrdenadaPorFilas();
			long endTime = System.nanoTime();

			arrayTiempos[i]=endTime-startTime;
		}
		for (int i = 0; i < arrayTiempos.length; i++) {
			temp+=arrayTiempos[i];
			System.out.println(arrayTiempos[i]);
		}
		media = temp/10;
		System.out.println(media);
	}

}
