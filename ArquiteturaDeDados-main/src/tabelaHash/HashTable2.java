package tabelaHash;

public class HashTable2 {
	private int tamArray;
	private Nodo [] array;
	
	public HashTable2(int tamArray) {
		this.tamArray = tamArray;
		array = new Nodo[tamArray];
	}
	
	private int hash (String chave) {
		byte bytesChave[] = chave.getBytes();
		int hashCode = 0;
		for (int i : bytesChave) {
			hashCode += i;
		}
		return hashCode % tamArray;
	}
	
	private int hash(String chave, int numeroColisoes) {
	    byte bytesChave[] = chave.getBytes();
	    int hashCode = 0;
	    for (int i : bytesChave) {
	        hashCode += i;
	    }
	    return (hashCode + numeroColisoes) % tamArray; // Correção aqui
	}
	
	public void inserir(String chave, int valor) {
	    int indiceArray = hash(chave);
	    if (array[indiceArray] == null) {
	        array[indiceArray] = new Nodo(chave, valor);
	        return;
	    }
	    if (array[indiceArray].getChave().equals(chave)) { // Correção aqui
	        array[indiceArray].setValor(valor);
	        return;
	    }

	    int numeroColisoes = 1;
	    int novoIndice = 0;
	    while (array[indiceArray].getChave().equals(chave)) { // Correção aqui
	        novoIndice = hash(chave, numeroColisoes);
	        if (array[novoIndice] == null) {
	            array[novoIndice] = new Nodo(chave, valor);
	            return;
	        }

	        if (array[novoIndice].getChave().equals(chave)) { // Correção aqui
	            array[novoIndice].setValor(valor);
	            return;
	        }
	        numeroColisoes += 1;
	        indiceArray = novoIndice;
	    }
	}

	public int recuperar(String chave) {
	    int indiceArray = hash(chave);
	    if (array[indiceArray] == null) {
	        return 0;
	    }
	    if (array[indiceArray].getChave().equals(chave)) { // Correção aqui
	        return array[indiceArray].getValor();
	    }
	    int numeroColisoes = 1;
	    while (array[indiceArray].getChave().equals(chave)) { // Correção aqui
	        int novoIndice = hash(chave, numeroColisoes);
	        if (array[novoIndice] == null) {
	            return 0;
	        }
	        if (array[novoIndice].getChave().equals(chave)) { // Correção aqui
	            return array[novoIndice].getValor();
	        }
	        numeroColisoes += 1;
	        indiceArray = novoIndice;
	    }
	    return 0;
	}
	
	public String mostraTabela() {
	    for (int x = 0; x < tamArray; x++) {
	        if (array[x] != null) {
	            System.out.println("Chave " + x + ": " + array[x].getChave() + " - Valor: " + array[x].getValor());
	        } else {
	            System.out.println("Chave " + x + ": Vazio");
	        }
	    }
	    return "";
	}
}
