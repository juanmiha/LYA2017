package org.lya.sesion09;

public class TiemposCoeficienteBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tiempoTotal;
		double tiempoMedioRec = 0;
		double tiempoMedioPD = 0;

		for (int n = 4; n < 25; n++) {

			CoeficienteBin coeficiente = new CoeficienteBin(2*n,n);
			long tiempoStart = System.nanoTime();
			coeficiente.coefBinomialRecursivo();
			long tiempoEnd = System.nanoTime();
			tiempoTotal = tiempoEnd - tiempoStart;
			tiempoMedioRec = tiempoTotal;

			tiempoStart = System.nanoTime();
			coeficiente.coefBinomialProgDinam();
			tiempoEnd = System.nanoTime();
			tiempoTotal = tiempoEnd - tiempoStart;
			tiempoMedioPD = tiempoTotal;

			System.out.printf("%5d %25.0f %25.0f\n",n,tiempoMedioRec,tiempoMedioPD);

		}
		for (int n = 32; n <= 8192;) {
		CoeficienteBin coeficiente = new CoeficienteBin(2*n,n);
		long tiempoStart = System.nanoTime();
		coeficiente.coefBinomialProgDinam();
		long tiempoEnd = System.nanoTime();
		tiempoTotal = tiempoEnd - tiempoStart;
		tiempoMedioPD = tiempoTotal;
		System.out.printf("%5d %25.0f\n",n,tiempoMedioPD);
		n*=2;
		}
	}

}
