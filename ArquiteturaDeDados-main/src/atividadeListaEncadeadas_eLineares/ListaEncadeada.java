package atividadeListaEncadeadas_eLineares;

public class ListaEncadeada {
	private Nodo inicio;

	public ListaEncadeada () {
		inicio = null;
	}
	public Nodo getInicio() {
		return inicio;
	}
	
	
	public ListaEncadeada(Nodo inicio) {
		this.inicio = inicio;
	}
	
	
	public void InserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if(inicio == null) {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
		}else InserirFinal(dado);
	}
	
	public void InserirFinal(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if(inicio == null) {
			InserirInicio(dado);
			return;
		}
		Nodo aux = inicio;
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoNodo);
		aux.getProx().setProx(null);;
	}
	
	public int QuantidadeNodos() {
		Nodo aux = inicio;
		int qnt = 0;
		do{
			aux = aux.getProx();
			qnt++;
		}while(aux != null);
		return qnt;
	}
	public String QuantidadeIgualNodoInf(int dado) {
		StringBuilder saida = new StringBuilder();
		Nodo aux = inicio;
		Nodo auxPosic = null;
		Nodo posicNodo = new Nodo();
		int qntNodosI = 0;
		int posic = 0;
		int qntMaior = 0;
		while(aux != null){
			posic ++;
			if(aux.getDado() > dado)
				qntMaior ++;
			
			if(aux.getDado() == dado) {
				qntNodosI ++;
				posicNodo.setDado(posic);
				posicNodo.setProx(auxPosic);
			}
			aux = aux.getProx();
		}
//		while(aux.getProx() != null);
		saida.append("A quantidade de Nodos iguais ao informado é : "+qntNodosI+"\n");
		saida.append("A quantidade de Nodos Maiores que o informado é: "+qntMaior+"\n");
		saida.append("A posição dos Nodos iguais é \n");
		for(int i = 0; i < qntNodosI; i++) {
			saida.append(posicNodo.getDado()+", ");
			posicNodo.getProx();
		}
		System.out.println(saida);
		return (saida.toString());
	}
	public void mostraTabela() {
		Nodo aux = inicio;
		do{
			System.out.println(aux.getDado());
			aux = aux.getProx();
		}while(aux.getProx() != null);
		return;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaEncadeada [=");
		builder.append(QuantidadeIgualNodoInf(5));
		builder.append("]");
		return builder.toString();
	}
	
	
}
