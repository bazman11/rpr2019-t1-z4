package ba.unsa.etf.rpr;


public class Supermarket {
    private Artikl[] artikli;
    private int kapacitet;
    private int brojArtikala;

    public Supermarket() {
        artikli = new Artikl[1000];
        kapacitet = 1000;
        brojArtikala = 0;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void dodajArtikl(Artikl artikl) {
        if(brojArtikala == kapacitet) return;
        artikli[brojArtikala] = artikl;
        brojArtikala++;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl a = new Artikl();
        for(int i = 0; i < brojArtikala; i++){
            if(artikli[i].getKod().equalsIgnoreCase(kod)){
                a = artikli[i];
                for(int j = i; j < brojArtikala; j++)
                    artikli[j] = artikli[j + 1];
                brojArtikala--;
            }

        }
        return a;
    }

}