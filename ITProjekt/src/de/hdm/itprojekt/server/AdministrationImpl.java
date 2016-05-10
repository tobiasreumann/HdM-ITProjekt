
package de.hdm.itprojekt.server;

import java.util.Date;

import de.hdm.itprojekt.shared.bo.*;
import de.hdm.itprojekt.server.db.*;

public class AdministrationImpl {

	public static void main(String[] args) {
		
	}

		private  ProfilMapper profilMapper = null;
		
		private  MerkzettelMapper merkzettelMapper = null;
		
		private SuchprofilMapper suchprofilMapper = null ;
		
		private EigenschaftMapper eigenschaftMapper = null ;
		
		private  KontaktsperreMapper kontaktsperreMapper = null;
		
		private  AuswahlMapper auswahlMapper  = null;
		
		private  BeschreibungMapper beschreibungMapper = null;
		
		private  AehnlichkeitsmassMapper aehnlichkeitsmassMapper  = null;
		
		private  PartnervorschlagMapper partnervorschlagMapper  = null;
		
		public void init() throws IllegalArgumentException {
			
			this.profilMapper = ProfilMapper.profilMapper();
			
			this.merkzettelMapper = MerkzettelMapper.merkzettelMapper();
			
			this.suchprofilMapper = SuchprofilMapper.suchprofilMapper();
			
			this.eigenschaftMapper = EigenschaftMapper.eigenschaftMapper();
			
			this.kontaktsperreMapper = KontaktsperreMapper.kontaktsperreMapper();
			
			this.auswahlMapper = AuswahlMapper.auswahlMapper();
			
			this.beschreibungMapper = BeschreibungMapper.beschreibungMapper();
			
			this.aehnlichkeitsmassMapper = AehnlichkeitsmassMapper.aehnlichkeitsmassMapper();
			
			this.partnervorschlagMapper = PartnervorschlagMapper.PartnervorschlagMapper();
		
		}
		
		//TODO
		public Aehnlichkeitsmass berechneAehnlichkeitsmass (Profil rp, Profil vp)  {
			return null;
			
			
		}
		
		//TODO
		public Profil getProfilNachID (int id){
			return this.profilMapper.getByID(id);
			
		}

		public Merkzettel merkzettelAnlegen(Profil p){
			//TODO
			Merkzettel m = new Merkzettel ();			
			// vorläufige ID
			m.setId(1);
			
			return this.merkzettelMapper.insert (p);
			 
		}

		
//TODO	
	public void MerkzettelLoeschen (Merkzettel m){
			this.merkzettelMapper.loeschen(m);
		}
		
		//TODO
		public Merkzettel zuMerkzettelHinzufuegen (Profil rp){
			return this.merkzettelMapper.insert (rp);
		
			
		}
		
		//TODO
	public Profil profilAnlegen (String vorname, Date g, String name, String geschlecht, boolean raucher, String haarfarbe, int k, String religion){
			//Verweis auf Fremndschlüssel fehlt 
			Profil p = new Profil ();
			
			
			
			p.setName(name);
			p.setVorname(vorname);
			p.setGeschlecht(geschlecht);
			p.setKoerpergroesse(k);
			p.setHaarfarbe (haarfarbe);
			p.setRaucher(raucher);
			p.setReligion(religion);
			p.setGeburtsdatum(g);			
			
			// vorläufige ID gesetzt
			p.setId(1);
			
			return this.profilMapper.insert (p);
			 
				
		}
		
		public void vonMerkzettelLoeschen (Profil p) {	
			this.merkzettelMapper.vonMerkzettelLoeschen (p);
		}
	
		
		//Fertig
		public Kontaktsperre kontaktsperreAnlegen (Kontaktsperre k){
			//TODO
			Kontaktsperre k1 = new Kontaktsperre ();
			
			k.setId(1);
			k.getGesperrt();
			return this.kontaktsperreMapper.insert(k);
			
			
		}
	
		//Fertig
		public void kontaktsperreLoeschen (Profil p){
			this.kontaktsperreMapper.kontaktsperreLoeschen (p);

		}
		//Fertig
		public Beschreibung beschreibungEigenschaftAnlegen (Eigenschaft e){
			//TODO
			Eigenschaft e1 = new Eigenschaft ();
			
			e.getBezeichnung();
			return this.eigenschaftMapper.insert;
		}
		
		public void eigenschaftLoeschen (Auswahl a, Beschreibung b, Eigenschaft e){
			//TODO
			this.eigenschaftMapper.loeschen();
		}
		
		public Beschreibung beschreibungEigenschaftBearbeiten (Eigenschaft e){
			return this.eigenschaftMapper.bearbeiten(e);
			//TODO
			
		}
		
		 public Profil suchprofilAnlegen (){
			Suchprofil sp = new Suchprofil();
			return this.profilMapper.insert (sp);

			}
		
		public void suchprofilLoeschen (Suchprofil sp){
			//TODO
			this.suchprofilMapper.loeschen(sp);
		}
		
		//TODO
		public Profil suchprofilBearbeiten (){
			return this.suchprofilMapper.bearbeiten();
			
	
		}
		

		 
		public void profilLoeschen (Profil p)throws IllegalArgumentException {
			//TODO
			this.profilMapper.loeschen(p);
		}
		
		public Profil profilBearbeiten (){
			//TODO
			return this.profilMapper.bearbeiten();
		}
		
		//TODO
		public Info infoHinzufuegen (String wert, Auswahl a, Beschreibung b){
			
			Info i = new Info ();
			i.setWert(wert);
			
	
			return null;
		}
		//TODO
		public void infoLoeschen (Info i){
		}
	
		public Info infoBearbeiten (String w, Auswahl a, Beschreibung b){
			//TODO
			return null;
		}
	
		public Merkzettel getMerkzettelNachID (int id){
			return null;
			//TODO
		
		}
	
		public Kontaktsperre getKontaktsperreNachID (int id){
			//TODO
			return null;
		}
		
		public Kontaktsperre zuKontaktsperreHinzufuegen (Profil p){
			//TODO
			return null;
		}
		
		//TODO
		public void vonKontaktsperreLoeschen (Profil p){
			
		}
		
		//TODO
		public Suchprofil getSuchprofilNachID (int id){
	
			return null;
		}
		
		//TODO
		public Auswahl AuswahlEigenschaftAnlegen (Eigenschaft e){
			return null;
		}
		
		//JOEL
		//TODO
		/*
		// in () muss String [] hinein
		public Auswahl AuswahlEigenschaftBearbeiten (Eigenschaft e){
			return null;
			
		}
		*/
		//TODO
		public Partnervorschlag getPartnervorschlaege (Suchprofil sp){
			return null;
			//TODO
		}

		
		/*
		 * Editorimple Methode
		 * 
		 * Login Methode
		 * 
		 * Logout Methode
		 */
		
		
		
		
	}


