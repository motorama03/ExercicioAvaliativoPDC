package recursividade;

public class SomaRecursiva {
	
	private int x;
	
	SomaRecursiva(int x){
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int Soma(int x) {
		if(x == 1){
			return 1; 
		}else {
			SomaRecursiva somando = new SomaRecursiva(x);
			return x + somando.Soma(x-1);
		}
	}
	
}
