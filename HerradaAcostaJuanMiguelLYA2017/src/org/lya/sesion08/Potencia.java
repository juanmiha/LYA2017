package org.lya.sesion08;

public class Potencia {
	public int base;
	public int exponente;

	public Potencia(int base,int exp){
		this.base = base;
		this.exponente = exp;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getExponente() {
		return exponente;
	}

	public void setExponente(int exponente) {
		this.exponente = exponente;
	}

	public double exponenFuerzaBruta(){
		double	resultado = 1.0;
		if(exponente == 0){
			return resultado;
		}
		if(exponente == 1){
			return base;
		}
		for (int i = 0;i < this.exponente;i++){
			resultado = resultado*base;
		}
		return resultado;
	}
	public double exponenRecursivoDyV(){
		double resultado = 1.0;
		if(exponente == 0){
			return resultado;
		}
		return (exponenRecursivoDyV(base,exponente));
	}
	private double exponenRecursivoDyV(int base,int exp){
		if(exp == 1){
			return base;
		}
		if(exp%2 == 0)
			return (Math.pow(exponenRecursivoDyV(base,exp/2),2.0));
		else
			return (base*exponenRecursivoDyV(base,exp-1));
	}
}
