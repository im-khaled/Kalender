
public class Tag {
	String w;
	int p;
	
	public void eintragen(String was, int prioritaet) {
		
		this.w = was;
		this.p = prioritaet;
	
	}
	
	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public String getVerabredung() {
		
		return w;
	}
	public int getPrioritaet() {
		
		return p;
	}
	
}
