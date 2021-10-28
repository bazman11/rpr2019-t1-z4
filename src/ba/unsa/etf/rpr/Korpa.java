package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli=new Artikl[50];
    static int i=0;
    public boolean dodajArtikl(Artikl k){
        if (i>50) return false;
        else {
            artikli[i]=k;
            i++;
            return true;
        }
    }
}
