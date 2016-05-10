
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

		
		
		public Aehnlichkeitsmass berechneAehnlichkeitsmass (Profil rp, Profil vp)  {
			return null;
			//TODO
			
		}
	
		public Profil getProfilNachID (int id){
			return this.profilMapper.getByID(id);
			
		}
	
		public Merkzettel merkzettelAnlegen(Profil p){
			//TODO
			Merkzettel m = new Merkzettel ();
			return null;
		}
/*		
	public void MerkzettelLoeschen (Profil p){
			//TODO
			if (merkzettel  != null){
				for (Merkzettel m : merkzettel){
					this.MerkzettelLoeschen(p);
					
				}
			}
			this.merkzettelMapper = null;
		}
*/	
		public Merkzettel zuMerkzettelHinzufuegen (Profil p){
			return null;
			//TODO
		
			
		}
		
	public Profil profilAnlegen (String vorname, Date g, String name, String geschlecht, boolean raucher, String haarfarbe, int k, String religion){
			//TODO
			Profil p = new Profil ();
			
			p.setName(name);
			p.setVorname(vorname);
			p.setGeschlecht(geschlecht);
			p.setKoerpergroesse(k);
			p.setHaarfarbe (haarfarbe);
			p.setRaucher(raucher);
			p.setReligion(religion);
			p.setGeburtsdatum(g);
			return null;
				
		}
	
		public void vonMerkzettelLoeschen (Profil p){	
			//TODO
		}
	
		public Kontaktsperre kontaktsperreAnlegen (Kontaktsperre k){
			//TODO
			Kontaktsperre k1 = new Kontaktsperre ();
			
			k.getId();
			k.getGesperrt();
			return null;
			
			
		}

		public void KontaktsperreLoeschen (Profil p){
			//TODO
		}
		
		public Beschreibung beschreibungEigenschaftAnlegen (Eigenschaft e){
			//TODO
			Eigenschaft e1 = new Eigenschaft ();
			
			e.getBezeichnung();
			return null;
		}
		
		public void eigenschaftLoeschen (Auswahl a, Beschreibung b, Eigenschaft e){
			//TODO
		}
		
		public Beschreibung beschreibungEigenschaftBearbeiten (Eigenschaft e){
			return null;
			//TODO
			
		}
		
	
		//Klasse muss angelegt werden
		 public Profil suchprofilAnlegen (){
			//TODO
			Suchprofil sp = new Suchprofil();
			return null;
			}
		
		public void suchprofilLoeschen (Suchprofil sp){
			//TODO
		}
		
		public Profil suchprofilBearbeiten (){
			return null;
			//TODO
	
		}
		
	
		 
		public void profilLoeschen (Profil p)throws IllegalArgumentException {
			//TODO
		}
		
		public Profil profilBearbeiten (){
			//TODO
			return null;
		}
		
		public Info infoHinzufuegen (String wert, Auswahl a, Beschreibung b){
			
			Info i = new Info ();
			i.setWert(wert);
	
			//TODO
			return null;
		}

		public void infoLoeschen (Info i){
			//TODO
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
	
		public void vonKontaktsperreLoeschen (Profil p){
			//TODO
		}
	
		public Suchprofil getSuchprofilNachID (int id){
			//TODO
			return null;
		}
		
		// in () muss String [] hinein
		public Auswahl AuswahlEigenschaftAnlegen (Eigenschaft e){
			//TODO
			return null;
		}
		
		// in () muss String [] hinein
		public Auswahl AuswahlEigenschaftBearbeiten (Eigenschaft e){
			//TODO
			return null;
			
		}
		
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


