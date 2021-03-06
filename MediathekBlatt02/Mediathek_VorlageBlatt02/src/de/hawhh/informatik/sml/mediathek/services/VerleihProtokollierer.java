package de.hawhh.informatik.sml.mediathek.services;
import java.io.FileWriter;
import java.io.IOException;

import de.hawhh.informatik.sml.mediathek.fachwerte.Verleihkarte;
import de.hawhh.informatik.sml.mediathek.services.exceptions.ProtokollierException;

/**
 * Der VerleihProtokollierer protokolliert die Verleihereignisse der Mediathek.
 * 
 * @author Maximilian Mang, Frederic Dlugi
 * @version SoSe 2017
 *
 */
public class VerleihProtokollierer
{
	
	/**
	 * Protokolliert den Verleihvorgang: Das Ereignis wird in die Datei ./protokoll.txt geschrieben
	 * @param ereignis
	 * Das Ereignis, dass protokolliert werden soll AUSLEIHE oder RUECKGABE.
	 * @param verleihkarte
	 * Die Verleihkarte um die es bei dem Ereignis geht.
	 * @throws ProtokollierException
	 * Wenn es einen Fehler beim protokollieren gibt.
	 */
	public void protokolliere(VerleihEreignis ereignis, Verleihkarte verleihkarte) throws ProtokollierException
	{
		try(FileWriter writer = new FileWriter("./protokoll.txt", true))
		{
			writer.write(ereignis+ ": " + verleihkarte);
			
		} catch (IOException e)
		{
			throw new ProtokollierException("Es gab einen Fehler beim protokollieren des Verleihereignisses.\n(Möglicherweise ist die Datei protokolliere.txt schreibgeschützt.)");
		}
	}
}
