package org.lya.sesion07;

public class Subsecuencia {
	private int [] array;
	private int primer;
	private int ultimo;
	private int suma;

	public Subsecuencia (int numeroElementos) {
		array = new int [numeroElementos];
		for (int i=0; i<numeroElementos; i++) {
			array[i] = (int) (Math.random() * 101 + (-50));
		}
	}

	public Subsecuencia (int []array) {
		this.array = array;
	}

	public int getSuma() {
		return suma;
	}

	public int getPrimer() {
		return primer;
	}

	public int getUltimo() {
		return ultimo;
	}

	public void SubsecuenciaFuerzaBruta() {
		suma = 0;
		primer = 0;
		ultimo = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int sumaAux = 0;
				for (int k = i; k <= j; k++) {
					sumaAux = sumaAux + array[k];
				}
				if (sumaAux > suma) {
					suma = sumaAux;
					primer = i;
					ultimo = j;
				}
			}
		}
	}

	public void SubsecuenciaMejorado() {
		suma = 0;
		primer = 0;
		ultimo = 0;
		for (int i = 0; i < array.length; i++) {
			int sumaAux = 0;
			for (int j = i; j < array.length; j++) {
				sumaAux = sumaAux + array[j];
				if (sumaAux > suma) {
					suma = sumaAux;
					primer = i;
					ultimo = j;
				}
			}
		}
	}

	public void SubsecuenciaLineal() {
		suma = 0;
		primer = 0;
		ultimo = 0;
		int sumaAux = 0;
		int inicio = 0;
		for (int i = 0; i < array.length; i++) {
			sumaAux = sumaAux + array[i];
			if (sumaAux > suma) {
				suma = sumaAux;
				primer = inicio;
				ultimo = i;
			}
			else {
				if (sumaAux < 0) {
					sumaAux = 0;
					inicio = i + 1;
				}
			}
		}
	}

}
