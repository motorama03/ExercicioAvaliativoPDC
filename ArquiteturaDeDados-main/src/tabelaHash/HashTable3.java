package tabelaHash;

public class HashTable3 {
	private int tamArray;
	private ListaEncadeada [] array;
	
	public HashTable3(int tamArray) {
		this.tamArray = tamArray;
		array = new ListaEncadeada[tamArray];
	}
	
	public int hash(String chave) {
		byte bytesChave[] = chave.getBytes();
		int hashCode = 0;
		for (int i: bytesChave) {
			hashCode += i;
		}
		return hashCode % tamArray;
	}
	
	public void inserir(String chave, int valor) {
		int indiceArray = hash(chave);
		if (array[indiceArray] == null) {
			array[indiceArray] = new ListaEncadeada(chave, valor);
			return;
		}
		
		Nodo aux = array[indiceArray].getInicio();
		while (aux != null){
			if (aux.getChave() == chave) {
				aux.setValor(valor);
				return;
			}
			
			aux = aux.getProx();
		}
		
		array[indiceArray].inserirFinal(chave, valor);
	}
	
	public int recuperar(String chave) {
		int indiceArray = hash(chave);
		if (array[indiceArray] == null) {
			return 0;
		}
		Nodo aux = array[indiceArray].getInicio();
		while (aux != null) {
			if (aux.getChave() == chave) {
				return aux.getValor();
			}
			aux = aux.getProx();
		}
		return 0;
		
	}
	
	public StringBuilder mostraTabela() {
	    StringBuilder tabela = new StringBuilder();
	    for (int i = 0; i < tamArray; i++) {
	        tabela.append("Chave " + i + ": ");
	        if (array[i] != null) {
	            Nodo nodoAtual = array[i].getInicio();
	            while (nodoAtual != null) {
	                tabela.append(nodoAtual.getChave() + ": " + nodoAtual.getValor() + " ");
	                nodoAtual = nodoAtual.getProx();
	            }
	        } else {
	            tabela.append("Vazio");
	        }
	        tabela.append("\n");
	    }
	    return tabela;
	}
}
