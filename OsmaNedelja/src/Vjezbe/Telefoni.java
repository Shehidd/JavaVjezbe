package Vjezbe;

public class Telefoni extends EProizvodi {

	    private String operativniSistem;
	    private double velicinaEkrana;

	    public Telefoni(String opis, String sifra, double uvoznaCijena, String operativniSistem, double velicinaEkrana) {
	        super(opis, sifra, uvoznaCijena);
	        this.operativniSistem = operativniSistem;
	        this.velicinaEkrana = velicinaEkrana;
	    }
}
