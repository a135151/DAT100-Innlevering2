package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		int tabell[][] = matrise;
		for (int i = 0; i < tabell.length; i++) {
			for (int j = 0; j < tabell[i].length; j++) {
				System.out.print(tabell[i][j] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String toString(int[][] matrise) {
		String result = "";

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				result += (matrise[i][j] + " ");

			}
			result += "\n";
		}

		return result;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
	    int[][] resultat = new int[matrise.length][matrise[0].length];

	    for (int i = 0; i < matrise.length; i++) {
	        for (int j = 0; j < matrise[i].length; j++) {
	            resultat[i][j] = matrise[i][j] * tall;
	        }
	    }
	    return resultat;
	}
	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int[][] matriseA = a;
		int[][] matriseB = b;
		
	    if (matriseA.length != matriseB.length) {
	        return false;
	    }

	    for (int i = 0; i < matriseA.length; i++) {
	        if (matriseA[i].length != matriseB[i].length) {
	            return false;
	        }
	    }

	    for (int i = 0; i < matriseA.length; i++) {
	        for (int j = 0; j < matriseA[i].length; j++) {
	            if (matriseA[i][j] != matriseB[i][j]) {
	                return false;
	            }
	        }
	    }

	    return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int speilet[][] = new int[matrise[0].length][matrise.length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				speilet[j][i] = matrise[i][j];
			}
		}

		return speilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int m = a.length;
		int N = a[0].length;
		int n = b[0].length;
		
		int result[][] = new int[m][n];
	
		for(int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < N; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}
}

