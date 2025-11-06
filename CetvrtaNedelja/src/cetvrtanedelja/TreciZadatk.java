package cetvrtanedelja;
import java.util.Scanner;
public class TreciZadatk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Unesite broj ispita (duzinu niza): ");
        int duzina = scanner.nextInt();

        
        int[] bodovi = new int[duzina];

        
        for (int i = 0; i < duzina; i++) {
            System.out.print("Unesite broj bodova za ispit " + (i + 1) + ": ");
            bodovi[i] = scanner.nextInt();
        }

        
        double suma = 0;
        for (int i = 0; i < duzina; i++) {
            suma += bodovi[i];
        }
        double prosek = suma / duzina;

        
        int najmanji = bodovi[0];
        int indeksNajmanjeg = 0;
        for (int i = 1; i < duzina; i++) {
            if (bodovi[i] < najmanji) {
                najmanji = bodovi[i];
                indeksNajmanjeg = i;
            }
        }

        
        System.out.println("\nProsečan broj bodova: " + prosek);
        System.out.println("Najmanji broj bodova: " + najmanji + " (indeks: " + indeksNajmanjeg + ")");
        {
        
        }}}

	


