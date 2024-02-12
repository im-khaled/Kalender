/*
 * Author: Khaled M.
 * Year: 2022
 */
public class Kalender {

	public static void main(String[] args) {
		
				
		Jahr j = new Jahr(2021);
		j.eintragen(365, "Klausuer", 1);
		
		Jahr j2 = new Jahr(2022);
		j.eintragen(37, "Treffen", 5);

		
		int t1=17;
		if (j.getTermin(t1) != null)
			System.out.println(t1+". Tag ist belegt");
		else
			System.out.println(t1+". Tag ist frei");
		
		int t2 = 45;
		if (j.getTermin(t2) != null)
			System.out.println(t2+". Tag ist belegt");
		else
			System.out.println(t2+". Tag ist frei");
		System.out.println("Belegte Tage insgesamt : "+j.getBelegt());
	
	}

}
