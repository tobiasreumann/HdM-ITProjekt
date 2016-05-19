
package de.hdm.itprojekt.server;
import com.google.api.server.spi.Client;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import java.util.logging.Level;
import java.util.logging.Logger;



import java.util.Date;

import de.hdm.itprojekt.shared.Administration;
import de.hdm.itprojekt.shared.bo.*;
import de.hdm.itprojekt.server.db.*;


@SuppressWarnings("serial")
public class AdministrationImpl extends RemoteServiceServlet implements Administration{

	
	

		private ProfilMapper profilMapper = null;
		
		private MerkzettelMapper merkzettelMapper = null;
		
		private SuchprofilMapper suchprofilMapper = null ;
		
		private EigenschaftMapper eigenschaftMapper = null ;
		
		private KontaktsperreMapper kontaktsperreMapper = null;
		
		private AuswahlMapper auswahlMapper  = null;
		
		private BeschreibungMapper beschreibungMapper = null;
		
		private AehnlichkeitsmassMapper aehnlichkeitsmassMapper  = null;
		
		private PartnervorschlagMapper partnervorschlagMapper  = null;
		
		private InfoMapper infoMapper = null;
		
		public AdministrationImpl() throws IllegalArgumentException {
			
		}
		
		@Override
		public void init() throws IllegalArgumentException {
			
			this.profilMapper = ProfilMapper.profilMapper();
			
			this.merkzettelMapper = MerkzettelMapper.merkzettelMapper();
			
			this.suchprofilMapper = SuchprofilMapper.suchprofilMapper();
			
			this.eigenschaftMapper = EigenschaftMapper.eigenschaftMapper();
			
			this.kontaktsperreMapper = KontaktsperreMapper.kontaktsperreMapper();
			
			this.auswahlMapper = AuswahlMapper.auswahlMapper();
			
			this.beschreibungMapper = BeschreibungMapper.beschreibungMapper();
			
			this.aehnlichkeitsmassMapper = AehnlichkeitsmassMapper.aehnlichkeitsmassMapper();
			
			this.partnervorschlagMapper = PartnervorschlagMapper.partnervorschlagMapper();
			
			this.infoMapper = InfoMapper.infoMapper();
		
		}
	

		@Override
		public Aehnlichkeitsmass berechneAehnlichkeitsmass (Profil rp, Profil vp) throws IllegalArgumentException {
			return null;
			//TODO
			
		}
		
		@Override
		public Profil getProfilNachID (int id) throws IllegalArgumentException{
			return this.profilMapper.getProfilByID(id);
			//TODO
		}

		@Override
		public Merkzettel merkzettelAnlegen(Profil p) throws IllegalArgumentException{
			//TODO
			Merkzettel m = new Merkzettel ();			
			// vorl�ufige ID
			m.setId(1);
			
			return this.merkzettelMapper.anlegen (p);
			 
		}

		
		@Override
		public void merkzettelLoeschen (Merkzettel m) throws IllegalArgumentException{
			this.merkzettelMapper.loeschen(m);
			//TODO
		}
		
		@Override
		public Merkzettel zuMerkzettelHinzufuegen (Profil rp) throws IllegalArgumentException{
			return this.merkzettelMapper.hinzufuegen (rp);
		//TODO
			
		}
		
		@Override
		public Profil profilAnlegen (String vorname, Date g, String name, String geschlecht, boolean raucher, String haarfarbe, int k, String religion)
		throws IllegalArgumentException{
			//Verweis auf Fremndschl�ssel fehlt 
			Profil p = new Profil ();
			//TODO
			
			
			p.setName(name);
			p.setVorname(vorname);
			p.setGeschlecht(geschlecht);
			p.setGroesse(k);
			p.setHaarfarbe (haarfarbe);
			p.setRaucher(raucher);
			p.setReligion(religion);
			p.setGeburtsdatum(g);	
			//TODO
			//Email muss noch zum setten hin
			
			ServersideSettings.getLogger();
			ServersideSettings.getLogger().info("Profil " + p.getVorname() +  " p.getName"+ " angelegt");
			
			// vorl�ufige ID gesetzt
			p.setId(1);
			
			return this.profilMapper.anlegen (p);
			
			 
				
		}
		
		@Override
		public void vonMerkzettelLoeschen (Profil p) throws IllegalArgumentException{	
			this.merkzettelMapper.entfernen (p);
		}
	
		
		@Override
		public Kontaktsperre kontaktsperreAnlegen (Kontaktsperre k) throws IllegalArgumentException{
			//TODO
			Kontaktsperre k1 = new Kontaktsperre ();
			
			k.setId(1);
			k.getGesperrt();
			return this.kontaktsperreMapper.anlegen(k);
			
			
		}
	
		@Override
		public void kontaktsperreLoeschen (Profil p) throws IllegalArgumentException{
			this.kontaktsperreMapper.loeschen (p);

		}
		
		@Override
		public Beschreibung beschreibungEigenschaftAnlegen (Eigenschaft e) throws IllegalArgumentException{
			//TODO
			Eigenschaft e1 = new Eigenschaft ();
			
			e.getBezeichnung();
			return this.beschreibungMapper.anlegen();
		}
		
		@Override
		public void eigenschaftLoeschen (Auswahl a, Beschreibung b, Eigenschaft e) throws IllegalArgumentException{
			//TODO
			this.eigenschaftMapper.loeschen();
		}
		
		@Override
		public Beschreibung beschreibungEigenschaftBearbeiten (Eigenschaft e) throws IllegalArgumentException{
			return this.beschreibungMapper.bearbeiten(e);
			//TODO
			
		}
		
//		@Override
//		public Profil suchprofilAnlegen () throws IllegalArgumentException{
//			Suchprofil sp = new Suchprofil();
//			return this.suchprofilMapper.anlegen (sp);
//
//		}
//		
//		@Override
		public void suchprofilLoeschen (Suchprofil sp) throws IllegalArgumentException{
			//TODO
			this.suchprofilMapper.loeschen(sp);
		}
		
		@Override
		public Profil suchprofilBearbeiten () throws IllegalArgumentException{
			return this.suchprofilMapper.bearbeiten();
			//TODO
	
		}
		
		@Override
		public void profilLoeschen (Profil p)throws IllegalArgumentException {
			//TODO
			this.profilMapper.loeschen(p);
		}
		
//		public Profil profilBearbeiten (Profil p) throws IllegalArgumentException{
//			//TODO
//			return this.profilMapper.bearbeiten();
//		}
//		
		
		@Override
		public Info infoHinzufuegen (String wert, Auswahl a, Beschreibung b) throws IllegalArgumentException{
			//TODO
			Info i = new Info ();
			i.setWert(wert);
			
	
			return this.infoMapper.anlegen();
		}
		
		@Override
		public void infoLoeschen (Info i) throws IllegalArgumentException{
			this.infoMapper.loeschen(i);
			//TODO
		}
	
		@Override
		public Info infoBearbeiten (String w, Auswahl a, Beschreibung b) throws IllegalArgumentException{
			//TODO
			return this.infoMapper.bearbeiten();
		}
	
		@Override
		public Merkzettel getMerkzettelNachID (int id) throws IllegalArgumentException{
			return this.merkzettelMapper.getByID(id);
			//TODO
		
		}
	
		@Override
		public Kontaktsperre getKontaktsperreNachID (int id) throws IllegalArgumentException{
			//TODO
			return this.kontaktsperreMapper.getByID(id);
		}
		
		@Override
		public Kontaktsperre zuKontaktsperreHinzufuegen (Profil p) throws IllegalArgumentException{
			//TODO
			return this.kontaktsperreMapper.hinzufuegen(p);
		}
		
		@Override
		public void vonKontaktsperreLoeschen (Profil p) throws IllegalArgumentException{
			this.kontaktsperreMapper.entfernen(p);
			//TODO
		}
		
//		@Override
//		public Suchprofil getSuchprofilNachID (int id) throws IllegalArgumentException{
//			//TODO
//			return this.suchprofilMapper.getSuchprofilByID(id);
//		}
//		
//		@Override
		public Auswahl AuswahlEigenschaftAnlegen (Eigenschaft e) throws IllegalArgumentException{
			return this.auswahlMapper.anlegen();
			//TODO
		}
		
		@Override
		public Auswahl AuswahlEigenschaftBearbeiten (Eigenschaft e) throws IllegalArgumentException{
			return this.eigenschaftMapper.bearbeiten();
			
		}
		
		@Override
		public Partnervorschlag getPartnervorschlaege (Suchprofil sp) throws IllegalArgumentException{
			return this.partnervorschlagMapper.getPartnervorschlaege();
			//TODO
		
		}

		@Override
		public Profil profilBearbeiten() throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Profil suchprofilAnlegen() throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Suchprofil getSuchprofilNachID(int id) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return null;
		}



		
		/*
		 * 
		 * 
		 * Login Methode
		 * 
		 * Logout Methode
		 */
		
		
		
		
	}


