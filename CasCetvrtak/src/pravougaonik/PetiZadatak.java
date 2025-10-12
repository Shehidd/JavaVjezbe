package pravougaonik;
import java.util.Scanner;
public class PetiZadatak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double xH = sc.nextDouble(), yH=sc.nextDouble();
		double xK = sc.nextDouble(), yK=sc.nextDouble();
		double xB = xK + 2;
		double yB = yK - 3;
		
		double HB = Math.sqrt(Math.pow(xB-yH), 2)+Math.pow((xB-xH), 2);
		
		

	}

}
