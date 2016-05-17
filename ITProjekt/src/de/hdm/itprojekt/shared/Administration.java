package de.hdm.itprojekt.shared;

import java.util.Date;

import de.hdm.itprojekt.shared.bo.*;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


//@RemoteServiceRelativePath("Administration")
public interface Administration extends RemoteService{

	public void init ()throws IllegalArgumentException;

	public Aehnlichkeitsmass berechneAehnlichkeitsmass (Profil rp, Profil vp);
	
	public Profil getProfilNachID (int id)throws IllegalArgumentException;

	public Merkzettel merkzettelAnlegen(Profil p) throws IllegalArgumentException;
	
	public void merkzettelLoeschen (Merkzettel m)throws IllegalArgumentException;

	public Merkzettel zuMerkzettelHinzufuegen (Profil p)throws IllegalArgumentException;
	
	public Profil profilAnlegen (String vorname, Date g, String name, String geschlecht, 
			boolean raucher, String haarfarbe, int k, String religion)throws IllegalArgumentException;

	public void vonMerkzettelLoeschen (Profil p)throws IllegalArgumentException;

	public Kontaktsperre kontaktsperreAnlegen (Kontaktsperre k)throws IllegalArgumentException;

	public void kontaktsperreLoeschen (Profil p)throws IllegalArgumentException;
	
	public Beschreibung beschreibungEigenschaftAnlegen (Eigenschaft e)throws IllegalArgumentException;
	
	public void eigenschaftLoeschen (Auswahl a, Beschreibung b, Eigenschaft e)throws IllegalArgumentException;
	
	public Beschreibung beschreibungEigenschaftBearbeiten (Eigenschaft e)throws IllegalArgumentException;
	
	public Profil suchprofilAnlegen ()throws IllegalArgumentException;
	
	public void suchprofilLoeschen (Suchprofil sp)throws IllegalArgumentException;
	
	public Profil suchprofilBearbeiten ()throws IllegalArgumentException;
	
	public void profilLoeschen (Profil p)throws IllegalArgumentException;
	

	public Profil profilBearbeiten ()throws IllegalArgumentException;



	
	public Info infoHinzufuegen (String wert, Auswahl a, Beschreibung b)throws IllegalArgumentException;

	public void infoLoeschen (Info i)throws IllegalArgumentException;

	public Info infoBearbeiten (String w, Auswahl a, Beschreibung b)throws IllegalArgumentException;

	public Merkzettel getMerkzettelNachID (int id)throws IllegalArgumentException;

	public Kontaktsperre getKontaktsperreNachID (int id)throws IllegalArgumentException;
	
	public Kontaktsperre zuKontaktsperreHinzufuegen (Profil p)throws IllegalArgumentException;

	public void vonKontaktsperreLoeschen (Profil p)throws IllegalArgumentException;
	
	public Suchprofil getSuchprofilNachID (int id)throws IllegalArgumentException;
	
	public Auswahl AuswahlEigenschaftAnlegen (Eigenschaft e)throws IllegalArgumentException;
	
	public Auswahl AuswahlEigenschaftBearbeiten (Eigenschaft e)throws IllegalArgumentException;
	
	public Partnervorschlag getPartnervorschlaege (Suchprofil sp)throws IllegalArgumentException;
}
