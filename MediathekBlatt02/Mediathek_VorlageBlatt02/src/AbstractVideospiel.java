/**
 * AbstractVideospiel ist ein Medium mit einer zusätzlichen Informationen zum
 * kompatiblen System.
 * 
 * @author SE2-Team, PR2-Team, PR2-Team
 * @version SoSe 2017
 */
class AbstractVideospiel extends AbstractMedium
{
    private String _system; // Das System, auf dem das Spiel lauffähig ist
    private final int basispreis = 200; // Basispreis in Eurocent

    /**
     * Initialisiert ein neues Videospiel.
     * 
     * @param titel
     *            Der Titel des Spiels
     * @param kommentar
     *            Ein Kommentar zum Spiel
     * @param system
     *            Die Bezeichnung des System
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    public AbstractVideospiel(String titel, String kommentar, String system)
    {
        super(titel, kommentar);
        assert system != null : "Vorbedingung verletzt: system != null";
        _system = system;
    }

    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    /**
     * Gibt das System zurück, auf dem das Spiel lauffähig ist.
     * 
     * @return Das System, auf dem das Spiel ausgeführt werden kann.
     * 
     * @ensure result != null
     */
    public String getSystem()
    {
        return _system;
    }

    @Override
    public String toString()
    {
        return getFormatiertenString();
    }

    @Override
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + super.getFormatiertenString() + "System: " + _system + "\n";
    }

    @Override
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
        assert mietTage > 0 : "Vorbedingung verletzt: mietTage > 0";
        Geldbetrag geldbetrag = Geldbetrag.get(basispreis + getPreisNachTagen(mietTage));
        return geldbetrag;
    }

    private int getPreisNachTagen(int tage)
    {
        int geldbetrag;
        if (_system.equals("Windows Vista/XP") |_system.equals(" Mac OS X 28.3.2017")|_system.equals(" Mac OS X 11.4.2017"))
        {
            if (tage > 7) {
                if ((tage-7) %5 > 0) {
                    geldbetrag = (((tage-7)/5) +1)*500;
                }
                else
                {
                    geldbetrag = ((tage-7)/5)*500;
                }
                return geldbetrag;
            } 
            else 
            {
                return 0;
            }
        } 
        else
        {
            geldbetrag = (tage/3)*700;
            return geldbetrag;
        }
    }
}
