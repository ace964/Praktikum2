
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class PCVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = " Mac OS X 11.4.2017";
    private PCVideospiel _PCVideospiel;

    public PCVideospielTest()
    {
        _PCVideospiel = getMedium();
    }

    @Test
    public void testePCVideospiel()
    {
        assertEquals(TITEL, _PCVideospiel.getTitel());
        assertEquals(KOMMENTAR, _PCVideospiel.getKommentar());
        assertEquals(SYSTEM, _PCVideospiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _PCVideospiel.getMedienBezeichnung());
    }

    protected PCVideospiel getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        PCVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        PCVideospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }

    @Test
    public void testBerechneMietgebuehr()
    {
        assertEquals(_PCVideospiel.berechneMietgebuehr(1).getEuroAnteil(), 2);
        assertEquals(_PCVideospiel.berechneMietgebuehr(1).getCentAnteil(), 0);

        assertEquals(_PCVideospiel.berechneMietgebuehr(7).getEuroAnteil(), 2);
        assertEquals(_PCVideospiel.berechneMietgebuehr(7).getCentAnteil(), 0);

        assertEquals(_PCVideospiel.berechneMietgebuehr(8).getEuroAnteil(), 7);
        assertEquals(_PCVideospiel.berechneMietgebuehr(8).getCentAnteil(), 0);

        assertEquals(_PCVideospiel.berechneMietgebuehr(12).getEuroAnteil(), 7);
        assertEquals(_PCVideospiel.berechneMietgebuehr(12).getCentAnteil(), 0);

        assertEquals(_PCVideospiel.berechneMietgebuehr(13).getEuroAnteil(), 12);
        assertEquals(_PCVideospiel.berechneMietgebuehr(13).getCentAnteil(), 0);
    }
}
