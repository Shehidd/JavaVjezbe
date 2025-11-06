package cetvrtanedelja;
import java.util.Scanner;
public class PetiZadatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        
	        int[] posjete = new int[10];

	        
	        System.out.println("Unesite broj posjeta za poslednjih 10 utakmica:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Posjete za utakmicu " + (i + 1) + ": ");
	            posjete[i] = scanner.nextInt();
	        }

	        
	        int maxPosjete = posjete[0]; 
	        for (int i = 1; i < posjete.length; i++) {
	            if (posjete[i] > maxPosjete) {
	                maxPosjete = posjete[i]; 
	            }
	        }

	        
	        System.out.println("Najveći broj posjeta u jednom danu: " + maxPosjete);

	        scanner.close(); 
	    }
	
	}


