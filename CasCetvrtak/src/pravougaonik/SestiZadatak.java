package pravougaonik;
import java.util.Scanner;
public class SestiZadatak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		int n = sc.nextInt();
		
		double ukupnaudaljenost = 0.0;
		
		 for (int i = 0; i < n; i++);
			 double xi = sc.nextDouble();
			 double yi = sc.nextDouble();
			 
			 if (xi > 0 && yi > 0);
	                double udaljenost = Math.sqrt(Math.pow(xi - x, 2) + Math.pow(yi - y, 2));
	                ukupnaudaljenost += udaljenost;
	                
	   System.out.printf("Ukupna udaljenost do paketa u prvom kvadrantu je: %.2f\n", ukupnaudaljenost);

	}

}
