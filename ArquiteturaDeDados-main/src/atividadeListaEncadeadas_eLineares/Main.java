package atividadeListaEncadeadas_eLineares;

public class Main {

	public static void main(String[] args) {
		
		// Ex 1
		
//		ListaEncadeada lista = new ListaEncadeada();
//		
//		lista.InserirFinal(5);
//		lista.InserirFinal(4);
//		lista.InserirFinal(6);
//		lista.InserirFinal(5);
//		lista.InserirFinal(9);
//		lista.InserirFinal(3);
//		lista.InserirFinal(5);
//		
//		lista.mostraTabela();
//		lista.QuantidadeIgualNodoInf(5);

		
		// Ex 2
		
		ExDois lista2 = new ExDois();
		lista2.inserirInicio(15, 123512, 220);
		lista2.inserirInicio(22, 321512, 97);

		
		lista2.aplicaDesconto(20);
    	lista2.relatorio();

	}

}
