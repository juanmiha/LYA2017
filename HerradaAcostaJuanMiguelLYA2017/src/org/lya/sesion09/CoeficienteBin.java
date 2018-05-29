package org.lya.sesion09;

public class CoeficienteBin {
	private int n;
	private int k;

	public CoeficienteBin(int n,int k)throws IllegalArgumentException{
		this.n = n;
		this.k = k;
		if(this.n<this.k) throw new IllegalArgumentException("N no puede ser menor que K");
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	public double coefBinomialRecursivo(){
		if( (this.k > this.n) || (this.k < 0) || (this.n == 0)){
			return 0.0;
		}
		return coefBinomialRecursivo(this.n,this.k);
	}
	private long coefBinomialRecursivo(int n, int k){
		if(k == 0 || k == n) return 1;
		if(k > n) return 0;
		if(0<k && k<n)
			return (coefBinomialRecursivo(n-1, k-1)+coefBinomialRecursivo(n-1, k));
		return 0;
	}
	public long coefBinomialProgDinam(){
		int n2,k2;

		long[][] tabla = new long[this.n+1][this.k+1];
		for(n2=0;n2<=this.n;n2++) tabla[n2][0]=1;

		for(k2=1;k2<=this.k;k2++) tabla[0][k2]=0;

		for(int i = 1; i<=n && i<=k; i++){
			tabla[i][i] = 1;
		}

		for(n2=1;n2 < this.n+1;n2++){
			for(k2=1;k2 < this.k+1;k2++)
				tabla[n2][k2] = tabla[n2-1][k2-1] + tabla[n2-1][k2];
		}
		return tabla[this.n][this.k];
	}
}
