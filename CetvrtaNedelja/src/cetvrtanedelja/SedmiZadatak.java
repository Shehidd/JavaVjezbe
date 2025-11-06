package cetvrtanedelja;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class SedmiZadatak {

	public static void main(String[] args) {
		 
	    private double[] temperature;

	    public EvidencijaTemperatura(int duzina) {
	        this.temperature = new double[duzina];
	    }

	    public double[] getTemperature() {
	        return temperature;
	    }

	    public void setTemperature(double[] temperature) {
	        this.temperature = temperature;
	    }

	    public void unosTemperatura() {
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < temperature.length; i++) {
	            System.out.print("Unesite temperaturu " + (i + 1) + ": ");
	            temperature[i] = scanner.nextDouble();
	        }
	    }

	    public void ispisiTemperature() {
	        System.out.println("Duzina niza: " + temperature.length);
	        System.out.print("Temperature: ");
	        for (double t : temperature) {
	            System.out.print(t + " ");
	        }
	        System.out.println(); 
	    }

	    public boolean provjeriTemperaturu(double temp) {
	        for (double t : temperature) {
	            if (t == temp) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public void ukloniTemperaturu(double temp) {
	        List<Double> tempList = new ArrayList<>();
	        for (double t : temperature) {
	            if (t != temp) {
	                tempList.add(t);
	            }
	        }
	        
	        temperature = new double[tempList.size()];
	        for (int i = 0; i < tempList.size(); i++) {
	            temperature[i] = tempList.get(i);
	        }
	    }

	    public double prosjecnaTemperatura() {
	        double suma = 0;
	        for (double t : temperature) {
	            suma += t;
	        }
	        return suma / temperature.length;
	    }

	    public double maksimalnaTemperatura() {
	        double max = temperature[0];
	        for (double t : temperature) {
	            if (t > max) {
	                max = t;
	            }
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        EvidencijaTemperatura evidencija = new EvidencijaTemperatura(5);

	        
	        evidencija.unosTemperatura();

	        
	        evidencija.ispisiTemperature();

	        
	        System.out.print("Unesite temperaturu koju želite proveriti: ");
	        double tempZaProveru = scanner.nextDouble();

	        
	        if (evidencija.proveriTemperaturu(tempZaProveru)) {
	            System.out.println("Temperatura " + tempZaProveru + " postoji u nizu.");
	        } else {
	            System.out.println("Temperatura " + tempZaProveru + " ne postoji u nizu.");
	        }

	        
	        evidencija.ukloniTemperaturu(tempZaProveru);

	        
	        System.out.println("Ažurirani niz temperatura:");
	        evidencija.ispisiTemperature();

	        
	        System.out.println("Prosečna temperatura: " + evidencija.prosjecnaTemperatura());
	        System.out.println("Maksimalna temperatura: " + evidencija.maksimalnaTemperatura());
	        
	        scanner.close();  
	    }
	}
	}

}
