package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private String kod;
    private int cijena;

    public Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    public Artikl() {
        this.naziv="";
        this.cijena = 0;
        this.kod="";
    }

    public String getNaziv() {
        return naziv;
    }

    public String getKod() {
        return kod;
    }

    public int getCijena() {
        return cijena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }
}