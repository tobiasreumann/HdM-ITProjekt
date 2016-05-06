
package de.hdm.itprojekt.server;

import java.util.Date;

import de.hdm.itprojekt.shared.bo.*;

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
			
			this.suchprofilMapper = Suchprofilmapper.suchprofilMapper();
			
			this.eigenschaftMapper = EigenschaftMapper.eigenschaftMapper();
			
			this.kontaktsperreMapper = KontaktsperreMapper.kontaktsperreMapper();
			
			this.auswahllMapper = AuswahlMapper.auswahlMapper();
			
			this.beschreibungMapper = BeschreibungMapper.beschreibungMapper();
			
			this.aehnlichkeitsmassMapper = AehnlichkeitsmassMapper.aehnlichkeitsmassMapper();
			
			this.partnervorschlagMapper = PartnervorschlagMapper.PartnervorschlagMapper();
			
		}

		
		
		public Aehnlichkeitsmass berechneAehnlichkeitsmass (Profil rp, Profil vp)  {
			//TODO
			
		}
	
		public Profil getProfilNachID (int id){
			
		}
	
		public Merkzettel merkzettelAnlegen(Profil p){
			//TODO
			Merkzettel m = new Merkzettel ();
			
		}
		
		public void MerkzettelLoeschen (Profil p){
			//TODO
		}
	
		public Merkzettel zuMerkzettelHinzufuegen (Profil p){
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
				
		}
	
		public void vonMerkzettelLoeschen (Profil p){	
			//TODO
		}
	
		public Kontaktsperre kontaktsperreAnlegen (Kontaktsperre k){
			//TODO
			Kontaktsperre k1 = new Kontaktsperre ();
			
			k.getId();
			k.getGesperrt();
			
			
		}

		public void KontaktsperreLoeschen (Profil p){
			//TODO
		}
		
		public Beschreibung beschreibungEigenschaftAnlegen (Eigenschaft e){
			//TODO
			Eigenschaft e1 = new Eigenschaft ();
			
			e.getBezeichnung();
			
		}
		
		public void eigenschaftLoeschen (Auswahl a, Beschreibung b, Eigenschaft e){
			//TODO
		}
		
		public Beschreibung beschreibungEigenschaftBearbeiten (Eigenschaft e){
			
			//TODO
			
		}
		
	
		//Klasse muss angelegt werden
		 public Profil suchprofilAnlegen (){
			//TODO
			Suchprofil sp = new Suchprofil();
			}
		
		public void suchprofilLoeschen (Suchprofil sp){
			//TODO
		}
		
		public Profil suchprofilBearbeiten (){
			//TODO
	
		}
		
	
		 
		public void profilLoeschen (Profil p)throws IllegalArgumentException {
			//TODO
		}
		
		public Profil profilBearbeiten (){
			//TODO
		}
		
		public Info infoHinzufuegen (String wert, Auswahl a, Beschreibung b){
			
			Info i = new Info ();
			i.setWert(wert);
	
			//TODO
			
		}

		public void infoLoeschen (Info i){
			//TODO
		}
	
		public Info infoBearbeiten (String w, Auswahl a, Beschreibung b){
			//TODO
		}
	
		public Merkzettel getMerkzettelNachID (int id){
			//TODO
		}
	
		public Kontaktsperre getKontaktsperreNachID (int id){
			//TODO
		}
		
		public Kontaktsperre zuKontaktsperreHinzufuegen (Profil p){
			//TODO
		}
	
		public void vonKontaktsperreLoeschen (Profil p){
			//TODO
		}
	
		public Suchprofil getSuchprofilNachID (int id){
			//TODO
		}
		
		// in () muss String [] hinein
		public Auswahl AuswahlEigenschaftAnlegen (Eigenschaft e){
			//TODO
		}
		
		// in () muss String [] hinein
		public Auswahl AuswahlEigenschaftBearbeiten (Eigenschaft e){
			//TODO
		}
		
		public Partnervorschlag getPartnervorschlaege (Suchprofil sp){
			
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


