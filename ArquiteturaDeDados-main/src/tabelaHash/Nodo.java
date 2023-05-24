package tabelaHash;

public class Nodo {
	private String chave;
	private int valor;
	private Nodo prox;
	
	public Nodo (String chave, int valor) {
		this.chave = chave;
		this.valor = valor;
		this.prox = null;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}
	
	

}
