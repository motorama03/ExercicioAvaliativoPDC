package atividadeListaEncadeadas_eLineares;
import listaLineares.Nodo;

public class ExDois {
	
		private Nodo inicio;
		private Nodo fim;
		
		public ExDois() {
			inicio = null;
		}
		
		public Nodo getInicio() {
			return inicio;
		}
		
		public Nodo getFim() {
			return fim;
		}
		
		public void inserirInicio(int dado, int dado2, int dado3) {
			Nodo novoNodo = new Nodo(dado, dado2, dado3);
			if(inicio == null) {
				inicio = novoNodo;
				inicio.setProx(inicio);
				fim = inicio;
			}else {
				novoNodo.setProx(inicio);
				inicio = novoNodo;
				fim.setProx(inicio);
			}
		}
		
		public void inserirFinal(int dado, int dado2, int dado3) {
			Nodo novoNodoF = new Nodo(dado, dado2, dado3);
			if(inicio == null) {
				inicio = novoNodoF;
				inicio.setProx(inicio);
				fim = inicio;
			}else {
				fim.setProx(novoNodoF);
				novoNodoF.setDado(dado);
				novoNodoF.setProx(inicio);
				novoNodoF = fim;
			}
		}
		
		public void deletaComValor(int dado) {
			if(inicio == null) return;
			if(inicio.getDado() == dado) {
				if(inicio == fim) {
					inicio = null;
					return;
				}
				// se elemento deletado for o primeiro
				// da lista, mas lista contém mais elementos
				inicio = inicio.getProx();
				fim.setProx(inicio);
				return;
			}
			// Caso o dado não for apagado ainda
			// o sistema procurará o dado no meio para
			// o final da lista
			Nodo aux = inicio;
			do{
				if(aux.getProx().getDado() == dado) {
					aux.setProx(aux.getProx().getProx());
					return;
				}
				aux = aux.getProx();
			}while(aux!=inicio);
		}
		
		public int contaNodos() {
			Nodo aux = inicio;
			int counter = 0;
			if(inicio == null) return 0;
			else
				do {
					aux = aux.getProx();
					counter ++;
				}while(aux != inicio);
			return counter;
		}
		
		public String mostrarLista() {
			String lista = "";
			if(inicio == null)return lista;
			Nodo aux = inicio;
			do{
				lista+= aux.getDado()+"\n";
				aux = aux.getProx();
			}while(aux!=inicio);
			return lista;
		}
		
		public void aplicaDesconto(int desconto) {
			Nodo aux = inicio;
			while(aux != fim.getProx()) {
				int valor = aux.getDado();
				System.out.println("Valor sem desconto: "+ valor);
				valor = (valor - (valor * desconto));
				System.out.println("Valor com desconto: "+ valor);
				aux = aux.getProx();
			}
//			relatorio();
		}
		
		public void relatorio() {
			
			StringBuilder out = new StringBuilder();
			Nodo aux = inicio;
			while(aux != null) {
				out.append("O Produto X possui: \n");
				out.append("Valor = "+aux.getDado()+"\n");
				out.append("Código = "+aux.getDado2()+"\n");
				out.append("Quantidade Em Estoque = "+aux.getDado3()+"\n");
				aux = aux.getProx();
			}
			System.out.println(out);
			
		}
		
		//public String buscaValorCircular()
		// desenvolver!!
		
}
