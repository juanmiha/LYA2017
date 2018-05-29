package org.lya.sesion08;


public class TiemposPotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arrayTiempos = new long[10];
		int base = 1;
		int exp = 16384;
		long temp = 0;
		Potencia potencia = new Potencia(base, exp);
		System.out.println("Fuerza Bruta en base " + base + " y exponente " + exp);
		for (int i = 0; i < arrayTiempos.length; i++) {
			long startTime = System.nanoTime();
			potencia.exponenFuerzaBruta();
			long endTime = System.nanoTime();
			arrayTiempos[i]=endTime-startTime;
		}
		for(int i = 0; i<10;i++){
			temp+=arrayTiempos[i];
		}
		System.out.println(temp/10);
		temp = 0;
		System.out.println("Recursivo con base " + base + " y exponente " + exp);
		for (int i = 0; i < arrayTiempos.length; i++) {
			long startTime = System.nanoTime();
			potencia.exponenRecursivoDyV();
			long endTime = System.nanoTime();
			arrayTiempos[i]=endTime-startTime;
		}
		for(int i = 0; i<10;i++){
			temp+=arrayTiempos[i];
		}
		System.out.println(temp/10);
	}

}
