package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		int tabellSomSkrives[] = tabell;
		
		for(int i = 0; i < tabellSomSkrives.length; i++) {
			System.out.println("Index: " + i + " er: "+ tabellSomSkrives[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String resultat = "[";

	    for (int i = 0; i < tabell.length; i++) {
	        resultat += tabell[i];
	        if (i < tabell.length - 1) {
	            resultat += ",";
	        }
	    }

	    resultat += "]";
	    return resultat;
	}

	// c)
	public static int summer(int[] tabell) {
		int tabellSjekk[] = tabell;
		int total = 0;
		
		for(int i = 0; i < tabellSjekk.length; i++) {
			int num = tabellSjekk[i];
			total = total + num;
		}
		
		return total;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		int i = 0;

		while (!finnes && i < tabell.length) {
			if (tall != tabell[i]) {
				i++;
			} else if (tall == tabell[i]) {
				finnes = true;
			}
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int tabellSjekk[] = tabell;
		int num = tall;
		int posisjon = -1;

		for (int i = 0; i < tabellSjekk.length; i++) {
			if (tabellSjekk[i] == num) {
				posisjon = i;
			}
		}
		return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int initTabell[] = tabell;
		int reversert[] = new int[tabell.length];
		int tabellLengde = initTabell.length - 1;
		int j = 0;
		
		for(int i = tabellLengde; i >=0; i--) {
			reversert[j] = initTabell[i];
			j++;
		}
		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int tabellSjekk[] = tabell;
		boolean sortert = true;
		int lengde = tabellSjekk.length - 1;
	
		for (int i = 0; i < lengde; i++) {
			if (tabellSjekk[i] > tabellSjekk[i + 1]) {
				sortert = false;
			} 
		}
		return sortert;
	}

	// h)
	public static int[] sammenSatt(int[] tabell1, int[] tabell2) {
		int lengde = tabell1.length + tabell2.length; 
	    int[] sammenSatt = new int[lengde]; 

	    for (int i = 0; i < tabell1.length; i++) {
	        sammenSatt[i] = tabell1[i];
	    }

	    for (int i = 0; i < tabell2.length; i++) {
	        sammenSatt[tabell1.length + i] = tabell2[i];
	    }

	    return sammenSatt;
	}
}
