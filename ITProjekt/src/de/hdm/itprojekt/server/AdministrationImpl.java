
package de.hdm.itprojekt.server;

import de.hdm.itprojekt.shared.bo.*;

public class AdministrationImpl {

	public static void main(String[] args) {
		

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

		
		
		public Aehnlichkeitsmass berechneAehnlichkeitsmass (Profil, Profil)  {
			
			
		}
	
		public Profil getProfilNachID (int){
			
		}
	
		public Merkzettel merkzettelAnlegen(Profil){
			
			Merkzettel m = new Merkzettel ();
			
		}
		
		public void MerkzettelLoeschen (Profil){
			
		}
	
		public Merkzettel zuMerkzettelHinzufuegen (Profil){
			
		
			
		}
		
	public Profil profilAnlegen (String, Date, String, String boolean, String, float, String){
			
			Profil p = new Profil ();
			
			p.setName();
			p.setVorname();
			p.setGeschlecht();
			p.setKoerpergroesse();
			p.setHaarfarbe ();
			
			p.setId(id);
			
		
		
			
		}
		public void vonMerkzettelLoeschen (Profil){	
			
		}
	
		public Kontaktsperre kontaktsperreAnlegen (Kontaktsperre){
			
			Kontaktsperre k = new Kontaktsperre ();
			
			k.getId();
			k.getGesperrt();
			
			
		}

		public void KontaktsperreLoeschen (Profil){
			
		}
		
		public Beschreibung beschreibungEigenschaftAnlegen (Eigenschaft){
			
			Eigenschaft e = new Eigenschaft ();
			
			e.getBezeichnung();
			
		}
		
		public void eigenschaftLoeschen (Auswahl, Beschreibung, Eigenschaft){
			
		}
		
		public Beschreibung beschreibungEigenschaftBearbeiten (Eigenschaft){
			
			
			
		}
		
	
		//Klasse muss angelegt werden
		 public Profil suchprofilAnlegen (String, boolean, String, int, String, int){
			
			Suchprofil sp = new Suchprofil;
			}
		
		public void suchprofilLoeschen (Suchprofil){
			
		}
		
		public Profil suchprofilBearbeiten (String, boolean, String, int, String, int){
			
	
		}
		
	
		 
		public void profilLoeschen (Profil p)throws IllegalArgumentException{
			
		}
		
		public Profil profilBearbeiten (String, Date, String, String boolean, String, float, String){
			
		}
		
		public Info infoHinzufuegen (String, Auswahl, Beschreibung){
			
			Info i = new info ();
			i.setWert(wert);
	
			
			
		}

		public void infoLoeschen (Info){
			
		}
	
		public Info infoBearbeiten (String, Auswahl, Beschreibung){
			
		}
	
		public Merkzettel getMerkzettelNachID (int){
			
		}
	
		public Kontaktsperre getKontaktsperreNachID (int){
			
		}
		
		public Kontaktsperre zuKontaktsperreHinzufuegen (Profil){
			
		}
	
		public void vonKontaktsperreLoeschen (Profil){
			
		}
	
		public Suchprofil getSuchprofilNachID (int){
			
		}
		
		// in () muss String [] hinein
		public Auswahl AuswahlEigenschaftAnlegen (Eigenschaft){
			
		}
		
		// in () muss String [] hinein
		public Auswahl AuswahlEigenschaftBearbeiten (Eigenschaft){
			
		}
		
		public Partnervorschlag getPartnervorschlaege (Suchprofil){
			

		}

		
		/*
		 * Editorimple Methode
		 * 
		 * Login Methode
		 * 
		 * Logout Methode
		 */
		
		
		
		
	}


