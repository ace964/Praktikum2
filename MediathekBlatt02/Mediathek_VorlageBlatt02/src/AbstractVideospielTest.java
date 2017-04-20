import static org.junit.Assert.*;

import org.junit.Test;

public abstract class AbstractVideospielTest
{

	protected static final String KOMMENTAR = "Kommentar";
    protected static final String TITEL = "Titel";
    protected static final String BEZEICHNUNG = "Videospiel";
    protected final String SYSTEM;
    protected AbstractVideospiel _videospiel;

    public AbstractVideospielTest(String system)
    {
    	SYSTEM = system;
    	_videospiel = getMedium();
    }

    @Test
    public void testeKonstruktor()
    {
        assertEquals(TITEL, _videospiel.getTitel());
        assertEquals(KOMMENTAR, _videospiel.getKommentar());
        assertEquals(SYSTEM, _videospiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _videospiel.getMedienBezeichnung());
    }

    @Test
    public final void testSetKommentar()
    {
        AbstractVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
    	AbstractVideospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }

    @Test
    public abstract void testBerechneMietgebuehr();

    protected abstract AbstractVideospiel getMedium();


}
