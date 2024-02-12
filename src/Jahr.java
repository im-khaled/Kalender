
public class Jahr {
		
	Tag [] Jahr2021 = new Tag[365];
	Tag [] Jahr2022 = new Tag[365];
	
	Jahr (int x) {
		
		Tag t = new Tag();
			for (int k=0; k<Jahr2021.length; k++) {
				Jahr2021[k] = t;
			}
	}
	
	public void eintragen(int tag, String was, int prioritaet) {
		
			if (Jahr2021[tag-1].getVerabredung() == null) {
				
				Tag t = new Tag();
				Tag [] btag = new Tag[1];
				btag[0]=t;
				 
					btag[0].eintragen(was, prioritaet);
					Jahr2021[tag-1] = btag[0];
			}
			
			else {
			System.out.println("Fehler:"+" "+Jahr2021[tag-1].getVerabredung());
			
			}
	}
		
	
	public String getTermin(int tag) {
			return Jahr2021[tag-1].getVerabredung();
		
	}
	
	public int getPrioritaet(int tag) {
			
			return Jahr2021[tag-1].getPrioritaet();
		
	}
	
	public int getBelegt() {
		int counter = 0;
		for (int b=0; b < Jahr2021.length ;b++) {
					
			if (Jahr2021[b].getVerabredung() != null)
				counter++;
			}
			return counter;			
	}
	
}


