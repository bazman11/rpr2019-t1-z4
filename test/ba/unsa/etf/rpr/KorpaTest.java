package ba.unsa.etf.rpr;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    public void izbaciArtiklSaKodomTest1(){
        Korpa k = new Korpa();
        Artikl prvi = new Artikl("cokolada", 3, "1");
        Artikl drugi = new Artikl("lizalo", 7, "2");
        Artikl treci = new Artikl("secer", 5, "3");
        assertNull(k.izbaciArtiklSaKodom("4"));
    }
    @Test
    public void izbaciArtiklSaKodomTest2(){
        Korpa k = new Korpa();
        Artikl prvi = new Artikl("cokolada", 3, "1");
        Artikl drugi = new Artikl("lizalo", 7, "2");
        Artikl treci = new Artikl("secer", 5, "3");
        k.dodajArtikl(prvi);
        k.dodajArtikl(drugi);
        k.dodajArtikl(treci);
        assertEquals("secer", k.izbaciArtiklSaKodom("3").getNaziv());
    }

    @Test
    public void dajUkupnuCijenuArtikalaTest(){
        Korpa k = new Korpa();
        Artikl prvi = new Artikl("upaljac", 3, "1");
        Artikl drugi = new Artikl("daljinski", 7, "2");
        Artikl treci = new Artikl("soljica", 5, "3");
        k.dodajArtikl(prvi);
        k.dodajArtikl(drugi);
        k.dodajArtikl(treci);
        assertEquals(15, k.dajUkupnuCijenuArtikala());
    }

    @Test
    public void dodajArtiklTest(){
        Korpa k = new Korpa();
        Artikl a = new Artikl("iPhone 11", 1230, "12");
        assertTrue(k.dodajArtikl(a));
    }

    @Test
    public void dodajArtiklPunaKorpaTest(){
        Korpa k = new Korpa();
        for(int i = 1; i <= 50; i++){
            Artikl a = new Artikl("nesto", 1, "1");
            k.dodajArtikl(a);
        }
        Artikl novi = new Artikl("novi", 2, "2");
        assertFalse(k.dodajArtikl(novi));
    }

}