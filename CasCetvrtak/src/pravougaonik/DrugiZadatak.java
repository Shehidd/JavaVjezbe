package pravougaonik;
import java.util.Scanner;
// Napisati program koji na osnovu zadate sirine i visine lista papira (pravouganog oblika) u milimetrima odredjuje njegovu povrsinu u kvadratnim centimetrima.
public class DrugiZadatak {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double P = (a*b)/100;
		
		System.out.printf("Povrsina je:%.2f", P);

	}

}
