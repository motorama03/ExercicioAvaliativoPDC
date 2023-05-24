package tabelaHash;
public class ListaEncadeadaSemDicionario {
	
	private Nodo inicio;
	
	//construtor
	public ListaEncadeadaSemDicionario() {
		inicio = null;
	}
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	//public void deletarUltimo()
	// Desenvolver esta aplicação;
	
	public void inserirInicio(String chave, int valor) {
		Nodo novoNodo = new Nodo(chave, valor);
		if(inicio == null) {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
		}else inserirFinal(chave, valor);
	}
	
	public void inserirFinal(String chave, int valor) {
		Nodo novoNodo = new Nodo(chave, valor);
		if(inicio == null)
			inserirInicio(chave, valor);
		
		Nodo aux = inicio;
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoNodo);
	}
	
	public void pegarPenultimo(String chave, int valor) {
		Nodo aux = inicio;
		if(aux.getProx() == null) {
			return;
		}
		else {
			do {
				aux.setProx(aux);
			}while(aux.getProx().getProx() != null);
		}
		
	}
	
	public void mostraLista() {
		if (vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Nodo aux = inicio;
		while (aux != null) {
			System.out.println(aux.getChave() + " : "+ aux.getValor());
			aux = aux.getProx();
		}
		System.out.println();
	}
	
	public void deletaComChave(String chave, int valor) {
		if(vazia())
			return;
		if(inicio.getChave() == chave) {
			inicio = inicio.getProx();
			return;
		}
		Nodo aux = inicio;
		while(aux.getProx() != null) {
			if(aux.getProx().getChave() == chave) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}
	}
	
	// Desenvolver isso tbm pq o arromabado lucas fez merda                                     
	public int buscaValor(int valor) {
		if(vazia()) {
			return -1;
		}
		Nodo aux = inicio;
		int posicao = 0;
		while(aux != null) {
			posicao++;
		}return posicao;
		
	}
	
}

