package Restoran;

public class Konobar extends Zaposleni {
    private int prekovremeniSati;

    public Konobar(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati, int prekovremeniSati) {
        super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
        this.prekovremeniSati = prekovremeniSati;
    }

    public int getPrekovremeniSati() { return prekovremeniSati; }
    public void setPrekovremeniSati(int prekovremeniSati) { this.prekovremeniSati = prekovremeniSati; }

    @Override
    public double izracunajPlatu() {
        double redovni = getUkupanBrojSati() * getPlataPoSatu();
        double prekovremeni = prekovremeniSati * (getPlataPoSatu() * 1.2);
        return 4 * (redovni + prekovremeni); }
      
        @Override
        public void Podatke() {
            super.Podatke();
            System.out.println("Prekovremeni sati: " + prekovremeniSati);
            System.out.println("Mjesecna plata: " + izracunajPlatu() + "€");
    }
}