package org.lya.sesion07;

public class TiemposSubsecuencia {
	public static void main (String[] args){
		int n=8192;
		long temp=0;
		long media;
		Subsecuencia a= new Subsecuencia(n);
		long tiempoInicio=0;
		long tiempoFinal=0;
		long[] arrayTiempos = new long[10];
			for (int i=0;i<10;i++){
				tiempoInicio=System.nanoTime();
				a.SubsecuenciaFuerzaBruta();
				tiempoFinal=System.nanoTime();
				arrayTiempos[i]=tiempoFinal-tiempoInicio;
			}
			for (int i = 0; i < arrayTiempos.length; i++) {
				temp+=arrayTiempos[i];
			}
			media = temp/10;
			System.out.println("Tiempo medio utiliando Fuerza Bruta es: "+media+" ns");

			for (int i=0;i<10;i++){
				tiempoInicio=System.nanoTime();
				a.SubsecuenciaMejorado();
				tiempoFinal=System.nanoTime();
				arrayTiempos[i]=tiempoFinal-tiempoInicio;
			}
			for (int i = 0; i < arrayTiempos.length; i++) {
				temp+=arrayTiempos[i];
			}
			media = temp/10;
			System.out.println("Tiempo medio utilizando Mejorado es: "+media+" ns");

			for (int i=0;i<10;i++){
				tiempoInicio=System.nanoTime();
				a.SubsecuenciaLineal();
				tiempoFinal=System.nanoTime();
				arrayTiempos[i]=tiempoFinal-tiempoInicio;
			}
			for (int i = 0; i < arrayTiempos.length; i++) {
				temp+=arrayTiempos[i];
			}
			media = temp/10;
			System.out.println("Tiempo medio utilizando Lineal es: "+media+" ns");
		}
}