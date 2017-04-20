
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class KonsolenVideospielTest extends AbstractVideospielTest
{

    public KonsolenVideospielTest()
    {
    	super(" Wii  ");
    }
    
    @Override
    protected AbstractVideospiel getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public void testBerechneMietgebuehr()
    {
        assertEquals(_videospiel.berechneMietgebuehr(2).getEuroAnteil(), 2);
        assertEquals(_videospiel.berechneMietgebuehr(2).getCentAnteil(), 0);
        
        assertEquals(_videospiel.berechneMietgebuehr(3).getEuroAnteil(), 9);
        assertEquals(_videospiel.berechneMietgebuehr(3).getCentAnteil(), 0);

        assertEquals(_videospiel.berechneMietgebuehr(5).getEuroAnteil(), 9);
        assertEquals(_videospiel.berechneMietgebuehr(5).getCentAnteil(), 0);
        
        assertEquals(_videospiel.berechneMietgebuehr(6).getEuroAnteil(), 16);
        assertEquals(_videospiel.berechneMietgebuehr(6).getCentAnteil(), 0);
    }
}
