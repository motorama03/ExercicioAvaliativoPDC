package listaLineares;

public class Nodo {
	private int dado;
	private int dado2;
	private int dado3;
	private Nodo prox;
	
	//construtor
	public Nodo() {
		
	}
	public Nodo(int dado) {
		this.dado = dado;
		this.prox = null;
	}
	public Nodo(int dado, int dado2, int dado3) {
		this.dado = dado;
		this.dado2 = dado2;
		this.dado3 = dado3;
		this.prox = null;
	}

	public int getDado2() {
		return dado2;
	}
	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}
	public int getDado3() {
		return dado3;
	}
	public void setDado3(int dado3) {
		this.dado3 = dado3;
	}
	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}
}
