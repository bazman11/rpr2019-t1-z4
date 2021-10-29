package ba.unsa.etf.rpr;


public class Korpa {
    private Artikl[] artikli;
    private int kapacitet, brojArtikala;

    public Korpa() {
        this.artikli=new Artikl[50];
        this.kapacitet=50;
        this.brojArtikala=0;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
    public boolean dodajArtikl(Artikl a){
        if(brojArtikala == kapacitet) return false;
        artikli[brojArtikala] = a;
        brojArtikala++;
        return true;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl a = new Artikl();
        for(int i = 0; i<brojArtikala; i++){
            if(artikli[i].getKod().equalsIgnoreCase(kod)){
                a=artikli[i];
                for(int j=i;j<brojArtikala;j++)
                    artikli[j] = artikli[j+1];
            }
            brojArtikala--;
        }
        return a;
    }

    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for (int i = 0; i < brojArtikala; i++)
            suma+=artikli[i].getCijena();
        return suma;
    }
}