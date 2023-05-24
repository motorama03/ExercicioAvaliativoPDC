package recursividade;

public class QuestaoCinco {
	
	private int y;
	
	QuestaoCinco(int y){
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
//			System.out.println("Somando mais 2 agora");
			return 2;
		}else {
//			QuestaoDois recursivo = new QuestaoDois(y);
			System.out.println(((2*(y-1) -4)+ resolveEquacao(y - 1)));
			return((2*(y-1) -4)+ resolveEquacao(y - 1));
		}
	}
	
}