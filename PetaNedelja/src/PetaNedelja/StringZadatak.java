package PetaNedelja;
import java.util.Scanner;
public class StringZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		line = line.trim();
		
		String[] djelovi = line.split("\\s+");
		
		System.out.println(djelovi.length);
		


	}

}
