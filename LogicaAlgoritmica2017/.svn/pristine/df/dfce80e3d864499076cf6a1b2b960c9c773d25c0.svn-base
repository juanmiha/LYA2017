package org.lya.tema03;

public class Potencia2N {

	public static double potenciaLineal(int x, int n){
		if (n == 0) 
			return 1.0;
		double m = x;
		for(int i=1; i<=n; i++){
			m = m * m;
		}
		return m;
	}
	public static double potenciaExponencial(int x, int n){
		if (n == 0) 
			return 1.0;
		double m = 1;
		for(int i=1; i<= (int)Math.pow(2, n); i++){
			m = m * x;
		}
		return m;
	}
	public static void main(String[] args) {

        int N= 30;
		int X= 1;
		long startTime = System.currentTimeMillis();
		double pot = potenciaLineal(X,N);
		long endTime = System.currentTimeMillis(); 
		System.out.println("AlgLineal: x="+X+" n=" +N +" = " + pot  +" calculado en " + (endTime-startTime) +" milisegundos");
		
		startTime = System.currentTimeMillis();
		pot = potenciaExponencial(X,N);
		endTime = System.currentTimeMillis(); 
		System.out.println("AlgExpon: x="+X+" n=" +N +"= " + pot  +" calculado en " + (endTime-startTime) +" milisegundos");

	}

}
