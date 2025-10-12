package TrecaNedelja;
import java.util.Scanner;
public class prvizadatak {

	public static void main(String[] args) {
		
// Manhattan Distance
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		long D = sc.nextLong();
		long HD = sc.nextLong();
		long KA = sc.nextLong();
		int brojprijetnji = 0;
		
		for (int i=0; i<N; i++) {
			
			long x=sc.nextLong();
			long y=sc.nextLong();
			
			long menheten = Math.abs(x)+Math.abs(y);
			
			if (menheten <= D) {
				brojprijetnji++;
				
			}
		}
		long totalDamage = brojprijetnji * KA;
		
		System.out.println(brojprijetnji);
		System.out.println(totalDamage);
		
		// System.out.printf("Nas dvorac ukupno ugrozava" %f, brojprijetnji);
		//if(totalDamage>HD) {
			//System.out.printf("Dvorac je")
		}
	}

}
