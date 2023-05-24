package tabelaHash;

import java.util.Random;

public class TesteHash {

	public static void main(String[] args) {
		
		// Marca o tempo de início
		long inicio = System.nanoTime();
		HashTable3 tabelaHash = new HashTable3(10);

		tabelaHash.inserir(BuscaNome(), BuscaIdade());
		tabelaHash.inserir(BuscaNome(), BuscaIdade());
		tabelaHash.inserir(BuscaNome(), BuscaIdade());
		tabelaHash.inserir(BuscaNome(), BuscaIdade());
		tabelaHash.inserir(BuscaNome(), BuscaIdade());
		tabelaHash.inserir(BuscaNome(), BuscaIdade());
		tabelaHash.inserir(BuscaNome(), BuscaIdade());
		tabelaHash.inserir(BuscaNome(), BuscaIdade());
		tabelaHash.inserir(BuscaNome(), BuscaIdade());
		tabelaHash.inserir(BuscaNome(), BuscaIdade());
		System.out.println(tabelaHash.mostraTabela());
		// Marca o tempo no fim
		long fim = System.nanoTime();
		
		// Calcula o tempo de execução em milissegundos
		double tempoExecucao = (fim - inicio)/1000000.0;
		System.out.println("Tempo de execução: "+ tempoExecucao+" ms");
	}
	private static String BuscaNome() {
		String letrasSilabas = "bcdfghjklmnpqrstvwxyz";
		String letrasVogais = "aeiou";
		String palavraF = "";
		Random r = new Random();
		char result = 0;
		for(int z = 0; z < 3; z++) {
			int x = r.nextInt(21);
			if(palavraF.length() != 1)
				result = letrasSilabas.charAt(x);
			if(palavraF.length() == 1) {
				int y = r.nextInt(5);
				result = letrasVogais.charAt(y);
			}
			palavraF += result;
		}
		return (palavraF);
	}
	private static int BuscaIdade() {
		Random r = new Random();
		int idade = r.nextInt(18, 60);
		return idade;
	}
}
