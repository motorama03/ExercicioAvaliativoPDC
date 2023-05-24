package recursividade;

public class QuestaoDois {
	
	private int y;
	
	QuestaoDois(int y){
		this.y = y;
	}

	public int getY() {
		if(y < 2) {
			return 2;
		}else
			return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int resolveEquacao(int y) {
		if(y == 2) {
			return 2;
		}else {
//			QuestaoDois recursivo = new QuestaoDois(y);
			return((2*(y-1) -4)+ resolveEquacao(y - 1));
		}
	}
	
}
