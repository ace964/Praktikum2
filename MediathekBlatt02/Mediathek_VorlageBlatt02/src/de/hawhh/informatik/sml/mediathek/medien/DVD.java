package de.hawhh.informatik.sml.mediathek.medien;

/**
 * Eine {@link DVD} ist ein Medium. ZusÃ¤tzlich zu den Eigenschaften eines
 * {@link Medium}s erfasst sie Informationen zum Regisseur und zur Laufzeit.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2017
 * 
 */
public class DVD extends AbstractMedium
{
    private int _laufzeit; // Die Laufzeit des Hauptteils der DVD (in Minuten).

    private String _regisseur; // Der Regisseur des Inhalts der DVD.

    /**
     * Initialisiert eine neue DVD mit den gegebenen Daten.
     * 
     * @param titel Der Titel der DVD.
     * @param kommentar Ein Kommentar zu der DVD.
     * @param regisseur Der Regisseur des Inhalts der DVD.
     * @param laufzeit Die Laufzeit des Hauptteils der DVD in Minuten.
     * 
     * @require titel != null
     * @require kommentar != null
     * @require regisseur != null
     * @require laufzeit > 0
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getRegisseur() == regisseur
     * @ensure getLaufzeit() == laufzeit
     */
    public DVD(String titel, String kommentar, String regisseur, int laufzeit)
    {
        super(titel, kommentar);
        assert laufzeit > 0 : "Vorbedingung verletzt: laufzeit > 0";
        assert regisseur != null : "Vorbedingung verletzt: regisseur != null";
        _regisseur = regisseur;
        _laufzeit = laufzeit;
    }

    /**
     * Gibt die Laufzeit der DVD (in Minuten) zurÃ¼ck.
     * 
     * @return Die Laufzeit der DVD in Minuten.
     * 
     * @ensure result > 0
     */
    public int getLaufzeit()
    {
        assert _laufzeit > 0 : "Nachbedingung verletzt: result > 0";
        return _laufzeit;
    }

    /**
     * Ã„ndert die Laufzeit der DVD
     * 
     * @param laufzeit Die Laufzeit der DVD in Minuten.
     * 
     * @require laufzeit > 0
     * @ensure getLaufzeit() == laufzeit
     */
    public void setLaufzeit(int laufzeit)
    {
        assert laufzeit > 0 : "Vorbedingung verletzt: laufzeit > 0";
        _laufzeit = laufzeit;
    }

    @Override
    public String getMedienBezeichnung()
    {
        return "DVD";
    }

    /**
     * Gibt den Regisseur der DVD zurÃ¼ck
     * 
     * @return Den Regisseur der DVD
     * 
     * @ensure result != null
     */
    public String getRegisseur()
    {
        assert _regisseur != null : "Nachbedingung verletzt: result !=null";
        return _regisseur;
    }

    /**
     * Ã„ndert den Regisseur der DVD
     * 
     * @param regisseur Der Regisseur der DVD.
     * 
     * @require regisseur != null
     * @ensure getRegisseur() == regisseur
     */
    public void setRegisseur(String regisseur)
    {
        assert regisseur != null : "Vorbedingung verletzt: regisseur != null";
        _regisseur = regisseur;
    }

    @Override
    public String getFormatiertenString()
    {
        return super.getFormatiertenString()
                + "Regisseur: " + _regisseur + "\n" + 
        		"    " + "Laufzeit: " + _laufzeit + "\n";
    }

}
