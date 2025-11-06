package Restoran;

public class Restoran {
    private String naziv;
    private String adresa;
    private String PIB;
    
    public Restoran(String naziv, String adresa, String PIB) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.PIB = PIB;
}
    public String getNaziv() { return naziv; }
    public String getAdresa() { return adresa; }
    public String getPIB() { return PIB; }
}