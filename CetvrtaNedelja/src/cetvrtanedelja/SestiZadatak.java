package cetvrtanedelja;
import java.util.Random;
import java.util.Scanner;
public class SestiZadatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Unesite duzinu niza: ");
	        int duzina = scanner.nextInt();

	        
	        double[] niz = new double[duzina];

	        
	        Random random = new Random();

	        
	        for (int i = 0; i < duzina; i++) {
	            niz[i] = random.nextInt(20) + 1;  
	        }

	        
	        System.out.println("Originalni niz:");
	        for (int i = 0; i < duzina; i++) {
	            System.out.print(niz[i] + " ");
	        }
	        System.out.println();  

	        
	        for (int i = 0; i < duzina; i++) {
	            if (niz[i] % 2 == 0) {
	                
	                niz[i] = -niz[i];
	            } else {
	                
	                niz[i] = 1 / niz[i];
	            }
	        }

	        
	        System.out.println("Izmenjeni niz:");
	        for (int i = 0; i < duzina; i++) {
	            System.out.print(niz[i] + " ");
	        }
	        System.out.println();  

	        scanner.close();  
	    }
	{
	}

}
