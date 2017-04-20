import static org.junit.Assert.*;

import org.junit.Test;

public abstract class AbstractVideospielTest extends AbstractMediumTest
{

	protected static final String KOMMENTAR = "Kommentar";
    protected static final String TITEL = "Titel";
    protected static final String BEZEICHNUNG = "Videospiel";
    protected final String SYSTEM;
    protected AbstractVideospiel _videospiel;

    public AbstractVideospielTest(String system)
    {
    	SYSTEM = system;
    }

    @Test
    public void testAbstractVideospiel()
    {
        assertEquals(SYSTEM, getMedium().getSystem());
    }


    @Test
    public final void testSetKommentar()
    {
        AbstractVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }


	@Test
	public void testGetMedienBezeichnung()
	{
		assertEquals("Videospiel", _medium1.getMedienBezeichnung());
	}
	
    @Test
    public abstract void testBerechneMietgebuehr();

    protected abstract AbstractVideospiel getMedium();


}
