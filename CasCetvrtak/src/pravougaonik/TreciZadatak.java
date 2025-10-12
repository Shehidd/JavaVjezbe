package pravougaonik;
import java.util.Scanner;
// Napisati program kojim se izracunava potrebna duzina trake za ivicu stolnjaka kruznok oblika cija je povrsina P
public class TreciZadatak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double P = sc.nextDouble();
		double r=Math.sqrt(Math.PI);
		double O = 2*r*Math.PI;
		System.out.printf("%.2f%/n", O);
		sc.close();

	}

}
