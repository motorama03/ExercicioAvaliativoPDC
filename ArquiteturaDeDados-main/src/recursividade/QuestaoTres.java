package recursividade;

public class QuestaoTres {
	
	private int z;
	private int a;
	
	QuestaoTres(int z, int a){
		this.z = z;
		this.a = a;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	public int produto(int z, int a) {
		if(z == 1) {
			return 1;
		}else {
			if(a == 1) {
				return z;
			}else {
				return z + produto(z, a-1);			}
		}
	}
	
	
}
