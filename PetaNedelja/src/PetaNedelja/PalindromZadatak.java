package PetaNedelja;
import java.util.Scanner;
public class PalindromZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine().trim();
		String y = new StringBuilder(x).reverse().toString();
		
		System.out.println(x.equalsIgnoreCase(y) ? "Palindrom":"Nista");
			
			

	}

}
