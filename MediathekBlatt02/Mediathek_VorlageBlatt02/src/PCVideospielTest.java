
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class PCVideospielTest extends AbstractVideospielTest
{

    public PCVideospielTest()
    {
        super("WindowsXP/Vista");
    }


    @Override
    protected AbstractVideospiel getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public void testBerechneMietgebuehr()
    {
        assertEquals(_videospiel.berechneMietgebuehr(1).getEuroAnteil(), 2);
        assertEquals(_videospiel.berechneMietgebuehr(1).getCentAnteil(), 0);

        assertEquals(_videospiel.berechneMietgebuehr(7).getEuroAnteil(), 2);
        assertEquals(_videospiel.berechneMietgebuehr(7).getCentAnteil(), 0);

        assertEquals(_videospiel.berechneMietgebuehr(8).getEuroAnteil(), 7);
        assertEquals(_videospiel.berechneMietgebuehr(8).getCentAnteil(), 0);

        assertEquals(_videospiel.berechneMietgebuehr(12).getEuroAnteil(), 7);
        assertEquals(_videospiel.berechneMietgebuehr(12).getCentAnteil(), 0);

        assertEquals(_videospiel.berechneMietgebuehr(13).getEuroAnteil(), 12);
        assertEquals(_videospiel.berechneMietgebuehr(13).getCentAnteil(), 0);
    }
}
