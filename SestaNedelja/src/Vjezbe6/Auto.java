package Vjezbe6;

public class Auto {

	public static void main(String[] args) {
		private String markaAuta;
	    private int godisteAuta;
	    private int snagaMotora;
	    private boolean prodato;
	    private int kubikazaMotora;
	    private boolean registrovan;

	    private static int brojProdatihAutomobila = 0;

	    public Auto(String markaAuta, int godisteAuta, int snagaMotora, boolean prodato, int kubikazaMotora) {
	        this.markaAuta = markaAuta;
	        this.godisteAuta = godisteAuta;
	        this.snagaMotora = snagaMotora;
	        this.prodato = prodato;
	        this.kubikazaMotora = kubikazaMotora;

	        if (this.godisteAuta < 1985) {
	            this.registrovan = false;
	        } else {
	            this.registrovan = true;
	        }

	        if (prodato) {
	            brojProdatihAutomobila++;
	        }
	    }

	    
	    public String getMarkaAuta() { return markaAuta; }
	    public void setMarkaAuta(String markaAuta) { this.markaAuta = markaAuta; }

	    public int getGodisteAuta() { return godisteAuta; }
	    public void setGodisteAuta(int godisteAuta) { this.godisteAuta = godisteAuta; }

	    public int getSnagaMotora() { return snagaMotora; }
	    public void setSnagaMotora(int snagaMotora) { this.snagaMotora = snagaMotora; }

	    public boolean isProdato() { return prodato; }
	    public void setProdato(boolean prodato) { this.prodato = prodato; }

	    public int getKubikazaMotora() { return kubikazaMotora; }
	    public void setKubikazaMotora(int kubikazaMotora) { this.kubikazaMotora = kubikazaMotora; }

	    public boolean isRegistrovan() { return registrovan; }
	    public void setRegistrovan(boolean registrovan) { this.registrovan = registrovan; }

	    public static int getBrojProdatihAutomobila() {
	        return brojProdatihAutomobila;
	    }

	    
	    public double izracunajRegistraciju() {
	        if (!registrovan) {
	            return 0; 
	        }

	        double koeficijent = 0;

	        if (godisteAuta >= 1985 && godisteAuta <= 2000) {
	            koeficijent = 3.0;
	        } else if (godisteAuta >= 2001 && godisteAuta <= 2010) {
	            koeficijent = 2.0;
	        } else if (godisteAuta >= 2011) {
	            koeficijent = 1.5;
	        }

	        return koeficijent * kubikazaMotora * snagaMotora;
	    }

	    @Override
	    public String toString() {
	        return String.format(
	            "Marka: %s | Godište: %d | Snaga: %d KS | Kubikaža: %d | Registrovan: %s | Prodato: %s",
	            markaAuta, godisteAuta, snagaMotora, kubikazaMotora,
	            (registrovan ? "Da" : "Ne"), (prodato ? "Da" : "Ne")
	        );
	    }

	    
	    public static void main(String[] args) {
	        Auto a1 = new Auto("Toyota", 1999, 120, false, 1600);
	        Auto a2 = new Auto("Fiat", 2005, 100, true, 1400);
	        Auto a3 = new Auto("BMW", 2015, 150, true, 2000);
	        Auto a4 = new Auto("Opel", 1980, 90, false, 1300);

	        System.out.println(a1);
	        System.out.println(a2);
	        System.out.println(a3);
	        System.out.println(a4);

	        System.out.println("\nBroj prodatih automobila: " + Auto.getBrojProdatihAutomobila());

	        double ukupno = a1.izracunajRegistraciju() + a2.izracunajRegistraciju()
	                      + a3.izracunajRegistraciju() + a4.izracunajRegistraciju();

	        System.out.println("Ukupna suma registracija: " + ukupno);
	    }
	}

	}

}
