package recursividade;

public class QuestaoQuatro {
	
	private int n;
	
	QuestaoQuatro(int n){
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int algoritmoRecusivo(int n) {
		if(n == 1) {
			return(2 * 1 + 2 * 1 + 8);
		}else {
			return(2 * (n*n) + 2 * n + 8)+ algoritmoRecusivo(n-1);
		}
	}
	
}
