package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    public void kontruktorTest1(){
        Artikl a = new Artikl();
        assertEquals("", a.getNaziv());
        assertEquals(0, a.getCijena());
        assertEquals("", a.getKod());
    }
    @Test
    public void konstruktorTest2(){
        Artikl a = new Artikl("Lopta", 20, "0012");
        assertEquals("Lopta", a.getNaziv());
        assertEquals(20, a.getCijena());
        assertEquals("0012", a.getKod());
    }
}