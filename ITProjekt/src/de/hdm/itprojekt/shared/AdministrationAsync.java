package de.hdm.itprojekt.shared;

import java.util.Date;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.itprojekt.shared.bo.*;

public interface AdministrationAsync {
	
	void init(AsyncCallback<Void> callback);

	void AuswahlEigenschaftAnlegen(Eigenschaft e,
			AsyncCallback<Auswahl> callback);

	void AuswahlEigenschaftBearbeiten(Eigenschaft e,
			AsyncCallback<Auswahl> callback);

	void berechneAehnlichkeitsmass(Profil rp, Profil vp,
			AsyncCallback<Aehnlichkeitsmass> callback);

	void beschreibungEigenschaftAnlegen(Eigenschaft e,
			AsyncCallback<Beschreibung> callback);

	void beschreibungEigenschaftBearbeiten(Eigenschaft e,
			AsyncCallback<Beschreibung> callback);

	void eigenschaftLoeschen(Auswahl a, Beschreibung b, Eigenschaft e,
			AsyncCallback<Void> callback);

	void getKontaktsperreNachID(int id, AsyncCallback<Kontaktsperre> callback);

	void getMerkzettelNachID(int id, AsyncCallback<Merkzettel> callback);

	void getPartnervorschlaege(Suchprofil sp,
			AsyncCallback<Partnervorschlag> callback);

	void getProfilNachID(int id, AsyncCallback<Profil> callback);

	void infoHinzufuegen(String wert, Auswahl a, Beschreibung b,
			AsyncCallback<Info> callback);

	void getSuchprofilNachID(int id, AsyncCallback<Suchprofil> callback);

	void infoBearbeiten(String w, Auswahl a, Beschreibung b,
			AsyncCallback<Info> callback);

	void infoLoeschen(Info i, AsyncCallback<Void> callback);

	void kontaktsperreLoeschen(Profil p, AsyncCallback<Void> callback);

	void kontaktsperreAnlegen(Kontaktsperre k,
			AsyncCallback<Kontaktsperre> callback);

	void merkzettelAnlegen(Profil p, AsyncCallback<Merkzettel> callback);

	void merkzettelLoeschen(Merkzettel m, AsyncCallback<Void> callback);

	void profilAnlegen(String vorname, Date g, String name, String geschlecht,
			boolean raucher, String haarfarbe, int k, String religion,
			AsyncCallback<Profil> callback);

	void profilBearbeiten(AsyncCallback<Profil> callback);

	void suchprofilAnlegen(AsyncCallback<Profil> callback);

	void profilLoeschen(Profil p, AsyncCallback<Void> callback);

	void suchprofilBearbeiten(AsyncCallback<Profil> callback);

	void vonMerkzettelLoeschen(Profil p, AsyncCallback<Void> callback);

	void vonKontaktsperreLoeschen(Profil p, AsyncCallback<Void> callback);

	void zuKontaktsperreHinzufuegen(Profil p,
			AsyncCallback<Kontaktsperre> callback);

	void suchprofilLoeschen(Suchprofil sp, AsyncCallback<Void> callback);

	void zuMerkzettelHinzufuegen(Profil p, AsyncCallback<Merkzettel> callback);
	

}
