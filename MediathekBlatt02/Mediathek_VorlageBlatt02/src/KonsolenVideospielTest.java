
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class KonsolenVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = " Wii  ";
    private KonsolenVideospiel _KonsolenVideospiel;

    public KonsolenVideospielTest()
    {
        _KonsolenVideospiel = getMedium();
    }

    @Test
    public void testeKonsolenVideospiel()
    {
        assertEquals(TITEL, _KonsolenVideospiel.getTitel());
        assertEquals(KOMMENTAR, _KonsolenVideospiel.getKommentar());
        assertEquals(SYSTEM, _KonsolenVideospiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _KonsolenVideospiel.getMedienBezeichnung());
    }

    protected KonsolenVideospiel getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        KonsolenVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        KonsolenVideospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }

    @Test
    public void testBerechneMietgebuehr()
    {
        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(2).getEuroAnteil(), 2);
        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(2).getCentAnteil(), 0);
        
        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(3).getEuroAnteil(), 9);
        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(3).getCentAnteil(), 0);

        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(5).getEuroAnteil(), 9);
        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(5).getCentAnteil(), 0);
        
        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(6).getEuroAnteil(), 16);
        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(6).getCentAnteil(), 0);
    }
}
