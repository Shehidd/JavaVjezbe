package cetvrtanedelja;
import java.util.Scanner;
public class CetvrtiZadatak {
	
    public static double nadjiParniPozitivniProsjek(int[] niz) {
        int suma = 0;  
        int brojParnihPozitivnih = 0;

        
        for (int broj : niz) {
            if (broj > 0 && broj % 2 == 0) {  
                suma += broj;  
                brojParnihPozitivnih++;  
            }
        }

        
        if (brojParnihPozitivnih == 0) {
            return 0;
        }

        
        return (double) suma / brojParnihPozitivnih;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Unesite broj elemenata u nizu: ");
        int duzina = scanner.nextInt();  
        int[] niz = new int[duzina];

        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < duzina; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            niz[i] = scanner.nextInt();  
        }

         
        double prosjek = nadjiParniPozitivniProsjek(niz);

        
        if (prosjek == 0) {
            System.out.println("Nema pozitivnih parnih brojeva u nizu.");
        } else {
            System.out.println("Prosečna vrednost pozitivnih parnih brojeva: " + prosjek);
        }

        scanner.close();  
    }
}

