package Restoran;

public class Zaposleni {

	private int id;
    private String ime;
    private String prezime;
    private double plataPoSatu;
    private int ukupanBrojSati;

    public Zaposleni(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.plataPoSatu = plataPoSatu;
        this.ukupanBrojSati = ukupanBrojSati;
    }

    public int getId() { return id; }
    public String getIme() { return ime; }
    public String getPrezime() { return prezime; }
    public double getPlataPoSatu() { return plataPoSatu; }
    public int getUkupanBrojSati() { return ukupanBrojSati; }

    public void setPlataPoSatu(double plataPoSatu) { this.plataPoSatu = plataPoSatu; }
    public void setUkupanBrojSati(int ukupanBrojSati) { this.ukupanBrojSati = ukupanBrojSati; }
    
    public double izracunajPlatu() {
        return 0;
    }   
        public void Podatke() {
            System.out.println("ID: " + id + " | " + ime + " " + prezime);
            System.out.println("Satnica: " + plataPoSatu + "€, Sati sedmično: " + ukupanBrojSati);
}
}
