package de.hdm.itprojekt.shared;

import java.util.Date;

import de.hdm.itprojekt.shared.bo.*;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


//@RemoteServiceRelativePath("Administration")
public interface Administration extends RemoteService{

	public void init();

	public Aehnlichkeitsmass berechneAehnlichkeitsmass (Profil rp, Profil vp);
	
	public Profil getProfilNachID (int id);

	public Merkzettel merkzettelAnlegen(Profil p);
	
	public void merkzettelLoeschen (Merkzettel m);

	public Merkzettel zuMerkzettelHinzufuegen (Profil p);
	
	public Profil profilAnlegen (String vorname, Date g, String name, String geschlecht, boolean raucher, String haarfarbe, int k, String religion);

	public void vonMerkzettelLoeschen (Profil p);

	public Kontaktsperre kontaktsperreAnlegen (Kontaktsperre k);

	public void kontaktsperreLoeschen (Profil p);
	
	public Beschreibung beschreibungEigenschaftAnlegen (Eigenschaft e);
	
	public void eigenschaftLoeschen (Auswahl a, Beschreibung b, Eigenschaft e);
	
	public Beschreibung beschreibungEigenschaftBearbeiten (Eigenschaft e);
	
	public Profil suchprofilAnlegen ();
	
	public void suchprofilLoeschen (Suchprofil sp);
	
	public Profil suchprofilBearbeiten ();
	
	public void profilLoeschen (Profil p);
	
	Profil profilBearbeiten(Profil p);
	
	public Info infoHinzufuegen (String wert, Auswahl a, Beschreibung b);

	public void infoLoeschen (Info i);

	public Info infoBearbeiten (String w, Auswahl a, Beschreibung b);

	public Merkzettel getMerkzettelNachID (int id);

	public Kontaktsperre getKontaktsperreNachID (int id);
	
	public Kontaktsperre zuKontaktsperreHinzufuegen (Profil p);

	public void vonKontaktsperreLoeschen (Profil p);
	
	public Suchprofil getSuchprofilNachID (int id);
	
	public Auswahl AuswahlEigenschaftAnlegen (Eigenschaft e);
	
	public Auswahl AuswahlEigenschaftBearbeiten (Eigenschaft e);
	
	public Partnervorschlag getPartnervorschlaege (Suchprofil sp);
}
