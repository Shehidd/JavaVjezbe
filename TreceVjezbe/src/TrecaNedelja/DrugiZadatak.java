package TrecaNedelja;
import java.util.Scanner;
public class DrugiZadatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesite koordinate centra");
		double cx = sc.nextDouble();
		double cy = sc.nextDouble();
		System.out.println("Unesite poluprecnik prvog kruga");
		double R1 = sc.nextDouble();
		System.out.println("Unesite poluprecnik drugog kruga");
		double R2 = sc.nextDouble();
		
		System.out.println("Unesite broj trkaca");
		int N = sc.nextInt();
		
		int naStazi = 0;
		
		for (int i=0; i<=N; i++) {
			System.out.println("Unesite xtrkaca");
			double x = sc.nextDouble();
			System.out.println("Unesite y trkaca");
			double y = sc.nextDouble();
			
			double d = Math.sqrt(Math.pow(x-cx, 2)+Math.pow(y-cy, 2));
			
			if (d>=R1&&d<=R2&&y>=cy) {
				naStazi++;
				
			}
		}
		

	}

}
