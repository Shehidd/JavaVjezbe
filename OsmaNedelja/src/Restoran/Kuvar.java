package Restoran;

public class Kuvar extends Zaposleni {
    public Kuvar(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati) {
        super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
    }

    @Override
    public double izracunajPlatu() {
        return 1500 + 4 * getUkupanBrojSati() * getPlataPoSatu();
    }

    @Override
    public void Podatke() {
        super.Podatke();
        System.out.println("Mjesečna plata: " + izracunajPlatu() + "€");
    }}