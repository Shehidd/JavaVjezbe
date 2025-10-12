package pravougaonik;
import java.util.Scanner;
//Date su koordinate donje desne i gornje lijeve ivice zida  (pravougaonik). Napisati program koji racuna povrsinu i obim zida
public class CetvrtiZadatak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble(),x2 = sc.nextDouble(), y1 = sc.nextDouble(), y2 = sc.nextDouble();
		
		double a = Math.abs(y2-x2);
		double b = Math.abs(y2-y1);
		
		double P = a*b;
		double O = 2*a+2*b;
		
		System.out.printf("Povrsina ke:%.2f O=%.2f%n",P,O);

	}

}
